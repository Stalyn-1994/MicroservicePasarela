package com.Trainee.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="transaccionfinal",schema="public")
public class Transacction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private int id_transaccion_final;	
	private int id_banco;	
	private int id_proveedor;
	private String nombre_cliente;
	private String cedula_cliente;
	private String numero_tarjeta;
	private String fecha_caducidad;
	private String codigo_ccv;
	private String tipo_tarjeta;		
	private Double total;
	private int estado;	
	private int diferimiento;
	
	
	public int getId_banco() {
		return id_banco;
	}
	
	public void setId_banco(int id_banco) {
		this.id_banco = id_banco;
	}
	
	public int getId_proveedor() {
		return id_proveedor;
	}
	public void setId_proveedor(int id_proveedor) {
		this.id_proveedor = id_proveedor;
	}

	

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getDiferimiento() {
		return diferimiento;
	}
	public void setDiferimiento(int diferimiento) {
		this.diferimiento = diferimiento;
	}
	
	
	public Transacction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId_transaccion_final() {
		return id_transaccion_final;
	}

	public void setId_transaccion_final(int id_transaccion_final) {
		this.id_transaccion_final = id_transaccion_final;
	}

	public String getNombre_cliente() {
		return nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public String getCedula_cliente() {
		return cedula_cliente;
	}

	public void setCedula_cliente(String cedula_cliente) {
		this.cedula_cliente = cedula_cliente;
	}

	public String getNumero_tarjeta() {
		return numero_tarjeta;
	}

	public void setNumero_tarjeta(String numero_tarjeta) {
		this.numero_tarjeta = numero_tarjeta;
	}

	public String getFecha_caducidad() {
		return fecha_caducidad;
	}

	public void setFecha_caducidad(String fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}

	public String getCodigo_ccv() {
		return codigo_ccv;
	}

	public void setCodigo_ccv(String codigo_ccv) {
		this.codigo_ccv = codigo_ccv;
	}

	public String getTipo_tarjeta() {
		return tipo_tarjeta;
	}

	public void setTipo_tarjeta(String tipo_tarjeta) {
		this.tipo_tarjeta = tipo_tarjeta;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}






	



	
}
