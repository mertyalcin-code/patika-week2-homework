package com.innova.enumqualifier;

@EQualifier(EDatabase.Postgresql)
public class Postgresql implements IDatabase {
	
	@Override
	public String getDatabaseName(String data) {
		return data+" Postgresql";
	}
	
}
