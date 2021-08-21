package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.revature.ems.config.AppConfig;
import com.revature.ems.model.ContactDetails;
import com.revature.ems.model.Email;
import com.revature.ems.model.Employee;

/**
 * Spring demo1
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("H Alli");
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		
		Employee employee1 = (Employee) context.getBean("emp1");
	
		employee1.setEmployeeId(1);
		employee1.setEmployeeName("Mohan");
		
		
		System.out.println(employee1);
		
		Employee employee2 = (Employee) context.getBean("emp1");
		
		context.registerShutdownHook();

	}
}
