import java.util.Scanner;

public class nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Input an interger:");
		int n = in.nextInt();
		int sum = sumAll(n);
		System.out.println("The sum is "+sum);
	}

	private static int sumAll(int n) {
		// TODO Auto-generated method stub
		int sum = 0 ;
		do {
			if(sum>10)
			{
				n = sum;
				sum = 0;
			}
			while (n!=0) {
				sum += n%10;
				n = n/10;
			}
		} while (sum>10);
		return sum;
	}
	

}
