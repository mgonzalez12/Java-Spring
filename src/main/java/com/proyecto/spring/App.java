package com.proyecto.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proyecto.beans.Persona;

public class App {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/proyecto/xml/beans.xml");
		Persona per = (Persona) appContext.getBean("persona");
		Persona per2 = (Persona) appContext.getBean("persona");
		
		System.out.println(per.getId()+" "+ per.getNombre()+" "+ per.getApodo()+" "+per.getPais().getNombre()+" "+per.getCiudad().getNombre());
		System.out.println(per.getId()+" "+ per2.getNombre()+" "+ per2.getApodo()+" "+per2.getPais().getNombre()+" "+per2.getCiudad().getNombre());
	
			// los Scope beans singleton es la mista instancia - prototype son objetos diferentes
		System.out.println(per);
		System.out.println(per2);
	}

}
