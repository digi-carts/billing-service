package com.digicart.billing.service;

import com.digicart.billing.dto.BillRequest;
import com.digicart.billing.entity.Bill;
import com.digicart.billing.exception.EntityNotFoundException;
import com.digicart.billing.repository.BillRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BillServiceTest {

    @Mock
    private BillRepository billRepository;

    @InjectMocks
    private BillService billService;

    @Test
    void createDefaultsDraftStatus() {
        BillRequest req = new BillRequest();
        req.setId("b1");
        req.setOrderId("o1");
        req.setStoreId("s1");
        req.setItems("[]");
        req.setSubtotal(100.0);
        req.setTotal(100.0);
        when(billRepository.save(any(Bill.class))).thenAnswer(i -> i.getArgument(0));
        Bill bill = billService.create(req);
        assertThat(bill.getStatus()).isEqualTo("DRAFT");
        assertThat(bill.getGstAmount()).isEqualTo(0.0);
    }

    @Test
    void findByOrderIdThrows() {
        when(billRepository.findByOrderId("x")).thenReturn(Optional.empty());
        assertThatThrownBy(() -> billService.findByOrderId("x")).isInstanceOf(EntityNotFoundException.class);
    }
}
