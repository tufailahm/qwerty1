package com.revature.ems.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.revature.ems.model.ContactDetails;
import com.revature.ems.model.Email;
import com.revature.ems.model.Employee;

@Configuration
public class AppConfig {

	@Bean(name = "emp1")
	//@Scope(value = "prototype")
	public Employee getEmployee() {
		return new Employee();
	}
	
	@Bean(name = "email1")
	public Email getEmail1() {
		return new Email("tufailahmedkhan@gmail.com","jay@gamil.com","Hi","how");
	}
	
	@Bean(name = "email2")
	public Email getEmail2() {
		return new Email("naveed@gmail.com","pavan@gamil.com","Hi","how");
	}
	@Bean(name = "contactDet")
	public ContactDetails getContactDetails() {
		return new ContactDetails("8187","9182","9172");
	}
	
	
}
