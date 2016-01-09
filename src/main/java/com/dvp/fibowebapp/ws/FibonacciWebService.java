package com.dvp.fibowebapp.ws;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.dvp.fibowebapp.FiboService;

@WebService
@SOAPBinding(style = Style.RPC)
public class FibonacciWebService {

	   private final FiboService fiboService = FiboService.getInstance();

	   public Long fibonacci(@WebParam(name = "rang")Integer rang) {
	       Long result = fiboService.calculerFibonacci(rang);
	       return result;
	   }

}