package com.digicart.billing.dto;

import jakarta.validation.constraints.NotBlank;

/**
 * Request/response DTO: Bill Template Request.
 */
public class BillTemplateRequest {

    @NotBlank(message = "storeId is required")
    private String storeId;

    private String name = "Default";
    private String logoUrl;
    private String header;
    private String footer;
    private Boolean showGst = true;
    private Boolean showLogo = true;
    private String accentColor = "#171717";

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
     * Returns name.
     * @return the string
     */
    public String getName() { return name; }
    /**
     * Sets name.
     *
     * @param name name
     */
    public void setName(String name) { this.name = name; }
    /**
     * Returns logo url.
     * @return the string
     */
    public String getLogoUrl() { return logoUrl; }
    /**
     * Sets logo url.
     *
     * @param logoUrl logo url
     */
    public void setLogoUrl(String logoUrl) { this.logoUrl = logoUrl; }
    /**
     * Returns header.
     * @return the string
     */
    public String getHeader() { return header; }
    /**
     * Sets header.
     *
     * @param header header
     */
    public void setHeader(String header) { this.header = header; }
    /**
     * Returns footer.
     * @return the string
     */
    public String getFooter() { return footer; }
    /**
     * Sets footer.
     *
     * @param footer footer
     */
    public void setFooter(String footer) { this.footer = footer; }
    /**
     * Returns show gst.
     * @return the boolean
     */
    public Boolean getShowGst() { return showGst; }
    /**
     * Sets show gst.
     *
     * @param showGst show gst
     */
    public void setShowGst(Boolean showGst) { this.showGst = showGst; }
    /**
     * Returns show logo.
     * @return the boolean
     */
    public Boolean getShowLogo() { return showLogo; }
    /**
     * Sets show logo.
     *
     * @param showLogo show logo
     */
    public void setShowLogo(Boolean showLogo) { this.showLogo = showLogo; }
    /**
     * Returns accent color.
     * @return the string
     */
    public String getAccentColor() { return accentColor; }
    /**
     * Sets accent color.
     *
     * @param accentColor accent color
     */
    public void setAccentColor(String accentColor) { this.accentColor = accentColor; }
}
