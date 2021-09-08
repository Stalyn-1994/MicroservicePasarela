package com.Trainee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Trainee.model.Transacction;
import com.Trainee.repository.ServicioTransaccion;


@Service 
public class ServicioTransaction {
	@Autowired
	private ServicioTransaccion transacctionResporitory;
	
	public String create (Transacction persona) {
		persona.setEstado((int)(Math.random()*3 + 1));
		transacctionResporitory.save(persona);
		String estado="En proceso";
		switch (persona.getEstado()) {
		case 1:
			estado="Aprobado";
			break;
		case 2:
			estado="Reprobado";
			break;
		case 3:
			estado="En proceso";
	break;

		
		}
		return estado;
	}
	
	public List<Transacction> getAllPersonas (){
		return transacctionResporitory.findAll();
	}
}
