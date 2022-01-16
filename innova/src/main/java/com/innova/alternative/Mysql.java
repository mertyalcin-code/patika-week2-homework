package com.innova.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Mysql implements IDatabase {

	@Override
	public String DatabaseName(String data) {
		
		return data+"Mysql";
	}

}
