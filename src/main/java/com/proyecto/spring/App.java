package com.proyecto.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proyecto.beans.AppConfig;
import com.proyecto.beans.AppConfig2;
import com.proyecto.beans.Mundo;

public class App {

	public static void main(String[] args) {
		
		//ApplicationContext appContext = new ClassPathXmlApplicationContext("com/proyecto/xml/beans.xml");
		
		// **  una manera de llamar los AppConfig **
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class,AppConfig2.class);
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.register(AppConfig.class);
		appContext.register(AppConfig2.class);
		appContext.refresh();
		
		
		// usando el patron Factory
		Mundo m = (Mundo) appContext.getBean("marte");
		
		System.out.println(m.getSaludo());
		
		
		
		
		
		
	}

}
