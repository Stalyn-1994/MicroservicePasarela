package com.Trainee.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.Trainee.model.TransaccionProveedores;
import com.Trainee.model.Transacction;
import com.Trainee.services.ServicioTransaction;

@RestController
@RequestMapping(path="/rest/dataTrainee")
public class GetTransaccion {
	
	@Autowired
	private ServicioTransaction servicio;

	
	@GetMapping
	private ResponseEntity<List<Transacction>> listarTodasLasPersona (){
		return ResponseEntity.ok(servicio.getAllPersonas());
	}

    /*@PostMapping(path="/proveedores",produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody TransaccionProveedores postTrans(
    		@RequestParam(name="nombreBanco") String banco,
    		@RequestParam(name="nombreCliente") String cliente,
    		@RequestParam(name="cedula") String cedula,
    		@RequestParam(name="tipoTarjeta") String tipoTarjeta,
    		@RequestParam(name="numeroTarjeta") String numeroTarjeta,
    		@RequestParam(name="cvv") String cvv,
    		@RequestParam(name="fechaCaducidad") String fechaCad) {
    	
    	TransaccionProveedores respuesta=new TransaccionProveedores();   	
    	respuesta.setRespuestaBase("TransaccionExitosa");
    	
    	return respuesta;
    }*/
/*
	@PostMapping(path="/proveedores",produces= MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody TransaccionProveedores postTrans( ) {
    	
    	TransaccionProveedores respuesta=new TransaccionProveedores();   	
    	respuesta.setRespuestaBase("TransaccionExitosa");
    	
    	return respuesta;
    }*/
	
	
	@PostMapping
	private Transacction guardar (@RequestBody Transacction persona){
		Transacction temporal = servicio.create(persona);
		
		try {
			return temporal;
			
		}catch (Exception e) {
			return null;
		}
	}
}
