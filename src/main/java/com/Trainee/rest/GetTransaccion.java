package com.Trainee.rest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Trainee.model.bancos;
import com.Trainee.model.proveedores;
import com.Trainee.model.transaccionfinal;
import com.Trainee.repository.ServicioTransaccion;
import com.Trainee.services.ServicioTransaction;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping(path="/rest/dataTrainee")
public class GetTransaccion {
	
	@Autowired
	private ServicioTransaction servicio;

	@Autowired
	private ServicioTransaccion repository;
	@GetMapping
	private ResponseEntity<List<transaccionfinal>> listarTodasLasPersona (){	
			return ResponseEntity.ok(servicio.getAllPersonas());			
	}

	
	
	
	@GetMapping
	@RequestMapping(path="/bancos/{id}")
	private ResponseEntity<List<transaccionfinal>> listarbancos (@PathVariable Integer id){	
System.out.println("llegue");
return ResponseEntity.ok(repository.findUserByStatus(id));			
	}
	
	
	

	@GetMapping
	@RequestMapping(path="/proveedores/{id}")
	private ResponseEntity<List<transaccionfinal>> listarproveedor (@PathVariable Integer id){	
System.out.println("llegue");
return ResponseEntity.ok(repository.findByProveedores(id));			
	}
	
	
	
	

	@PostMapping
	private String guardar (@RequestBody transaccionfinal persona){	
		/*
		decodificar
		
		*/
		
		String temporal = servicio.create(persona);
		try {
			
				return temporal;				
			
		}catch (Exception e) {
			return null;
		}
	}
	
	
}
