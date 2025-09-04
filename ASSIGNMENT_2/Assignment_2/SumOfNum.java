import java.util.Scanner;
class SumOfNum {
	static int sumOfNatural(int n) {
		if (n == 0) {
			return 0;
		}
		else {
			return n + sumOfNatural(n - 1);
		}
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
        int num = sc.nextInt();
		int sum = sumOfNatural(num);
        System.out.println("Sum of first " + num + " natural numbers is: " + sum);
	}
}
