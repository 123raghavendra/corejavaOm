package com.xworkz.crudoperation.MainMethod;

import com.xworkz.crudoperation.DAO.MovieDAO;
import com.xworkz.crudoperation.DAOIMPL.MovieImpl;
import com.xworkz.crudoperation.DTO.MovieDTO;

public class MovieBugger {
	public static void main(String[] args) {
		
	
	MovieDTO dto=new MovieDTO();
	dto.setMovieName("LuckyMan");
	String [] ActrossName= {"punith","lucky","powerstar"};
	dto.setActrossName(ActrossName);
	dto.setBudjet(200000000);
	dto.setTotalCollection(356864430);
	String [] producerName= {"Mallu","abhi","santosh"};
	dto.setProducerName(producerName);
	dto.setMonthlyIncome(1234560);
	String [] comedyActross= {"manoj","hanumanth","nandan"};
	dto.setComedyActross(comedyActross);
	
	MovieDAO dao=new MovieImpl();
	dao.crete(dto);
	
	
	
	}
	
	
	
}
