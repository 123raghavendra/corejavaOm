package com.xworkz.touristplace.DAOImpl;

import java.util.Iterator;

import com.xworkz.touristplace.DAO.TouristPlaceDAO;

public class TouristPlaceDAOImpl implements TouristPlaceDAO {

	String[] data = new String[10];
	int index;

	@Override
	public boolean save(String place) {
		this.data[index] = place;
		System.out.println("tourist place name is saved" + place+" "+"index is-"+index);
		index++;
		return false;
	}

	@Override
	public boolean checkDublicatePlace(String place) {
		for (String string : data) {
			if (string != null &&string.equals(place)) {
				System.out.println("The place name is alredy exist");

				return true;

			}
			System.out.println("the place name is not exist");
			return false;
		}

		return false;
	}

}
