package com.mx.marsh.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.marsh.gen.ConsultaPaquetesRequest;
import com.marsh.gen.ConsultaPaquetesResponse;
import com.marsh.gen.ConsultaVehiculoPaquetesRequest;
import com.marsh.gen.ConsultaVehiculoPaquetesResponse;
import com.marsh.gen.PaqueteDetallado;
import com.marsh.gen.VehiculoDetalle;

@Service
public class ConsultaPaquetesService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ConsultaPaquetesService.class);
	private static ConsultaPaquetesResponse response = new ConsultaPaquetesResponse();
	private static ConsultaVehiculoPaquetesResponse consultaVehiculoPaquetesResponse = new ConsultaVehiculoPaquetesResponse();
	private static JSONObject jobj = null;
	
	@PostConstruct
	public void inicialize() {
		response.getPaqueteDetallado().clear();
		consultaVehiculoPaquetesResponse.getVehiculoDetalle().clear();
		PaqueteDetallado pd = null;
		List <String>paquetes = new ArrayList<>();
		List <PaqueteDetallado>paquetesReturn = new ArrayList<PaqueteDetallado>();
		paquetes.add("Premium");
		paquetes.add("Amplia");
		paquetes.add("Limitada");
		paquetes.add("Basica");
		Random random = new Random();
		int value = random.nextInt(4 + 0) + 0;
		for(int i=0; i<=value;i++) {
			pd = new PaqueteDetallado();
			pd.setNombre(paquetes.get(i));
			paquetesReturn.add(pd);
		}
		response.getPaqueteDetallado().addAll(paquetesReturn);
		
		//----------------------------
		
		List <VehiculoDetalle>listaResp = this.obtieneCoberturas("Basica");
		consultaVehiculoPaquetesResponse.getVehiculoDetalle().addAll(listaResp);
	}
	
	public ConsultaPaquetesResponse consultaPaquetes(ConsultaPaquetesRequest consultaPaquetesRequest) {
		LOGGER.info("Inicia consultaPaquetes------------------------------------------------------------------------------");
		jobj = new JSONObject(consultaPaquetesRequest);
		LOGGER.info("Request ConsultaPaquetesRequest:{}", jobj);
		return getPaquetes(consultaPaquetesRequest);
	}
	
	private ConsultaPaquetesResponse getPaquetes(ConsultaPaquetesRequest consultaPaquetesRequest) {
		response = new ConsultaPaquetesResponse();
		response.getPaqueteDetallado().clear();
		PaqueteDetallado pd = null;
		List <String>paquetes = new ArrayList<>();
		List <PaqueteDetallado>paquetesReturn = new ArrayList<>();
		paquetes.add("Premium");
		paquetes.add("Amplia");
		paquetes.add("Limitada");
		paquetes.add("Basica");
		Random random = new Random();
		int value = random.nextInt(4 + 0) + 0;
		for(int i=0; i<=value;i++) {
			pd = new PaqueteDetallado();
			pd.setNombre(paquetes.get(i));
			paquetesReturn.add(pd);
		}
		response.getPaqueteDetallado().addAll(paquetesReturn);
		jobj = new JSONObject(response);
		LOGGER.info("------------------------------------------------------------------------------");
		LOGGER.info("Response ConsultaPaquetesResponse: {}", jobj);
		return response;
	}
	
	public ConsultaVehiculoPaquetesResponse consultaVehiculoPaquetes (ConsultaVehiculoPaquetesRequest consultaVehiculoPaquetesRequest) {
		LOGGER.info("Inicia consultaVehiculoPaquetes------------------------------------------------------------------------------");
		jobj = new JSONObject(consultaVehiculoPaquetesRequest);
		LOGGER.info("Request ConsultaVehiculoPaquetesRequest: {}", jobj);
		return getVehiculoPaquetes(consultaVehiculoPaquetesRequest);
	}
	
	private ConsultaVehiculoPaquetesResponse getVehiculoPaquetes (ConsultaVehiculoPaquetesRequest consultaVehiculoPaquetesRequest) {
		consultaVehiculoPaquetesResponse = new ConsultaVehiculoPaquetesResponse();
		consultaVehiculoPaquetesResponse.getVehiculoDetalle().clear();
		List <VehiculoDetalle>listaResp = this.obtieneCoberturas(consultaVehiculoPaquetesRequest.getVehiculo().getTipoPaquete());
		consultaVehiculoPaquetesResponse.getVehiculoDetalle().addAll(listaResp);
		consultaVehiculoPaquetesResponse.setClavemarca(consultaVehiculoPaquetesRequest.getVehiculo().getClavemarca());
		consultaVehiculoPaquetesResponse.setDescripcion(consultaVehiculoPaquetesRequest.getVehiculo().getDescripcion());
		consultaVehiculoPaquetesResponse.setModelo(consultaVehiculoPaquetesRequest.getVehiculo().getModelo());
		jobj = new JSONObject(consultaVehiculoPaquetesResponse);
		LOGGER.info("------------------------------------------------------------------------------");
		LOGGER.info("Response ConsultaVehiculoPaquetesResponse: {}", jobj);
		return consultaVehiculoPaquetesResponse;
	}
	
	private List <VehiculoDetalle> obtieneCoberturas(String tipoPaquete) {
		List <VehiculoDetalle>lista1 = new ArrayList<>();
		List <VehiculoDetalle>lista2 = new ArrayList<>();
		List <VehiculoDetalle>lista3 = new ArrayList<>();
		List <VehiculoDetalle>lista4 = new ArrayList<>();
		List <VehiculoDetalle>listaResp = new ArrayList<>();
		VehiculoDetalle vd = new VehiculoDetalle();
		vd.setClave("cris");
		vd.setDeducible("3");
		vd.setNombre("Cristales");
		lista1.add(vd);
		vd = new VehiculoDetalle();
		vd.setClave("av");
		vd.setDeducible("3");
		vd.setNombre("Asistencia vial");
		lista1.add(vd);
		vd = new VehiculoDetalle();
		vd.setClave("asus");
		vd.setDeducible("si");
		vd.setNombre("sustituto");
		lista2.add(vd);
		vd = new VehiculoDetalle();
		vd.setClave("agencia");
		vd.setDeducible("si");
		vd.setNombre("Siempre en agencia");
		lista2.add(vd);
		vd = new VehiculoDetalle();
		vd.setClave("dmllr");
		vd.setDeducible("20");
		vd.setNombre("Daños materiales de llantas o rines");
		lista3.add(vd);
		vd = new VehiculoDetalle();
		vd.setClave("dmpt");
		vd.setDeducible("3");
		vd.setNombre("Daños Materiales Pérdida Parcial");
		lista3.add(vd);
		vd = new VehiculoDetalle();
		vd.setClave("dmpt");
		vd.setDeducible("3");
		vd.setNombre("Daños Materiales Pérdida Total");
		lista4.add(vd);
		vd = new VehiculoDetalle();
		vd.setClave("rt");
		vd.setDeducible("3");
		vd.setNombre("Robo total");
		lista4.add(vd);
		if(tipoPaquete.equalsIgnoreCase("Basica")) {
			listaResp.addAll(lista1);
		}
		if(tipoPaquete.equalsIgnoreCase("Limitada")) {
			listaResp.addAll(lista1);
			listaResp.addAll(lista2);
		}
		if(tipoPaquete.equalsIgnoreCase("Amplia")) {
			listaResp.addAll(lista1);
			listaResp.addAll(lista2);
			listaResp.addAll(lista3);
		}
		if(tipoPaquete.equalsIgnoreCase("Premium")) {
			listaResp.addAll(lista1);
			listaResp.addAll(lista2);
			listaResp.addAll(lista3);
			listaResp.addAll(lista4);
		}
		
		return listaResp;
	}
}
