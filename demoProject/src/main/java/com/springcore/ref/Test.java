package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/ref/referenceConfig.xml");
		FirstClass fcref=(FirstClass) context.getBean("fcref");
		SecondClass scref=(SecondClass) context.getBean("scref");
		ThirdClass tcref=(ThirdClass) context.getBean("tcref");
		
		System.out.println(fcref);
		System.out.println(scref);
		System.out.println(tcref);

	}

}
