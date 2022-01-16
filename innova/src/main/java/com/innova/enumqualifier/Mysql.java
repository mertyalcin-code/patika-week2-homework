package com.innova.enumqualifier;

@EQualifier(EDatabase.Mysql)
public class Mysql implements IDatabase {
	
	@Override
	public String getDatabaseName(String data) {
		return data+" Mysql";
	}
	
}
