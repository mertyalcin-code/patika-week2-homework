package com.innova.enumqualifier;

@EQualifier(EDatabase.Msssql)
public class Msssql implements IDatabase {
	
	@Override
	public String getDatabaseName(String data) {
		return data+" Mssql";
	}
	
}
