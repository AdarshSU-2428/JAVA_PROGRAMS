import java.util.Scanner;
class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.println("Enter the ending number: ");
        int end = sc.nextInt();
		
		for(int num=start; num<=end; num++) {
			int originalNum = num;
			int sum = 0;
			int digitCount = 0;
			
			while(originalNum > 0) {
				originalNum /= 10;
				digitCount++;
			}
			
			int temp = num;
			
			while(temp > 0) {
				int digit = temp % 10;
				sum += Math.pow(digit, digitCount);
				temp /= 10;
			}
			
			if(sum == num) {
				System.out.println(num);
			}
		}
	}
}

				