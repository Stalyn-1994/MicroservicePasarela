package com.Trainee.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class proveedores {

	@Id
	private int id_proveedores;	
	private String nombre_proveedores;	
	private String cantiumero_cuenta;
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
	public String getCantiumero_cuenta() {
		return cantiumero_cuenta;
	}
	public void setCantiumero_cuenta(String cantiumero_cuenta) {
		this.cantiumero_cuenta = cantiumero_cuenta;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getNombre_banco() {
		return nombre_banco;
	}
	public void setNombre_banco(String nombre_banco) {
		this.nombre_banco = nombre_banco;
	}
	
	
	

}
