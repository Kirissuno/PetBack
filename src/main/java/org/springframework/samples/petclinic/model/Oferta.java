package org.springframework.samples.petclinic.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="oferta")
public class Oferta extends BaseEntity {
	@Column(unique=true)
	private String titulo;
	private String detalle;
	private double descuento;
	private Date fecha_caducidad;
	
	
	
	public Oferta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Oferta(String titulo, String detalle, double descuento, Date fecha_caducidad) {
		super();
		this.titulo = titulo;
		this.detalle = detalle;
		this.descuento = descuento;
		this.fecha_caducidad = fecha_caducidad;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	public Date getFecha_caducidad() {
		return fecha_caducidad;
	}
	public void setFecha_caducidad(Date fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}
	
	
	

}