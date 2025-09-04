import java.util.Scanner;
class Tax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary: ");
		int salary = sc.nextInt();
		double Tax = 0;
		
		if(salary <= 150000) {
			Tax = salary * 0;
		}
		else if(salary > 150000 && salary <= 300000) {
			Tax = salary * 0.1;
		}
		else if(salary > 300000 && salary <= 500000) {
			Tax = salary * 0.2;
		}
		else {
			Tax = salary * 0.3;
		}
		System.out.println("The tax for "+salary+" is: "+Tax);
	}
}
