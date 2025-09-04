import java.util.Scanner;
class NumConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number is: ");
		int decimal = sc.nextInt();
		String binary = "";
		
		while (decimal > 0) {
            binary = (decimal % 2) + binary;  
            decimal = decimal / 2;  
        }
		
		System.out.println("Binary equivalent is: " + binary);
	}
}
