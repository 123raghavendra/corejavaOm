package com.xworkz.crudoperation.DAOIMPL;

import com.xworkz.crudoperation.DAO.AppartmentDAO;
import com.xworkz.crudoperation.DTO.ApartmentDTO;

public class AppartmentImpl implements AppartmentDAO {
	ApartmentDTO[] dtos = new ApartmentDTO[15];
	int index = 4;

	@Override
	public boolean create(ApartmentDTO dto) {
		this.dtos[index]=dto;
		System.out.println("appartment is saved,"+dto+" into index"+this.index);
		this.index++;
		
		return true;
	}
}
