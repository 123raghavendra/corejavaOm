package com.xworkz.crudoperation.MainMethod;

import com.xworkz.crudoperation.DAO.AppartmentDAO;
import com.xworkz.crudoperation.DAOIMPL.AppartmentImpl;
import com.xworkz.crudoperation.DTO.ApartmentDTO;

public class AppartmentBugger {
	public static void main(String[] args) {

		ApartmentDTO apartmentDTO = new ApartmentDTO();
		apartmentDTO.setAppartmentName("Raghavendra");
		apartmentDTO.setNoOfFloors(10);
		String[] appartmentColour = { "Blue", "pink", "Black", "red" };
		apartmentDTO.setAppartmentColour(appartmentColour);
		apartmentDTO.setCompoundAvailable(false);
		apartmentDTO.setCamera(true);
		apartmentDTO.setSwimingPool(true);
		apartmentDTO.setParking(true);
		apartmentDTO.setParking(true);
		apartmentDTO.setLift(true);
		apartmentDTO.setWaterTank(false);
		apartmentDTO.setSecurity(false);
		apartmentDTO.setGarden(false);
		apartmentDTO.setConstructionCost(100000000.00);
		apartmentDTO.setStairCase(true);
		apartmentDTO.setCoridor(false);
	

	AppartmentDAO dao=new AppartmentImpl();
	dao.create(apartmentDTO);
	}
}
