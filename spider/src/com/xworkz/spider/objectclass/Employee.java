package com.xworkz.spider.objectclass;

public class Employee {

	int id;
	String name;
	String adress;
	long mobileNumber;

	public Employee(int id, String name, String adress, long mobileNuber) {
		this.id = id;
		this.name = name;
		this.adress = adress;
		this.mobileNumber = mobileNuber;

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", adress=" + adress + ", mobileNumber=" + mobileNumber + "]";
	}

	public static void main(String[] args) {

		Employee employee = new Employee(1, "ramu", "btm layout", 987654321l);
		Employee employee1 = new Employee(2, "raghu", "majestic", 34343626276l);
		Employee employee2 = new Employee(3, "manoj", "basaveshwar layout", 98723242321l);
		Employee employee3 = new Employee(4, "darashan", "nithin layout", 13355678l);
		Employee employee4 = new Employee(5, "malatesh", "kamal", 987654321l);
		Employee employee5 = new Employee(6, "abhi", "vijay Nagar", 765432111l);
		Employee employee6 = new Employee(7, "sangu", "btm Nagar", 765432111l);

		Employee[] emp = new Employee[7];

		// or Employee [] emp={0,1,2,3,4,5,6}

		emp[0] = employee;
		emp[1] = employee1;
		emp[2] = employee2;
		emp[3] = employee3;
		emp[4] = employee4;
		emp[5] = employee5;
		emp[6] = employee6;

		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i]);
		}

	}

}
