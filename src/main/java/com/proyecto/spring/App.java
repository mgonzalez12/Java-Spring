package com.proyecto.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proyecto.beans.Ciudad;
import com.proyecto.beans.Jugador;
import com.proyecto.beans.Persona;
import com.proyecto.interfaces.IEquipo;

public class App {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/proyecto/xml/beans.xml");
		Jugador jug = (Jugador) appContext.getBean("jugador");
	   //IEquipo jug = (IEquipo) appContext.getBean("juventus");
		
		System.out.println(jug.getNombre()+" "+jug.getEquipo().mostrar());
		
	//	System.out.println(jug.mostrar());
		((ConfigurableApplicationContext)appContext).close();
		
	}

}
