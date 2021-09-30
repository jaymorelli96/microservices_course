package com.jaymorelli.hrpayroll.resources;

import org.springframework.web.bind.annotation.RestController;

import com.jaymorelli.hrpayroll.entities.Payment;
import com.jaymorelli.hrpayroll.services.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {
    

   @Autowired
   private PaymentService service;

   @GetMapping(value="/{workerId}/days/{days}")
   public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days) {
        Payment payment = service.getPayment(workerId, days);   
        return ResponseEntity.ok(payment);
   }
   
    
}
