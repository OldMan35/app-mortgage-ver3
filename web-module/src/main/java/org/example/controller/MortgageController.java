package org.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/mortgage")
public class MortgageController {

    @GetMapping(value = "/check")
    public ResponseEntity<?> check() {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
