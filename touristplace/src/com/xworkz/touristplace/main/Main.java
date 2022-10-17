package com.xworkz.touristplace.main;

import com.xworkz.touristplace.DAO.TouristPlaceDAO;
import com.xworkz.touristplace.DAOImpl.TouristPlaceDAOImpl;
import com.xworkz.touristplace.Service.TouristPlaceService;
import com.xworkz.touristplace.ServiceImpl.TouristPlaceServiceImpl;

public class Main {

	public static void main(String[] args) {
		TouristPlaceDAO dao = new TouristPlaceDAOImpl();

		TouristPlaceService placeService = new TouristPlaceServiceImpl(dao);
		//placeService.validateAndSave(null);
		placeService.validateAndSave("Hampi");
		placeService.validateAndSave("Hampi");
	}

}
