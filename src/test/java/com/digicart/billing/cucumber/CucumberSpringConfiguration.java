package com.digicart.billing.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import com.digicart.billing.exception.GlobalExceptionHandler;
import com.digicart.billing.controller.HealthController;
import com.digicart.billing.controller.BillController;
import com.digicart.billing.service.BillService;

@CucumberContextConfiguration
@WebMvcTest(controllers = { HealthController.class, BillController.class })
@AutoConfigureMockMvc(addFilters = false)
@Import(GlobalExceptionHandler.class)
public class CucumberSpringConfiguration {
    @MockBean
    BillService billService;

}
