import java.util.Scanner;
class AddNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers to add: ");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double res = n1 + n2;
		System.out.println("The sum of " + n1 + " and " + n2 + " is " + res);
	}
}
	