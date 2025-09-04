import java.util.Scanner;
class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number is: ");
		int num = sc.nextInt();
		
		int originalNum = num;
		int revNum = 0;
		
		while(num != 0) {
			int rem = num % 10;
			revNum = revNum * 10 + rem;
		    num = num / 10;
		}
		
		if(originalNum == revNum) {
			System.out.println(originalNum + " is a palindrome.");
        } 
		else {
            System.out.println(originalNum + " is not a palindrome.");
        }
	}
}

		