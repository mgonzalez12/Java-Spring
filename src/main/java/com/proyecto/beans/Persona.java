package com.proyecto.beans;

public class Persona {
	
	private int id;
	private String nombre;
	private String apodo;
	private Pais pais;
	private Ciudad ciudad;
	
	// metodo de ciclo de vida beans
	private void init(){
		System.out.println("Antes de inicializar el beans Persona");
	}
	
	private void destroy(){
		System.out.println(" el beans Persona esta a punto de ser destruido");
	}
		
	public Ciudad getCiudad() {
		return ciudad;
	}
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	
	
	
	
}
