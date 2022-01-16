package com.innova.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Postgresql  implements IDatabase{

	@Override
	public String DatabaseName(String data) {
		
		return data+"Postgresql";
	}

}
