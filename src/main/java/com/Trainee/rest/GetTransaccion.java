package com.Trainee.rest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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


	@PostMapping
	private String guardar (@RequestBody Transacction persona){
		String temporal = servicio.create(persona);
		
		try {
			return temporal;
			
		}catch (Exception e) {
			return null;
		}
	}
}
