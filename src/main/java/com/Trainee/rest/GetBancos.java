package com.Trainee.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Trainee.model.bancos;
import com.Trainee.services.ServicioBanco;

//Holatu

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping(path="/rest/bancos")
public class GetBancos {
	@Autowired
	private ServicioBanco servicio;

	
	@GetMapping
	private ResponseEntity<List<bancos>> listarTodasLasPersona (){	
			return ResponseEntity.ok(servicio.getAllPersonas());			
	}
}
