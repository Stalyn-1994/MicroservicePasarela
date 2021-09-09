package com.Trainee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class proveedores {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private int id_proveedores;	
	private String nombre_proveedores;
	private String numero_cuenta;
	private String ruc;
	private String nombre_banco;
	public int getId_proveedores() {
		return id_proveedores;
	}
	public void setId_proveedores(int id_proveedores) {
		this.id_proveedores = id_proveedores;
	}
	public String getNombre_proveedores() {
		return nombre_proveedores;
	}
	public void setNombre_proveedores(String nombre_proveedores) {
		this.nombre_proveedores = nombre_proveedores;
	}
	public String getNumero_cuenta() {
		return numero_cuenta;
	}
	public void setNumero_cuenta(String numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}
	public String getNombre_banco() {
		return nombre_banco;
	}
	public void setNombre_banco(String nombre_banco) {
		this.nombre_banco = nombre_banco;
	}
	
	
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public proveedores() {
		super();
	}
	

}
