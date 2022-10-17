package com.xworkz.touristplace.DAO;

public interface TouristPlaceDAO {
	
	boolean save(String place);
	
	boolean checkDublicatePlace(String place);

}
