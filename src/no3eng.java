import java.util.Scanner;

public class no3eng {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input an interger : ");
		int n = in.nextInt();
		int sum = sumTo(n);
		System.out.println("The sum is "+sum);
	}
	public static int sumTo(int n) {
		int sum = 0 ;
		do {
			if(sum>10)
			{
				n = sum;
				sum = 0;
			}
			while (n!=0) {
				sum =sum + n%10;
				n = n/10;
			}
		} while (sum>10);
		return sum;
	}
}
