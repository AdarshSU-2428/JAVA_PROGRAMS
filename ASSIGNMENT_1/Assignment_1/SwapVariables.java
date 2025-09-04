import java.util.Scanner;
class SwapVariables {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("The numbers after swapping x = " +x+ " y = " +y);
	}
}
		