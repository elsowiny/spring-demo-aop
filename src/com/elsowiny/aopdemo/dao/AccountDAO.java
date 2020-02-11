package com.elsowiny.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.elsowiny.aopdemo.Account;

@Component
public class AccountDAO {

	public void addAccount(Account theAccount, boolean vipFlag) {
		System.out.println(getClass() + " Doing my DB work: Adding an acount\n");
	
	}
	
	public boolean doWork() {
		
		System.out.println(getClass() + ": in the doWork() method.");
		return false;
	}
}
