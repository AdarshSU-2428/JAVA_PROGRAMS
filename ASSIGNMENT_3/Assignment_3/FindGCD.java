class FindGCD {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("Error: Give exactly two numbers as command line arguments");
			return;
		}
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		int GCD = findGCD(num1, num2);
		
		System.out.println("The GCD of "+num1+" and "+num2+" is: "+GCD);
	}
	
	static int findGCD(int a, int b) {
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
