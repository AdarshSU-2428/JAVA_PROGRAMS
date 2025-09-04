import java.util.Scanner;
class AvgOfMarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks in English: ");
		double english = sc.nextDouble();
		System.out.println("Enter the marks in Maths: ");
		double maths = sc.nextDouble();
		System.out.println("Enter the marks in Science: ");
		double science = sc.nextDouble();
		
		double avg = (english+maths+science)/3;
		System.out.println("The average marks: " +avg);
	}
}