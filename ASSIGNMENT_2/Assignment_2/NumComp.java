/*import java.util.Scanner;
class NumComp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = sc.nextInt();
        System.out.println("Enter the second number: ");
        int y = sc.nextInt();
		
		int largest = (x > y) ? x : y;
		
		System.out.println("The largest number is: " + largest);
	}
}*/

import java.util.Scanner;
class NumComp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = sc.nextInt();
        System.out.println("Enter the second number: ");
        int y = sc.nextInt();
		System.out.println("Enter the third number: ");
        int z = sc.nextInt();
		
		int a = (x > y) ? x : y;
		int largest = (a > z) ? a : z;
		
		System.out.println("The largest number is: " + largest);
	}
}
