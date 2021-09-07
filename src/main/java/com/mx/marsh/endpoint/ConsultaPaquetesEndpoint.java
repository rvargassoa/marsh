package com.mx.marsh.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.marsh.gen.ConsultaPaquetesRequest;
import com.marsh.gen.ConsultaPaquetesResponse;
import com.marsh.gen.ConsultaVehiculoPaquetesRequest;
import com.marsh.gen.ConsultaVehiculoPaquetesResponse;
import com.mx.marsh.service.ConsultaPaquetesService;

@Endpoint
public class ConsultaPaquetesEndpoint {

	@Autowired
	private ConsultaPaquetesService service;
	
	@PayloadRoot(namespace = "http://marsh.com/gen", localPart = "consultaPaquetesRequest")
	@ResponsePayload
	public ConsultaPaquetesResponse consultaPaquetes(@RequestPayload ConsultaPaquetesRequest consultaPaquetesRequest){
		ConsultaPaquetesResponse response = new ConsultaPaquetesResponse();
		response = service.consultaPaquetes(consultaPaquetesRequest);
		return response;
	}
	
	@PayloadRoot(namespace = "http://marsh.com/gen", localPart = "consultaVehiculoPaquetesRequest")
	@ResponsePayload
	public ConsultaVehiculoPaquetesResponse consultaVehiculoPaquetes (@RequestPayload ConsultaVehiculoPaquetesRequest consultaVehiculoPaquetesRequest) {
		ConsultaVehiculoPaquetesResponse response = new ConsultaVehiculoPaquetesResponse();
		response = service.consultaVehiculoPaquetes(consultaVehiculoPaquetesRequest);
		return response;
	}
}
