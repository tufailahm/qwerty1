package com.revature.ems.model;

import org.springframework.beans.factory.InitializingBean;

public class Email implements InitializingBean {

	private String to;
	private String from;
	private String subject;
	private String body;
	
	public Email() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Email [to=" + to + ", from=" + from + ", subject=" + subject + ", body=" + body + "]";
	}

	public Email(String to, String from, String subject, String body) {
		this.to = to;
		this.from = from;
		this.subject = subject;
		this.body = body;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("##Email init called");
		
	}
	
}
