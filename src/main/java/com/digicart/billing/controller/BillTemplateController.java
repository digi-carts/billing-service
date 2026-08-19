package com.digicart.billing.controller;

import com.digicart.billing.dto.BillTemplateRequest;
import com.digicart.billing.entity.BillTemplate;
import com.digicart.billing.service.BillTemplateService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bill-templates")
public class BillTemplateController {

    private final BillTemplateService billTemplateService;

    public BillTemplateController(BillTemplateService billTemplateService) {
        this.billTemplateService = billTemplateService;
    }

    @GetMapping
    public ResponseEntity<List<BillTemplate>> getAll(
            @RequestHeader(value = "X-User-Id", required = false) String userId,
            @RequestHeader(value = "X-User-Role", required = false) String userRole) {
        return ResponseEntity.ok(billTemplateService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BillTemplate> getById(
            @PathVariable String id,
            @RequestHeader(value = "X-User-Id", required = false) String userId,
            @RequestHeader(value = "X-User-Role", required = false) String userRole) {
        return ResponseEntity.ok(billTemplateService.findById(id));
    }

    @GetMapping("/store/{storeId}")
    public ResponseEntity<BillTemplate> getByStoreId(
            @PathVariable String storeId,
            @RequestHeader(value = "X-User-Id", required = false) String userId,
            @RequestHeader(value = "X-User-Role", required = false) String userRole) {
        return ResponseEntity.ok(billTemplateService.findByStoreId(storeId));
    }

    @PostMapping
    public ResponseEntity<BillTemplate> create(
            @Valid @RequestBody BillTemplateRequest request,
            @RequestHeader(value = "X-User-Id", required = false) String userId,
            @RequestHeader(value = "X-User-Role", required = false) String userRole) {
        return ResponseEntity.status(HttpStatus.CREATED).body(billTemplateService.create(request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<BillTemplate> update(
            @PathVariable String id,
            @RequestBody BillTemplateRequest request,
            @RequestHeader(value = "X-User-Id", required = false) String userId,
            @RequestHeader(value = "X-User-Role", required = false) String userRole) {
        return ResponseEntity.ok(billTemplateService.update(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(
            @PathVariable String id,
            @RequestHeader(value = "X-User-Id", required = false) String userId,
            @RequestHeader(value = "X-User-Role", required = false) String userRole) {
        billTemplateService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
