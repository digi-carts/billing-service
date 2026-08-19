package com.digicart.billing.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;

/**
 * JPA entity mapped in this service schema (Bill).
 */
@Entity
@Table(name = "bills", schema = "billing_svc")
@EntityListeners(AuditingEntityListener.class)
public class Bill {

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "order_id", nullable = false, unique = true)
    private String orderId;

    @Column(name = "store_id", nullable = false)
    private String storeId;

    @Column(name = "items", nullable = false, columnDefinition = "jsonb")
    private String items;

    @Column(name = "subtotal", nullable = false)
    private Double subtotal;

    @Column(name = "delivery_charge", nullable = false)
    private Double deliveryCharge = 0.0;

    @Column(name = "packing_charge", nullable = false)
    private Double packingCharge = 0.0;

    @Column(name = "gst_percent", nullable = false)
    private Double gstPercent = 0.0;

    @Column(name = "gst_amount", nullable = false)
    private Double gstAmount = 0.0;

    @Column(name = "coupon_discount", nullable = false)
    private Double couponDiscount = 0.0;

    @Column(name = "total", nullable = false)
    private Double total;

    @Column(name = "status", nullable = false)
    private String status = "DRAFT";

    @Column(name = "pdf_url")
    private String pdfUrl;

    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    @LastModifiedDate
    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;

    /**
     * Creates a new {@code Bill}.
     */
    public Bill() {}
    /**
     * Returns id.
     * @return the string
     */
    public String getId() { return id; }
    /**
     * Sets id.
     *
     * @param id resource identifier
     */
    public void setId(String id) { this.id = id; }
    /**
     * Returns order id.
     * @return the string
     */
    public String getOrderId() { return orderId; }
    /**
     * Sets order id.
     *
     * @param orderId order identifier
     */
    public void setOrderId(String orderId) { this.orderId = orderId; }
    /**
     * Returns store id.
     * @return the string
     */
    public String getStoreId() { return storeId; }
    /**
     * Sets store id.
     *
     * @param storeId store (tenant) identifier
     */
    public void setStoreId(String storeId) { this.storeId = storeId; }
    /**
     * Returns items.
     * @return the string
     */
    public String getItems() { return items; }
    /**
     * Sets items.
     *
     * @param items items
     */
    public void setItems(String items) { this.items = items; }
    /**
     * Returns subtotal.
     * @return the double
     */
    public Double getSubtotal() { return subtotal; }
    /**
     * Sets subtotal.
     *
     * @param subtotal subtotal
     */
    public void setSubtotal(Double subtotal) { this.subtotal = subtotal; }
    /**
     * Returns delivery charge.
     * @return the double
     */
    public Double getDeliveryCharge() { return deliveryCharge; }
    /**
     * Sets delivery charge.
     *
     * @param deliveryCharge delivery charge
     */
    public void setDeliveryCharge(Double deliveryCharge) { this.deliveryCharge = deliveryCharge; }
    /**
     * Returns packing charge.
     * @return the double
     */
    public Double getPackingCharge() { return packingCharge; }
    /**
     * Sets packing charge.
     *
     * @param packingCharge packing charge
     */
    public void setPackingCharge(Double packingCharge) { this.packingCharge = packingCharge; }
    /**
     * Returns gst percent.
     * @return the double
     */
    public Double getGstPercent() { return gstPercent; }
    /**
     * Sets gst percent.
     *
     * @param gstPercent gst percent
     */
    public void setGstPercent(Double gstPercent) { this.gstPercent = gstPercent; }
    /**
     * Returns gst amount.
     * @return the double
     */
    public Double getGstAmount() { return gstAmount; }
    /**
     * Sets gst amount.
     *
     * @param gstAmount gst amount
     */
    public void setGstAmount(Double gstAmount) { this.gstAmount = gstAmount; }
    /**
     * Returns coupon discount.
     * @return the double
     */
    public Double getCouponDiscount() { return couponDiscount; }
    /**
     * Sets coupon discount.
     *
     * @param couponDiscount coupon discount
     */
    public void setCouponDiscount(Double couponDiscount) { this.couponDiscount = couponDiscount; }
    /**
     * Returns total.
     * @return the double
     */
    public Double getTotal() { return total; }
    /**
     * Sets total.
     *
     * @param total total
     */
    public void setTotal(Double total) { this.total = total; }
    /**
     * Returns status.
     * @return the string
     */
    public String getStatus() { return status; }
    /**
     * Sets status.
     *
     * @param status status
     */
    public void setStatus(String status) { this.status = status; }
    /**
     * Returns pdf url.
     * @return the string
     */
    public String getPdfUrl() { return pdfUrl; }
    /**
     * Sets pdf url.
     *
     * @param pdfUrl pdf url
     */
    public void setPdfUrl(String pdfUrl) { this.pdfUrl = pdfUrl; }
    /**
     * Returns created at.
     * @return the instant
     */
    public Instant getCreatedAt() { return createdAt; }
    /**
     * Sets created at.
     *
     * @param createdAt created at
     */
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }
    /**
     * Returns updated at.
     * @return the instant
     */
    public Instant getUpdatedAt() { return updatedAt; }
    /**
     * Sets updated at.
     *
     * @param updatedAt updated at
     */
    public void setUpdatedAt(Instant updatedAt) { this.updatedAt = updatedAt; }
}
