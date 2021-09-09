package com.Trainee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Trainee.model.bancos;
import com.Trainee.model.transaccionfinal;
import com.Trainee.repository.ServicioBancos;

@Service
public class ServicioBanco {

	@Autowired
	private ServicioBancos transacctionResporitory;
	
		
	public List<bancos> getAllPersonas (){
		return transacctionResporitory.findAll();
	}
	
}
