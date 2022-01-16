package com.innova.interceptor;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("interceptorAOP")
@ApplicationScoped
public class AopBean implements Serializable {
	private static final long serialVersionUID = 1548548484848998489L;
	
	@Inject
	private Login login;
	
	public String getLogin() {
		return login.isLogin("Homepage");
	}
	
}
