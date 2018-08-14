package com.proyecto.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class ProyectoBeansPostProcessor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String nombreBean)throws BeansException {
		System.out.println("Despues de inicalizar"+ nombreBean);
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String nombreBean)throws BeansException {
		System.out.println("Despues de inicalizar"+ nombreBean);
		return bean;
	}

}
