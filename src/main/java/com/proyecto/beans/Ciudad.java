package com.proyecto.beans;

public class Ciudad {
	
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// metodo de ciclo de vida beans init
		private void init(){
		//	System.out.println("Antes de inicializar el beans");
		}
		// metodo de ciclo de vida beans destroy	
		private void destroy(){
		//	System.out.println(" el beans esta a punto de ser destruido");
		}
}
