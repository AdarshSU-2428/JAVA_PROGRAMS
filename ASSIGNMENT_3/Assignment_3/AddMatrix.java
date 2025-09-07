import java.util.Scanner;
class AddMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of rows: ");
		int r = sc.nextInt();
		System.out.println("Enter the no.of columns: ");
		int c = sc.nextInt();
		
		int[][] A = new int[r][c];
		int[][] B = new int[r][c];
		int[][] C = new int[r][c];
		
		System.out.println("Enter the elements for matrix A:");
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the elements for matrix B:");
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		
		System.out.println("The resultant matrix:");
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
	}
}

		
		