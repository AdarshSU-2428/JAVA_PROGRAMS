class Student {
	String SIC;
	String Name;
	String Branch;
	int[] marks = new int[6];
	
	void setDetails(String sic, String name, String branch, int[] mark) {
		SIC = sic;
		Name = name;
		Branch = branch;
		marks = mark;
	}
	
	double calAvg() {
		int sum = 0;
		for(int m : marks) {
			sum += m;
		}
		
		return (double) sum/marks.length;
	}
	
	void display() {
		System.out.println("SIC: " + SIC);
        System.out.println("Name: " + Name);
        System.out.println("Branch: " + Branch);
        System.out.print("Marks: ");
		for(int m : marks) {
			System.out.print(m+" ");
		}
		System.out.print("\nAvg marks: "+calAvg());
	}
}

class AvgMarks {
	public static void main(String[] args) {
		if(args.length != 9) {
			System.out.println("Pls enter exactly 9 arguments: ");
			return;
		}
		
		String SIC = args[0];
		String Name = args[1];
		String Branch = args[2];
		int[] marks = new int[6];
		for(int i = 0; i < 6; i++) {
			marks[i] = Integer.parseInt(args[i+3]);
		}
		
		Student s = new Student();
		
		s.setDetails(SIC, Name, Branch, marks);
		s.display();
	}
}
		
	