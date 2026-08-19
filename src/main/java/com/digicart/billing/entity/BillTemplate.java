package com.digicart.billing.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;

@Entity
@Table(name = "bill_templates", schema = "billing_svc")
@EntityListeners(AuditingEntityListener.class)
public class BillTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, updatable = false)
    private String id;

    @Column(name = "store_id", nullable = false, unique = true)
    private String storeId;

    @Column(name = "name", nullable = false)
    private String name = "Default";

    @Column(name = "logo_url")
    private String logoUrl;

    @Column(name = "header")
    private String header;

    @Column(name = "footer")
    private String footer;

    @Column(name = "show_gst", nullable = false)
    private Boolean showGst = true;

    @Column(name = "show_logo", nullable = false)
    private Boolean showLogo = true;

    @Column(name = "accent_color", nullable = false)
    private String accentColor = "#171717";

    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    @LastModifiedDate
    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;

    public BillTemplate() {}

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

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

    public Instant getCreatedAt() { return createdAt; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }

    public Instant getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Instant updatedAt) { this.updatedAt = updatedAt; }
}
