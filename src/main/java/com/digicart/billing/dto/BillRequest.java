package com.digicart.billing.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class BillRequest {

    @NotBlank(message = "id is required")
    private String id;

    @NotBlank(message = "orderId is required")
    private String orderId;

    @NotBlank(message = "storeId is required")
    private String storeId;

    @NotNull(message = "items are required")
    private String items;

    @NotNull(message = "subtotal is required")
    private Double subtotal;

    private Double deliveryCharge = 0.0;
    private Double packingCharge = 0.0;
    private Double gstPercent = 0.0;
    private Double gstAmount = 0.0;
    private Double couponDiscount = 0.0;

    @NotNull(message = "total is required")
    private Double total;

    private String status = "DRAFT";
    private String pdfUrl;

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
}
