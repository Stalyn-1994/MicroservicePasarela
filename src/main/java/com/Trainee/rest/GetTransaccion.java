package com.Trainee.rest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Trainee.model.transaccionfinal;
import com.Trainee.services.ServicioTransaction;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping(path="/rest/dataTrainee")
public class GetTransaccion {
	
	@Autowired
	private ServicioTransaction servicio;

	
	@GetMapping
	private ResponseEntity<List<transaccionfinal>> listarTodasLasPersona (){	
			return ResponseEntity.ok(servicio.getAllPersonas());			
	}


	@PostMapping
	private String guardar (@RequestBody transaccionfinal persona){		
		String temporal = servicio.create(persona);
		try {
			
				
				return temporal;				
			
		}catch (Exception e) {
			return null;
		}
	}
	
	
}
