package com.digicart.billing.controller;

import com.digicart.billing.dto.BillRequest;
import com.digicart.billing.dto.BillUpdateRequest;
import com.digicart.billing.entity.Bill;
import com.digicart.billing.service.BillService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller exposing bill HTTP APIs for <em>billing-service</em>.
 */
@RestController
@RequestMapping("/bills")
public class BillController {

    private final BillService billService;

    /**
     * Creates a new {@code BillController}.
     *
     * @param billService bill service collaborator
     */
    public BillController(BillService billService) {
        this.billService = billService;
    }

    /**
     * Handles GET.
     *
     * @param userId caller user id from the gateway ({@code X-User-Id})
     * @param userRole caller role from the gateway ({@code X-User-Role})
     * @param storeId store (tenant) identifier
     * @param status status
     * @return HTTP response
     */
    @GetMapping
    public ResponseEntity<List<Bill>> getAll(
            @RequestHeader(value = "X-User-Id", required = false) String userId,
            @RequestHeader(value = "X-User-Role", required = false) String userRole,
            @RequestParam(required = false) String storeId,
            @RequestParam(required = false) String status) {
        if (storeId != null && status != null) {
            return ResponseEntity.ok(billService.findByStoreIdAndStatus(storeId, status));
        } else if (storeId != null) {
            return ResponseEntity.ok(billService.findByStoreId(storeId));
        } else if (status != null) {
            return ResponseEntity.ok(billService.findByStatus(status));
        }
        return ResponseEntity.ok(billService.findAll());
    }

    /**
     * Handles {@code GET /{id}}.
     *
     * @param id resource identifier
     * @param userId caller user id from the gateway ({@code X-User-Id})
     * @param userRole caller role from the gateway ({@code X-User-Role})
     * @return HTTP response
     */
    @GetMapping("/{id}")
    public ResponseEntity<Bill> getById(
            @PathVariable String id,
            @RequestHeader(value = "X-User-Id", required = false) String userId,
            @RequestHeader(value = "X-User-Role", required = false) String userRole) {
        return ResponseEntity.ok(billService.findById(id));
    }

    /**
     * Handles {@code GET /order/{orderId}}.
     *
     * @param orderId order identifier
     * @param userId caller user id from the gateway ({@code X-User-Id})
     * @param userRole caller role from the gateway ({@code X-User-Role})
     * @return HTTP response
     */
    @GetMapping("/order/{orderId}")
    public ResponseEntity<Bill> getByOrderId(
            @PathVariable String orderId,
            @RequestHeader(value = "X-User-Id", required = false) String userId,
            @RequestHeader(value = "X-User-Role", required = false) String userRole) {
        return ResponseEntity.ok(billService.findByOrderId(orderId));
    }

    /**
     * Handles POST.
     *
     * @param request request payload
     * @param userId caller user id from the gateway ({@code X-User-Id})
     * @param userRole caller role from the gateway ({@code X-User-Role})
     * @return HTTP response
     */
    @PostMapping
    public ResponseEntity<Bill> create(
            @Valid @RequestBody BillRequest request,
            @RequestHeader(value = "X-User-Id", required = false) String userId,
            @RequestHeader(value = "X-User-Role", required = false) String userRole) {
        return ResponseEntity.status(HttpStatus.CREATED).body(billService.create(request));
    }

    /**
     * Handles {@code PUT /{id}}.
     *
     * @param id resource identifier
     * @param request request payload
     * @param userId caller user id from the gateway ({@code X-User-Id})
     * @param userRole caller role from the gateway ({@code X-User-Role})
     * @return HTTP response
     */
    @PutMapping("/{id}")
    public ResponseEntity<Bill> update(
            @PathVariable String id,
            @RequestBody BillUpdateRequest request,
            @RequestHeader(value = "X-User-Id", required = false) String userId,
            @RequestHeader(value = "X-User-Role", required = false) String userRole) {
        return ResponseEntity.ok(billService.update(id, request));
    }

    /**
     * Handles {@code DELETE /{id}}.
     *
     * @param id resource identifier
     * @param userId caller user id from the gateway ({@code X-User-Id})
     * @param userRole caller role from the gateway ({@code X-User-Role})
     * @return HTTP response
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(
            @PathVariable String id,
            @RequestHeader(value = "X-User-Id", required = false) String userId,
            @RequestHeader(value = "X-User-Role", required = false) String userRole) {
        billService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
