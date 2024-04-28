package com.tutofox.ProjectSpring;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.AbstractDocument.Content;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import ch.qos.logback.core.Context;


@SpringBootApplication
public class ProjectSpringApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(ProjectSpringApplication.class, args);
		
		ProductService service = context.getBean(ProductService.class);
//		service.show();
		
		List<Product> products = service.getAllProducts();
		for(Product p : products) {
			System.out.println(p);
		}
//		
	}

}
