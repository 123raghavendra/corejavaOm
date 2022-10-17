package com.xworkz.casino.Main;

import com.xworkz.casino.DAO.CasinoDAO;
import com.xworkz.casino.DAOImpl.CasinoImpl;
import com.xworkz.casino.Service.CasinoService;
import com.xworkz.casino.ServiceImpl.ServiceCasinoImpl;

public class CasinoRunner {

	public static void main(String[] args) {
		
CasinoDAO casinoDAO=new CasinoImpl();		
		
CasinoService service=new ServiceCasinoImplC(casinoDAO);


	}

}
