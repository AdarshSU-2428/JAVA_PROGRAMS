import java.util.Scanner;
class CheckPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		for(int i=2; i<num/2; i++) {
			if(num % i == 0) {
				System.out.println(num+ " is not a prime number");
				return;
			}
		}
		System.out.println(num+ " is a prime number");
	}
}
			