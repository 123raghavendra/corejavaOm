package com.xworkz.crudoperation.DAOIMPL;

import com.xworkz.crudoperation.DAO.SpeakerDAO;
import com.xworkz.crudoperation.DTO.SpeakerDTO;

public class SpeakerDAOImpl implements SpeakerDAO {
	//SpeakerDTO dto=new SpeakerDTO();
	SpeakerDTO[] dto = new SpeakerDTO[14];
	int index = 4;

	@Override
	public boolean create(SpeakerDTO dto) {
		System.out.println("method is created" + dto + "index into"+ this.index);
		//this.index++;

		return false;
	}

}
