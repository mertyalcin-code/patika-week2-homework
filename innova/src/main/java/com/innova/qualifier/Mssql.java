package com.innova.qualifier;

@QualifierCokluSecim
public class Mssql implements IDatabase {
	
	@Override
	public String getDatabaseName(String data) {
		return data+"Mssql";
	}
	
}