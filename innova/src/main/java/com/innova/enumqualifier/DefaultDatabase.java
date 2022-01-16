package com.innova.enumqualifier;

import javax.enterprise.inject.Default;

@Default
public class DefaultDatabase implements IDatabase {
	

	@Override
	public String getDatabaseName(String data) {
		// TODO Auto-generated method stub
		return "Default database Postgresql";
	}
	
}
