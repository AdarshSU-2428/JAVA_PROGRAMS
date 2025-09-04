import java.util.Scanner;
class Quadratic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the coefficient a: ");
		double a = sc.nextInt();
		System.out.println("Enter the coefficient b: ");
		double b = sc.nextInt();
		System.out.println("Enter the coefficient c: ");
		double c = sc.nextInt();
		
		double det = (b*b)-(4*a*c);
		
		if(det < 0) {
			System.out.println("The roots are not real");
		}
		else if(det == 0) {
			double root = -b / (2 * a);
			System.out.println("The roots are real");
			System.out.println("The root is: "+root);
		}
		else {
			double root1 = (-b + Math.sqrt(det)) / (2 * a);
			double root2 = (-b - Math.sqrt(det)) / (2 * a);
			System.out.println("The roots are real and distinct.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
		}
	}
}

		
		