package com.innova.qualifier;

import javax.enterprise.inject.Default;

// Defautta bu obje gelsin
@Default
public class Postgresql implements IDatabase {
	
	@Override
	public String getDatabaseName(String data) {
		return data+" Postgresql";
	}
	
}
