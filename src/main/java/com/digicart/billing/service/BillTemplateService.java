package com.digicart.billing.service;

import com.digicart.billing.dto.BillTemplateRequest;
import com.digicart.billing.entity.BillTemplate;
import com.digicart.billing.exception.EntityNotFoundException;
import com.digicart.billing.repository.BillTemplateRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillTemplateService {

    private final BillTemplateRepository billTemplateRepository;

    public BillTemplateService(BillTemplateRepository billTemplateRepository) {
        this.billTemplateRepository = billTemplateRepository;
    }

    public List<BillTemplate> findAll() {
        return billTemplateRepository.findAll();
    }

    public BillTemplate findById(String id) {
        return billTemplateRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("BillTemplate not found with id: " + id));
    }

    public BillTemplate findByStoreId(String storeId) {
        return billTemplateRepository.findByStoreId(storeId)
                .orElseThrow(() -> new EntityNotFoundException("BillTemplate not found for storeId: " + storeId));
    }

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

    public void delete(String id) {
        if (!billTemplateRepository.existsById(id)) {
            throw new EntityNotFoundException("BillTemplate not found with id: " + id);
        }
        billTemplateRepository.deleteById(id);
    }
}
