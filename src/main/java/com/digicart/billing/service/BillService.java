package com.digicart.billing.service;

import com.digicart.billing.dto.BillRequest;
import com.digicart.billing.dto.BillUpdateRequest;
import com.digicart.billing.entity.Bill;
import com.digicart.billing.exception.EntityNotFoundException;
import com.digicart.billing.repository.BillRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    private final BillRepository billRepository;

    public BillService(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    public List<Bill> findAll() {
        return billRepository.findAll();
    }

    public Bill findById(String id) {
        return billRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Bill not found with id: " + id));
    }

    public Bill findByOrderId(String orderId) {
        return billRepository.findByOrderId(orderId)
                .orElseThrow(() -> new EntityNotFoundException("Bill not found with orderId: " + orderId));
    }

    public List<Bill> findByStoreId(String storeId) {
        return billRepository.findByStoreId(storeId);
    }

    public List<Bill> findByStatus(String status) {
        return billRepository.findByStatus(status);
    }

    public List<Bill> findByStoreIdAndStatus(String storeId, String status) {
        return billRepository.findByStoreIdAndStatus(storeId, status);
    }

    public Bill create(BillRequest request) {
        Bill bill = new Bill();
        bill.setId(request.getId());
        bill.setOrderId(request.getOrderId());
        bill.setStoreId(request.getStoreId());
        bill.setItems(request.getItems());
        bill.setSubtotal(request.getSubtotal());
        bill.setDeliveryCharge(request.getDeliveryCharge() != null ? request.getDeliveryCharge() : 0.0);
        bill.setPackingCharge(request.getPackingCharge() != null ? request.getPackingCharge() : 0.0);
        bill.setGstPercent(request.getGstPercent() != null ? request.getGstPercent() : 0.0);
        bill.setGstAmount(request.getGstAmount() != null ? request.getGstAmount() : 0.0);
        bill.setCouponDiscount(request.getCouponDiscount() != null ? request.getCouponDiscount() : 0.0);
        bill.setTotal(request.getTotal());
        bill.setStatus(request.getStatus() != null ? request.getStatus() : "DRAFT");
        bill.setPdfUrl(request.getPdfUrl());
        return billRepository.save(bill);
    }

    public Bill update(String id, BillUpdateRequest request) {
        Bill bill = findById(id);
        if (request.getItems() != null) bill.setItems(request.getItems());
        if (request.getSubtotal() != null) bill.setSubtotal(request.getSubtotal());
        if (request.getDeliveryCharge() != null) bill.setDeliveryCharge(request.getDeliveryCharge());
        if (request.getPackingCharge() != null) bill.setPackingCharge(request.getPackingCharge());
        if (request.getGstPercent() != null) bill.setGstPercent(request.getGstPercent());
        if (request.getGstAmount() != null) bill.setGstAmount(request.getGstAmount());
        if (request.getCouponDiscount() != null) bill.setCouponDiscount(request.getCouponDiscount());
        if (request.getTotal() != null) bill.setTotal(request.getTotal());
        if (request.getStatus() != null) bill.setStatus(request.getStatus());
        if (request.getPdfUrl() != null) bill.setPdfUrl(request.getPdfUrl());
        return billRepository.save(bill);
    }

    public void delete(String id) {
        if (!billRepository.existsById(id)) {
            throw new EntityNotFoundException("Bill not found with id: " + id);
        }
        billRepository.deleteById(id);
    }
}
