package com.xworkz.crudoperation.DAOIMPL;

import com.xworkz.crudoperation.DAO.MovieDAO;
import com.xworkz.crudoperation.DTO.MovieDTO;

public class MovieImpl implements MovieDAO {

	//MovieDTO dto = new MovieDTO();

	@Override
	public boolean crete(MovieDTO dto) {
		System.out.println("method is created" + dto);
		return false;
	}
}