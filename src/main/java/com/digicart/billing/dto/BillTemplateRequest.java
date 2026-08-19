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

    public String getStoreId() { return storeId; }
    public void setStoreId(String storeId) { this.storeId = storeId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLogoUrl() { return logoUrl; }
    public void setLogoUrl(String logoUrl) { this.logoUrl = logoUrl; }

    public String getHeader() { return header; }
    public void setHeader(String header) { this.header = header; }

    public String getFooter() { return footer; }
    public void setFooter(String footer) { this.footer = footer; }

    public Boolean getShowGst() { return showGst; }
    public void setShowGst(Boolean showGst) { this.showGst = showGst; }

    public Boolean getShowLogo() { return showLogo; }
    public void setShowLogo(Boolean showLogo) { this.showLogo = showLogo; }

    public String getAccentColor() { return accentColor; }
    public void setAccentColor(String accentColor) { this.accentColor = accentColor; }
}
