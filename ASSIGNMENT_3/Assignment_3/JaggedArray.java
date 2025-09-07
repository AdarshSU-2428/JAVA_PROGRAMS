import java.util.Scanner;
class JaggedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no. of rows: ");
		int r = sc.nextInt();
		
		int[][] jaggedArray = new int[r][];
		
		System.out.print("Enter the jagged columns of each row: ");
		for(int i = 0; i < r; i++) {
			int c = sc.nextInt();
			jaggedArray[i] = new int[c];
		}

		System.out.println("Enter the elements of the jagged array: ");
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < jaggedArray[i].length; j++) {
				jaggedArray[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("The elements of the jagged array: ");
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < jaggedArray[i].length; j++) {
				System.out.print(jaggedArray[i][j] + " ");
			}
			System.out.println();
		}
	}
}
			