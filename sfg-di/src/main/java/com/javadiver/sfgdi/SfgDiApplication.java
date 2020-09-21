package com.javadiver.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.javadiver.sfgdi.controllers.ConstructorInjectedController;
import com.javadiver.sfgdi.controllers.I18NController;
import com.javadiver.sfgdi.controllers.MyController;
import com.javadiver.sfgdi.controllers.PropertyInjectedController;
import com.javadiver.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		System.out.println("_______Profile Based Bean");
		
		I18NController i18NController =
				(I18NController) ctx.getBean("i18NController");
		System.out.println(i18NController.SayHello());
		
		MyController myController = (MyController)ctx.getBean("myController");
		
		//String  greeting = myController.sayHello();
		//System.out.println(greeting);
		
		System.out.println("_______Primary Bean");
		System.out.println(myController.sayHello());
		
		System.out.println("_______Property Bean");
		
		PropertyInjectedController propertyInjectedController = 
				(PropertyInjectedController) ctx.getBean("propertyInjectedController");		
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("_______Setter Bean");
		
		SetterInjectedController setterInjectedController = 
				(SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println("_______Constructor Bean");
		
		ConstructorInjectedController constructorInjectedController = 
				(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
		
	}

}
