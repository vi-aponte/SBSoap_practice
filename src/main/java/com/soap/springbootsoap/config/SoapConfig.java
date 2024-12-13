package com.soap.springbootsoap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.soap.springbootsoap.client.SoapClient;

@Configuration
public class SoapConfig {

  @Bean
  public Jaxb2Marshaller marshaller() {
    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
    marshaller.setContextPath("com.soap.wsdl");

    return marshaller;
  }

  @Bean
  public SoapClient getSoapClient(Jaxb2Marshaller marshaller) {
    String soapLocation = "http://www.dneonline.com/calculator.asmx";

    SoapClient soapClient = new SoapClient();
    soapClient.setDefaultUri(soapLocation);
    soapClient.setMarshaller(marshaller);
    soapClient.setUnmarshaller(marshaller);

    return soapClient;
  }
}