package com.proyecto.beans;

import org.springframework.beans.factory.annotation.Value;

public class Mundo {
	@Value("Hola Mundo..!!")
	public String saludo;

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	
	
}
