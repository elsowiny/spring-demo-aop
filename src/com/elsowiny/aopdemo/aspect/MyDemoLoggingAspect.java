package com.elsowiny.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	// this is where we add all our related advices for logging
	
	// lets start with an @Before advice

	
	//@Before("execution(void add*(com.elsowiny.aopdemo.Account))")
	@Before("execution(* com.elsowiny.aopdemo.dao.*.*(..))")
	public void beforeAddAccountAdvice() {
		System.out.println("\n====>>> Executing @Before advice on addAccount()");
	}
	
	
}
