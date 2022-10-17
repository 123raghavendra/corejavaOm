package com.xworkz.touristplace.ServiceImpl;

import com.xworkz.touristplace.DAO.TouristPlaceDAO;
import com.xworkz.touristplace.Service.TouristPlaceService;

public class TouristPlaceServiceImpl implements TouristPlaceService {

	private TouristPlaceDAO dao;

	public TouristPlaceServiceImpl(TouristPlaceDAO dao) {
		super();
		this.dao = dao;
	}

	@Override

	 public boolean validateAndSave(String place) {
		if (place != null && place.length() > 2 && place.length() < 10) {
			System.out.println("the place name is not null or it's in the length--" + place);
			if (!dao.checkDublicatePlace(place)) {
				System.err.println("the checked place name is not valid " + place);
			
				return true;
			}

			System.out.println("checked place name is valid ");
		}
		System.out.println("the place is equal to null or out of the length--"+place);
		return false;
	}

}
