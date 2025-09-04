import java.util.Scanner;
class TimeConversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the time in seconds: ");
		int secs = sc.nextInt();
		int hrs = secs / 3600;
		secs %= 3600;
		int mins = secs / 60;
		secs %= 60;
		System.out.println(hrs + " hours: " + mins + " minutes: " + secs + " seconds");
	}
}