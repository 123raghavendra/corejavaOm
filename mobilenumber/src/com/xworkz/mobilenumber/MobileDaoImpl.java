package com.xworkz.mobilenumber;

import com.xworkz.mobilenumber.DAO.MobileNumberDAO;

public class MobileDaoImpl implements MobileNumberDAO {

	long[] ref1 = new long[10];
	int index;

	@Override
	public boolean save(long mobileNumber) {
		this.ref1[index] = mobileNumber;
		this.index++;
		System.out.println("mobile number  is" + mobileNumber);
		return true;
	}

	@Override
	public boolean checkMobileNumber(long mobileNumber) {
		//int i=1;
		for (long  ref :this.ref1 ) {
			System.out.println("jwdvjvdqwvd");
		if(long ) {
				System.out.println("phone number is already present;" + mobileNumber);
				return true;
			}
			else {
				System.out.println("manoj");
			}
			return true;
			// return false;
		}
		return false;
	}

}
