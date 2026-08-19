package com.digicart.billing.repository;

import com.digicart.billing.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BillRepository extends JpaRepository<Bill, String> {
    Optional<Bill> findByOrderId(String orderId);
    List<Bill> findByStoreId(String storeId);
    List<Bill> findByStatus(String status);
    List<Bill> findByStoreIdAndStatus(String storeId, String status);
}
