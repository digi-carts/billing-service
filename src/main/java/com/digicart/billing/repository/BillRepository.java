package com.digicart.billing.repository;

import com.digicart.billing.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data JPA repository for bill  persistence.
 */
@Repository
public interface BillRepository extends JpaRepository<Bill, String> {
    /**
     * Finds by order id.
     *
     * @param orderId order identifier
     * @return the value if present
     */
    Optional<Bill> findByOrderId(String orderId);
    /**
     * Finds by store id.
     *
     * @param storeId store (tenant) identifier
     * @return matching records
     */
    List<Bill> findByStoreId(String storeId);
    /**
     * Finds by status.
     *
     * @param status status
     * @return matching records
     */
    List<Bill> findByStatus(String status);
    /**
     * Finds by store id and status.
     *
     * @param storeId store (tenant) identifier
     * @param status status
     * @return matching records
     */
    List<Bill> findByStoreIdAndStatus(String storeId, String status);
}
