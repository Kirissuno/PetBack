package org.springframework.samples.petclinic.dto;

import java.sql.Date;

public class OfertaDTO {
	private String titulo;
	private String detalle;
	private double descuento;
	private Date fecha_caducidad;
	
	public OfertaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OfertaDTO(String titulo, String detalle, double descuento, Date fecha_caducidad) {
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
