package com.btptraining.springbasicproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.btptraining.springbasicproject.classes.Laptop;

@SpringBootApplication
public class SpringbasicprojectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = (SpringApplication.run(SpringbasicprojectApplication.class, args));

		Laptop apple = context.getBean(Laptop.class);
		apple.setBrandName("apple");
		apple.setLength(100);
		apple.setWidth(200);
		//System.out.println(apple.toString());
		apple.Boot();

		Laptop lenovo = context.getBean(Laptop.class);
		lenovo.setBrandName("lenovo");
		lenovo.setLength(100);
		lenovo.setWidth(200);
		//System.out.println(lenovo.toString());
		lenovo.Boot();

		// Self managing the object
		// Laptop lenovo= new Laptop();

	}

}
