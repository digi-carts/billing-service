package com.digicart.billing.dto;

/**
 * Request/response DTO: Bill Update Request.
 */
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
