package exception;

public class RaghuException {

	public static void main(String[] args) {

		String name = "Malatesh";

		System.out.println(name);
// anything number divided  by zero it throws the exception (Airthematic exception)		
		int number;
		try {
			number = 20 / 0;
			System.out.println(number);

		} catch (Exception e) {
			System.out.println("printing the out put");
			// e.printStackTrace();
		}
		double price = 100.00;
		System.out.println(price);

		// null point exception when we initilize null called by length it throws null
		// point exception
		String name1;
		try {
			name1 = null;
			System.out.println(name1.length());
		} catch (Exception e) {

		}

		// this is throws the numberformate exception
		String same;
		try {
			same = "abc";
			int parseInt = Integer.parseInt(same);
			System.out.println(parseInt);
		} catch (Exception e) {
		
		}
	
		// array index out of boun
		
		int[] xyz=new int [3];
		xyz[0]=40;
		xyz[1]=10;
		xyz[2]=32;
		try {
			xyz[3]=40;
			xyz[4]=44;
			System.out.println(xyz[3]);
			for (int i : xyz) {
				System.out.println(i);
			}
			} catch (Exception e) {
			//e.printStackTrace();
		}
		
		}
		
		
		
		
		
	}


