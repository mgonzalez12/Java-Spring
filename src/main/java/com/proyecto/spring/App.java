package com.proyecto.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proyecto.beans.Ciudad;
import com.proyecto.beans.Persona;

public class App {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/proyecto/xml/beans.xml");
		Persona per = (Persona) appContext.getBean("persona");
		
		String nombreCiudades = "";
		for(Ciudad ciu : per.getPais().getCiudades()){
			nombreCiudades += ciu.getNombre()+"-";
		}
		
		System.out.println(per.getId()+" "+ per.getNombre()+" "+ per.getApodo()+" "+per.getPais().getNombre()+" "+nombreCiudades);
	}

}
