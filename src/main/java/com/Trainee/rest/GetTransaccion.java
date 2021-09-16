package com.Trainee.rest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Trainee.Base64;
import com.Trainee.model.transaccionfinal;
import com.Trainee.repository.ServicioTransaccion;
import com.Trainee.services.ServicioTransaction;
//Restcontroller
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

	
	//commit
	//getmapp
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
		Base64 op= new Base64();
		String nombre=persona.getNombre_cliente();
		String cedula=persona.getCedula_cliente();
		String Tarjeta= persona.getNumero_tarjeta();
		String caducidad = persona.getFecha_caducidad();
		String codigoccv= persona.getCodigo_ccv();
		String tipoTarjeta= persona.getTipo_tarjeta();
		
		persona.setNombre_cliente(op.decodificador64(nombre));
		persona.setCedula_cliente(op.decodificador64(cedula));
		persona.setNumero_tarjeta(op.decodificador64(Tarjeta));
		persona.setFecha_caducidad(op.decodificador64(caducidad));
		persona.setCodigo_ccv(op.decodificador64(codigoccv));
		persona.setTipo_tarjeta(op.decodificador64(tipoTarjeta));
		
		String temporal = servicio.create(persona);
		try {
			
				return temporal;				
			
		}catch (Exception e) {
			return null;
		}
	}
	
	
}
