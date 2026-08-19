package com.digicart.billing.cucumber;

import com.digicart.billing.entity.Bill;
import com.digicart.billing.service.BillService;
import io.cucumber.java.Before;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.mockito.Mockito.when;

public class BillStepDefinitions {
    @Autowired
    BillService billService;

    @Before
    public void stubs() {
        when(billService.findAll()).thenReturn(List.of());
    }
}
