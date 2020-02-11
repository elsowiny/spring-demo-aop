package com.elsowiny.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addAccount() {
		
		System.out.println(getClass() + ": Doing stuff: Adding a membership account");
	}
	
	public void goToSleep() {
		System.out.println(getClass() + ": Inside the goToSleep() method.");
	}
}
