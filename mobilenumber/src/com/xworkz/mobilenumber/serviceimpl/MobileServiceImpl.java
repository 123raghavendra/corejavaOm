package com.xworkz.mobilenumber.serviceimpl;

import com.xworkz.mobilenumber.DAO.MobileNumberDAO;
import com.xworkz.mobilenumber.service.MobileService;

public class MobileServiceImpl implements MobileService {

	private MobileNumberDAO dao;

	public MobileServiceImpl(MobileNumberDAO dao) {
		this.dao = dao;
		System.out.println(" constructor of mobile service created ");
	}

	@Override
	public boolean validateAndSave(long mobileNumber) {
		if (mobileNumber != 0 && toString().valueOf(mobileNumber).length() == 10) {
			System.out.println("number is not null and equal to 10 digit");
			if (dao.checkMobileNumber(mobileNumber)) {
				System.out.println(" number is already their");
			} else {
				System.out.println("number is not their and ready to save to dao");
				dao.save(mobileNumber);
				return true;
			}
			return false;
		}
		return false;

	}
}
