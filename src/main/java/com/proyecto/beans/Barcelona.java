package com.proyecto.beans;

import org.springframework.stereotype.Component;

import com.proyecto.interfaces.IEquipo;

	// Anotacion Component es un componente que spring va a reconocer en los archivos de configuracion
	// Service para la capa de servicios, Repository capa de datos y Controller

@Component
public class Barcelona implements IEquipo{

	public String mostrar() {
		
		return "Barcelona FC";
	}

}
