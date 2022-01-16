package com.innova.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@ManagerDatabaseMultipleAnnotation
public class ManagerDatabase {
	@Inject
	private IDatabase iDatabase;
	
	public String getDatabaseName() {
		return iDatabase.DatabaseName("Current Database: ");
	}
}
