class Employee {
	int empid;
	String empname;
	int deptno;
	double salary;
	
	void setDetails(int idValue, String name, int deptValue, double salaryValue) {
		empid = idValue;
		empname = name;
		deptno = deptValue;
		salary = salaryValue;
	}
	
	void display() {
		System.out.println("Employee id: "+empid);
		System.out.println("Employee name: "+empname);
		System.out.println("Department no.: "+deptno);
		System.out.println("Employee salary: "+salary);
	}
}

class EmpRecord {
	public static void main(String[] args) {
		if(args.length != 4) {
			System.out.print("Pls enter exactly 4 arguments!");
			return;
		}
		
		Employee emp = new Employee();
		
		emp.setDetails(
			Integer.parseInt(args[0]),
			args[1],
			Integer.parseInt(args[2]),
			Double.parseDouble(args[3])
		);
		
		emp.display();
	}
}
