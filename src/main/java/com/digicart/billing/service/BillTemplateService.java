package com.digicart.billing.service;

import com.digicart.billing.dto.BillTemplateRequest;
import com.digicart.billing.entity.BillTemplate;
import com.digicart.billing.exception.EntityNotFoundException;
import com.digicart.billing.repository.BillTemplateRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Application service implementing bill template use cases for <em>billing-service</em>.
 */
@Service
public class BillTemplateService {

    private final BillTemplateRepository billTemplateRepository;

    /**
     * Creates a new {@code BillTemplateService}.
     *
     * @param billTemplateRepository bill template repository collaborator
     */
    public BillTemplateService(BillTemplateRepository billTemplateRepository) {
        this.billTemplateRepository = billTemplateRepository;
    }

    /**
     * Finds all.
     * @return matching records
     */
    public List<BillTemplate> findAll() {
        return billTemplateRepository.findAll();
    }

    /**
     * Finds by id.
     *
     * @param id resource identifier
     * @return the bill template
     */
    public BillTemplate findById(String id) {
        return billTemplateRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("BillTemplate not found with id: " + id));
    }

    /**
     * Finds by store id.
     *
     * @param storeId store (tenant) identifier
     * @return the bill template
     */
    public BillTemplate findByStoreId(String storeId) {
        return billTemplateRepository.findByStoreId(storeId)
                .orElseThrow(() -> new EntityNotFoundException("BillTemplate not found for storeId: " + storeId));
    }

    /**
     * Creates a new record.
     *
     * @param request request payload
     * @return the bill template
     */
    public BillTemplate create(BillTemplateRequest request) {
        BillTemplate template = new BillTemplate();
        template.setStoreId(request.getStoreId());
        template.setName(request.getName() != null ? request.getName() : "Default");
        template.setLogoUrl(request.getLogoUrl());
        template.setHeader(request.getHeader());
        template.setFooter(request.getFooter());
        template.setShowGst(request.getShowGst() != null ? request.getShowGst() : true);
        template.setShowLogo(request.getShowLogo() != null ? request.getShowLogo() : true);
        template.setAccentColor(request.getAccentColor() != null ? request.getAccentColor() : "#171717");
        return billTemplateRepository.save(template);
    }

    /**
     * Updates an existing record.
     *
     * @param id resource identifier
     * @param request request payload
     * @return the bill template
     */
    public BillTemplate update(String id, BillTemplateRequest request) {
        BillTemplate template = findById(id);
        if (request.getName() != null) template.setName(request.getName());
        if (request.getLogoUrl() != null) template.setLogoUrl(request.getLogoUrl());
        if (request.getHeader() != null) template.setHeader(request.getHeader());
        if (request.getFooter() != null) template.setFooter(request.getFooter());
        if (request.getShowGst() != null) template.setShowGst(request.getShowGst());
        if (request.getShowLogo() != null) template.setShowLogo(request.getShowLogo());
        if (request.getAccentColor() != null) template.setAccentColor(request.getAccentColor());
        return billTemplateRepository.save(template);
    }

    /**
     * Deletes the record.
     *
     * @param id resource identifier
     */
    public void delete(String id) {
        if (!billTemplateRepository.existsById(id)) {
            throw new EntityNotFoundException("BillTemplate not found with id: " + id);
        }
        billTemplateRepository.deleteById(id);
    }
}
