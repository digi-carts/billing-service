package com.digicart.billing.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * Request/response DTO: Bill Request.
 */
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
}
