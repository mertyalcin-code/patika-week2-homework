package com.innova.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;


@InterceptorInterface
@Interceptor
public class InterceptorMethod {
	
	@AroundInvoke
	public Object aroundInvoke(InvocationContext context) throws Exception {
		
		System.out.println("previous state " + context.getMethod().getName() + " " + context.getClass());
		
	
		boolean isLogin = false;
		Object isContinue = null;
		if (isLogin) {
			System.out.println("First you need to register");
			return null;
		} else {
			try {
				isContinue = context.proceed();
				System.out.println(" Login Succesfull");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return isContinue;
	}
	
}
