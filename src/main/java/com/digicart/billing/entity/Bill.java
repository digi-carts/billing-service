package com.digicart.billing.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;

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

    public Bill() {}

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }

    public String getStoreId() { return storeId; }
    public void setStoreId(String storeId) { this.storeId = storeId; }

    public String getItems() { return items; }
    public void setItems(String items) { this.items = items; }

    public Double getSubtotal() { return subtotal; }
    public void setSubtotal(Double subtotal) { this.subtotal = subtotal; }

    public Double getDeliveryCharge() { return deliveryCharge; }
    public void setDeliveryCharge(Double deliveryCharge) { this.deliveryCharge = deliveryCharge; }

    public Double getPackingCharge() { return packingCharge; }
    public void setPackingCharge(Double packingCharge) { this.packingCharge = packingCharge; }

    public Double getGstPercent() { return gstPercent; }
    public void setGstPercent(Double gstPercent) { this.gstPercent = gstPercent; }

    public Double getGstAmount() { return gstAmount; }
    public void setGstAmount(Double gstAmount) { this.gstAmount = gstAmount; }

    public Double getCouponDiscount() { return couponDiscount; }
    public void setCouponDiscount(Double couponDiscount) { this.couponDiscount = couponDiscount; }

    public Double getTotal() { return total; }
    public void setTotal(Double total) { this.total = total; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getPdfUrl() { return pdfUrl; }
    public void setPdfUrl(String pdfUrl) { this.pdfUrl = pdfUrl; }

    public Instant getCreatedAt() { return createdAt; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }

    public Instant getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Instant updatedAt) { this.updatedAt = updatedAt; }
}
