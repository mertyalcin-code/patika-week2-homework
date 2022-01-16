package com.innova.enumqualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "multipleQualifier")
@ApplicationScoped
public class QualifierManager {

	@Inject
	@EQualifier(EDatabase.Mysql)
	IDatabase iDatabase;
	
	public String getDatabaseName() {
		return iDatabase.getDatabaseName("Database: ");
	}
	
}
