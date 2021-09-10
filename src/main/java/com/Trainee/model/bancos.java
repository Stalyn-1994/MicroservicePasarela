package com.Trainee.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class bancos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private int id_banco;
	private String nombre_banco;
	
	
	
	public bancos() {
		super();
	}
	
	public int getId_banco() {
		return id_banco;
	}
	public void setId_banco(int id_banco) {
		this.id_banco = id_banco;
	}
	public String getNombre_banco() {
		return nombre_banco;
	}
	public void setNombre_banco(String nombre_banco) {
		this.nombre_banco = nombre_banco;
	}
	
	
	
}
