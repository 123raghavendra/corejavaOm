import com.xworkz.mobilenumber.MobileDaoImpl;
import com.xworkz.mobilenumber.DAO.MobileNumberDAO;
import com.xworkz.mobilenumber.service.MobileService;
import com.xworkz.mobilenumber.serviceimpl.MobileServiceImpl;

public class MobileNumberRunner {

	public static void main(String[] args) {
   MobileNumberDAO mobileDaoImpl = new MobileDaoImpl();
   MobileService mobileServiceImpl = new MobileServiceImpl(mobileDaoImpl);
   boolean validateAndSave = mobileServiceImpl.validateAndSave(7204250720l);
   System.out.println(validateAndSave);
   
	}

}
