package com.proyecto.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proyecto.beans.Mundo;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/proyecto/xml/beans.xml");
		// usando el nombre de la clase
		//Mundo m = appContext.getBean(Mundo.class);
		
		
		// usando el patron Factory
		Mundo m = (Mundo) appContext.getBean("mundo");
		
		System.out.println(m.getSaludo());
	}

}
