package com.proyecto.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proyecto.beans.Ciudad;
import com.proyecto.beans.Persona;

public class App {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/proyecto/xml/beans.xml");
		Persona per = (Persona) appContext.getBean("persona");
		
		Ciudad ciu = (Ciudad) appContext.getBean("ciudad");
		
		System.out.println( per.getApodo());
		System.out.println( ciu.getNombre());

		((ConfigurableApplicationContext)appContext).close();
		
	}

}
