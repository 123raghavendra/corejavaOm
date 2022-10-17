package com.xworkz.casino.ServiceImpl;

import com.xworkz.casino.DAO.CasinoDAO;
import com.xworkz.casino.Service.CasinoService;

public class ServiceCasinoImpl implements CasinoService {

	private CasinoDAO casinoDAO;
	
	@Override
	public boolean ValidandSave(String name) {
if(name!= null) {
	System.out.println("save method values added");
}
System.out.println("values are not added");

		return false;
	}
	

}
