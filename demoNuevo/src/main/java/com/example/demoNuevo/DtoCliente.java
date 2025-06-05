package com.example.demoNuevo;


public class DtoCliente {
	private String nombre;
	private String apellidos;
	private String email;
	private String telefono;
	
	private String numTargeta;
	private String nomTitular;
	private String fecha;
	private String cvv;
	private Boolean terminos;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getNomTitular() {
		return nomTitular;
	}
	public void setNomTitular(String nomTitular) {
		this.nomTitular = nomTitular;
	}
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Boolean getTerminos() {
		return terminos;
	}
	public void setTerminos(Boolean terminos) {
		this.terminos = terminos;
	}
	public String getNumTargeta() {
		return numTargeta;
	}
	public void setNumTargeta(String numTargeta) {
		this.numTargeta = numTargeta;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
}
	