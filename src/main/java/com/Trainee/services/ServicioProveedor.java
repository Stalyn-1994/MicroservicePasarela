package com.Trainee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Trainee.model.proveedores;
import com.Trainee.repository.ServicioProveedores;



@Service 
public class ServicioProveedor {


	@Autowired
	private ServicioProveedores transacctionResporitory;
	
		
	public List<proveedores> getAllPersonas (){
		return transacctionResporitory.findAll();
	}
}
