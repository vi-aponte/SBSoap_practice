package com.soap.springbootsoap.client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.soap.wsdl.Add;
import com.soap.wsdl.AddResponse;
import com.soap.wsdl.Divide;
import com.soap.wsdl.DivideResponse;
import com.soap.wsdl.Multiply;
import com.soap.wsdl.MultiplyResponse;
import com.soap.wsdl.Subtract;
import com.soap.wsdl.SubtractResponse;

public class SoapClient extends WebServiceGatewaySupport {

  private final String SOAPCALLBACK = "http://tempuri.org/Add";
  private final String SOAPLOCATION = "http://www.dneonline.com/calculator.asmx";
  
  /**
   * Método que se encarga de sumar dos números.
   * @param numberA
   * @param numberB
   * @return addResponse
   */
  public AddResponse getAddResponse(int numberA, int numberB) {

    Add addRequest = new Add();
    addRequest.setIntA(numberA);
    addRequest.setIntB(numberB);

    SoapActionCallback soapActionCallback = new SoapActionCallback(this.SOAPCALLBACK);

    AddResponse addResponse = (AddResponse) getWebServiceTemplate().marshalSendAndReceive(this.SOAPLOCATION, addRequest, soapActionCallback);

    return addResponse;
  }

  /**
   * Método que se encarga de restar dos números.
   * @param numberA
   * @param numberB
   * @return subtractResponse
   */
  public SubtractResponse getSubtractResponse(int numberA, int numberB) {

    Subtract subtractRequest = new Subtract();
    subtractRequest.setIntA(numberA);
    subtractRequest.setIntB(numberB);

    SoapActionCallback soapActionCallback = new SoapActionCallback(this.SOAPCALLBACK);

    SubtractResponse subtractResponse = (SubtractResponse) getWebServiceTemplate().marshalSendAndReceive(this.SOAPLOCATION, subtractRequest, soapActionCallback);

    return subtractResponse;
  }

  /**
   * Método que se encarga de multiplicar dos números
   * @param numberA
   * @param numberB
   * @return multiplyResponse
   */
  public MultiplyResponse getMultiplyResponse(int numberA, int numberB) {

    Multiply multiplyRequest = new Multiply();
    multiplyRequest.setIntA(numberA);
    multiplyRequest.setIntB(numberB);

    SoapActionCallback soapActionCallback = new SoapActionCallback(this.SOAPCALLBACK);

    MultiplyResponse multiplyResponse = (MultiplyResponse) getWebServiceTemplate().marshalSendAndReceive(this.SOAPLOCATION, multiplyRequest, soapActionCallback);

    return multiplyResponse;
  }

  /**
   * Método que se encarga de dividir dos números
   * @param numberA
   * @param numberB
   * @return divideResponse
   */
  public DivideResponse getDivideResponse(int numberA, int numberB) {

    Divide divideRequest = new Divide();
    divideRequest.setIntA(numberA);
    divideRequest.setIntB(numberB);

    SoapActionCallback soapActionCallback = new SoapActionCallback(this.SOAPCALLBACK);

    DivideResponse divideResponse = (DivideResponse) getWebServiceTemplate().marshalSendAndReceive(this.SOAPLOCATION, divideRequest, soapActionCallback);

    return divideResponse;
  }
}