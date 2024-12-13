package com.soap.springbootsoap.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.soap.springbootsoap.client.SoapClient;
import com.soap.wsdl.AddResponse;
import com.soap.wsdl.DivideResponse;
import com.soap.wsdl.MultiplyResponse;
import com.soap.wsdl.SubtractResponse;

@RestController
public class SoapController {
  
  @Autowired
  private SoapClient soapClient;

  @PostMapping("/sumar")
  public ResponseEntity<?> add(@RequestParam int numberA, @RequestParam int numberB) {
    AddResponse addResponse = soapClient.getAddResponse(numberA, numberB);
    Integer result = addResponse.getAddResult();

    Map<String, Integer> response = new HashMap<>();
    response.put("Resultado", result);
    
    return ResponseEntity.ok().body(response);
  }

  @PostMapping("/restar")
  public ResponseEntity<?> subtract(@RequestParam int numberA, @RequestParam int numberB) {
    SubtractResponse subtractResponse = soapClient.getSubtractResponse(numberA, numberB);
    Integer result = subtractResponse.getSubtractResult();

    Map<String, Integer> response = new HashMap<>();
    response.put("Resultado", result);
    
    return ResponseEntity.ok().body(response);
  }

  @PostMapping("/multiplicar")
  public ResponseEntity<?> multiply(@RequestParam int numberA, @RequestParam int numberB) {
    MultiplyResponse multiplyResponse = soapClient.getMultiplyResponse(numberA, numberB);
    Integer result = multiplyResponse.getMultiplyResult();

    Map<String, Integer> response = new HashMap<>();
    response.put("Resultado", result);
    
    return ResponseEntity.ok().body(response);
  }

  @PostMapping("/dividir")
  public ResponseEntity<?> divide(@RequestParam int numberA, @RequestParam int numberB) {
    DivideResponse divideResponse = soapClient.getDivideResponse(numberA, numberB);
    Integer result = divideResponse.getDivideResult();

    Map<String, Integer> response = new HashMap<>();
    response.put("Resultado", result);
    
    return ResponseEntity.ok().body(response);
  }

}
