import java.util.Scanner;
class GCD {
	static int gcd(int n1, int n2) {
		if(n2 == 0) {
			return n1;
		}
		else {
			return gcd(n2, n1 % n2);
		}
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = sc.nextInt();
        System.out.println("Enter the second number: ");
        int y = sc.nextInt();
		
		int res = gcd(x, y);
		System.out.println("GCD of " + x + " and " + y + " is: " + res);
	}
}
