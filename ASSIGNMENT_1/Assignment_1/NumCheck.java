import java.util.Scanner;
class NumCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		if(num < 0) {
			System.out.println(num+ " is a negative number.");
		}
		else if(num > 0) {
			System.out.println(num+ " is a positive number.");
		}
		else {
			System.out.println(num+ " is a zero.");
		}
	}
}

		