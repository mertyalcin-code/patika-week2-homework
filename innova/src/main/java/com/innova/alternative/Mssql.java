package com.innova.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Mssql implements IDatabase{

	@Override
	public String DatabaseName(String data) {
		
		return data+"Mssql";
	}

}
