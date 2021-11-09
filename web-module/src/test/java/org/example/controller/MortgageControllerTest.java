package org.example.controller;


import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.testng.annotations.BeforeClass;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.MockitoAnnotations.openMocks;


public class MortgageControllerTest {

    @InjectMocks
    private MortgageController mortgageController = new MortgageController();

    @BeforeClass
    private void init() {
        openMocks(this);
    }

    @Test
    public void checkTest() {
        ResponseEntity<?> response = mortgageController.check();
        assertEquals(response.getStatusCode(), HttpStatus.OK);
    }
}