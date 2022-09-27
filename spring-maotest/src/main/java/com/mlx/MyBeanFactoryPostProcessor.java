package com.mlx;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	public MyBeanFactoryPostProcessor() {
		System.out.println("MyBeanFactoryPostProcessor构造函数");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory){
		System.out.println("BeanFactoryPostProcessor的实现方法调用中.....");
	}
}
