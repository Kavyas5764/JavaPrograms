package com.demo.springprogs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("MyBeans.xml");
		Student s = (Student)context.getBean("s1");
		s.display();
		}

}
