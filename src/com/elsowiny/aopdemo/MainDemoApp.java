package com.elsowiny.aopdemo;
//
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.elsowiny.aopdemo.dao.AccountDAO;
import com.elsowiny.aopdemo.dao.MembershipDAO;
import com.elsowiny.aopdemo.dao.SheriefDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		// read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		//get membership bean from spring container
		MembershipDAO theMembershipDAO = 
				context.getBean("membershipDAO", MembershipDAO.class);
		
		// call the business method
		Account myAccount = new Account();
		theAccountDAO.addAccount(myAccount,true);
		theAccountDAO.doWork();
		theMembershipDAO.goToSleep();
		
		// call the membership business method
		theMembershipDAO.addAccount();
		
		SheriefDAO sheriefsDAO = context.getBean("sheriefDAO", SheriefDAO.class);
		sheriefsDAO.addNewUserPassword();
		
		//close the context
		context.close();
	}

}
