package com.digicart.billing.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;

/**
 * JPA entity mapped in this service schema (Bill Template).
 */
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

    /**
     * Creates a new {@code BillTemplate}.
     */
    public BillTemplate() {}
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
