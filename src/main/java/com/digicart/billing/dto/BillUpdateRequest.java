package com.digicart.billing.dto;

public class BillUpdateRequest {

    private String items;
    private Double subtotal;
    private Double deliveryCharge;
    private Double packingCharge;
    private Double gstPercent;
    private Double gstAmount;
    private Double couponDiscount;
    private Double total;
    private String status;
    private String pdfUrl;

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
