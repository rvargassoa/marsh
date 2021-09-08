package com.mx.marsh.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.marsh.gen.ConsultaPaquetesRequest;
import com.marsh.gen.ConsultaPaquetesResponse;
import com.marsh.gen.PaqueteDetallado;
import com.mx.marsh.vo.ConsultaPaquetesResponseVO;
import com.mx.marsh.vo.PaqueteConsultaVO;
import com.mx.marsh.vo.PaqueteDetalladoVO;

@Service
public class ConsultaPaquetesService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ConsultaPaquetesService.class);
	
	@PostConstruct
	public void inicialize() {
		ConsultaPaquetesResponse response = new ConsultaPaquetesResponse();
		response.getPaqueteDetallado().clear();
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
	}
	
	public ConsultaPaquetesResponse consultaPaquetes(ConsultaPaquetesRequest consultaPaquetesRequest) {
		LOGGER.info("Inicia consultaPaquetes------------------------------------------------------------------------------");
		PaqueteConsultaVO pc = new PaqueteConsultaVO();
		List<PaqueteDetallado> paqueteDetalladoList = new ArrayList<>();
		ConsultaPaquetesResponse response = new ConsultaPaquetesResponse();
		PaqueteDetallado paqueteDetallado = new PaqueteDetallado();
		pc.setCp(consultaPaquetesRequest.getPaqueteConsulta().getCp());
		pc.setDescripcion(consultaPaquetesRequest.getPaqueteConsulta().getDescripcion());
		pc.setMarca(consultaPaquetesRequest.getPaqueteConsulta().getMarca());
		pc.setRamo(consultaPaquetesRequest.getPaqueteConsulta().getRamo());
		pc.setSubmarca(consultaPaquetesRequest.getPaqueteConsulta().getSubmarca());
		pc.setTipovehiculo(consultaPaquetesRequest.getPaqueteConsulta().getTipovehiculo());
		LOGGER.info("Request ConsultaPaquetesRequest:{}", pc);
		ConsultaPaquetesResponseVO consultaPaquetesResponsevo = new ConsultaPaquetesResponseVO();
		consultaPaquetesResponsevo.setPaqueteDetallado(getPaquetes(pc));
		LOGGER.info("Request ConsultaPaquetesResponse:{}", consultaPaquetesResponsevo);
		for(PaqueteDetalladoVO vehiculoDetalleVO:consultaPaquetesResponsevo.getPaqueteDetallado()) {
			paqueteDetallado = new PaqueteDetallado();
			paqueteDetallado.setNombre(vehiculoDetalleVO.getNombre());
			paqueteDetalladoList.add(paqueteDetallado);
		}
		response.getPaqueteDetallado().clear();
		response.getPaqueteDetallado().addAll(paqueteDetalladoList);
		return response;
	}
	
	private List<PaqueteDetalladoVO> getPaquetes(PaqueteConsultaVO paqueteConsultaVO) {
//		response = new ConsultaPaquetesResponse();
//		response.getPaqueteDetallado().clear();
		PaqueteDetalladoVO pd = null;
		List <String>paquetes = new ArrayList<>();
		List <PaqueteDetalladoVO>paquetesReturn = new ArrayList<>();
		paquetes.add("Premium");
		paquetes.add("Amplia");
		paquetes.add("Limitada");
		paquetes.add("Basica");
		Random random = new Random();
		int value = random.nextInt(4 + 0) + 0;
		for(int i=0; i<=value;i++) {
			pd = new PaqueteDetalladoVO();
			pd.setNombre(paquetes.get(i));
			paquetesReturn.add(pd);
		}
		return paquetesReturn;
	}
}
