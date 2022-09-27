package com.mlx.test;

import com.mlx.JavaConfig;
import com.mlx.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {


	@Test
	public void test() {

		System.out.println("hah");
		//ApplicationContext是容器的高级接口，BeanFactory(顶级容器/根容器。规范了/定义了容器的基础行为)
		//spring应用上下文，官方称之为IoC容器（错误的认识：容器就是map而已；准确来说map是ioc容器的一个成员，单例池）
		// singletonObjects，容器时一组组件和过程的集合，包括BeanFactory、单例池、BeanPostProcesser登以及之间的协作
		/**
		 * IoC容器创建管理Bean对象的，Spring Bean是有生命周期的
		 * 构造器执行、初始化方法执行、BeanPostProcessors的before和after方法： AbstractApplicationContext#refresh#finishBeanFactoryInitialization
		 * BeanFactoryPostProcessor初始化、方法执行：AbstractApplicationContext#refresh#invokeBeanFactoryPostProcessors
		 * BeanPostProcessor初始化：AbstractApplicationContext#registerBeanPostProcessors
		 */
//		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
		User user = (User) context.getBean("user");
		System.out.println(user);

	}
}
