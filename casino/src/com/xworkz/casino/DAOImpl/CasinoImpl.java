package com.xworkz.casino.DAOImpl;

import com.xworkz.casino.DAO.CasinoDAO;

public class CasinoImpl implements CasinoDAO {

	String[] dataStore = new String[4];
	int index = 5;

	@Override
	public boolean save(String name) {
System.out.println("save method started");
this.dataStore[this.index]=name;
this.index++;
    return false;
	}

}
