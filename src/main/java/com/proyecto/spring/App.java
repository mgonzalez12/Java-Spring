package com.proyecto.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proyecto.beans.Persona;


public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/proyecto/xml/beans.xml");
		Persona per = (Persona) appContext.getBean("persona");
		
		// video 6 mito 3:15
		
		System.out.println(per.getId()+ " "+per.getNombre()+" "+per.getApodo());
	}

}
