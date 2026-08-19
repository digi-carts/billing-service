package com.digicart.billing.repository;

import com.digicart.billing.entity.BillTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Spring Data JPA repository for bill template  persistence.
 */
@Repository
public interface BillTemplateRepository extends JpaRepository<BillTemplate, String> {
    /**
     * Finds by store id.
     *
     * @param storeId store (tenant) identifier
     * @return the value if present
     */
    Optional<BillTemplate> findByStoreId(String storeId);
}
