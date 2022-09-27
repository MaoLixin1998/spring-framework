package com.mlx;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
	public MyBeanPostProcessor() {
		System.out.println("MyBeanPostProcessor 实现类构造器。。");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean,String beanName) throws BeansException {
		if ("user".equals(beanName)) {
			System.out.println("BeanPostProcessor 实现 postProcessBeforeInitialization 方法被调用中");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean,String beanName) throws BeansException {
		if ("user".equals(beanName)) {
			System.out.println("BeanPostProcessor 实现 postProcessAfterInitialization 方法被调用中");
		}
		return bean;
	}
}
