import java.util.Scanner;
class Grades {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks in English: ");
		int english = sc.nextInt();
		System.out.println("Enter the marks in Maths: ");
		int maths = sc.nextInt();
		System.out.println("Enter the marks in Science: ");
		int science = sc.nextInt();
		System.out.println("Enter the marks in Computer: ");
		int computer = sc.nextInt();
		
		int avg = (english+maths+science+computer)/4;
		
		if(avg >= 90) {
			System.out.println("You got O grade!");
		}
		else if(avg >= 80 && avg < 90) {
			System.out.println("You got E grade!");
		}
		else if(avg >= 70 && avg < 80) {
			System.out.println("You got A grade!");
		}
		else if(avg >= 60 && avg < 70) {
			System.out.println("You got B grade!");
		}
		else if(avg >= 50 && avg < 60) {
			System.out.println("You got C grade!");
		}
		else if(avg >= 40 && avg < 50) {
			System.out.println("You got D grade!");
		}
		else {
			System.out.println("You got U grade!");
		}
	}
}
