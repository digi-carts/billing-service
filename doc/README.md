# billing-service

Order invoices (bills) and store bill templates. Port **3011**, schema **`billing_svc`**.

Platform design: [System design](https://github.com/digi-carts/doc/blob/main/architecture/system-design.md)

## Domain

A `Bill` is keyed by client-supplied `id`, unique `order_id`, `store_id`, JSON `items`, money fields (subtotal, delivery, packing, GST percent/amount, coupon discount, total), `status` (default `DRAFT`), and optional `pdf_url`. Merchant UI uses jsPDF client-side today; server PDF generation is a planned follow-up.

`BillTemplate` stores per-store layout/branding for invoices.

Gateway: `/api/billing/**`, `/api/bills/**`. Controllers: `/bills`, `/bill-templates`.

## Tech stack

Java 21, Spring Boot 3.3.0, Web, JPA, Liquibase, PostgreSQL.

## HTTP API

### Bills — `/bills`

| Method | Path |
|--------|------|
| GET | `/bills` | Optional filters in service layer |
| GET | `/bills/{id}` |
| GET | `/bills/order/{orderId}` |
| POST | `/bills` |
| PUT | `/bills/{id}` |
| DELETE | `/bills/{id}` |

### Templates — `/bill-templates`

CRUD plus `GET /bill-templates/store/{storeId}`.

### Health

`GET /health`

## Configuration

| Variable | Required | Default |
|----------|----------|---------|
| `DATABASE_URL` | yes | schema `billing_svc` |
| `PORT` | no | `3011` |

## Local run

```bash
export DATABASE_URL="jdbc:postgresql://localhost:5432/digicarts?currentSchema=billing_svc"
mvn spring-boot:run
```

## CI/CD

`digi-cart-billing-service-dev` / `digi-cart-billing-service`.

## Related

- [order-service](https://github.com/digi-carts/order-service/blob/stage/doc/README.md)
- [offer-service](https://github.com/digi-carts/offer-service/blob/stage/doc/README.md)
- [merchant-ui](https://github.com/digi-carts/merchant-ui/blob/stage/doc/README.md) orders/bills, templates/bills
