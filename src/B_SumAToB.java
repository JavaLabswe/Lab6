import java.util.Scanner;

public class B_SumAToB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner To = new Scanner(System.in);
		int n,n1;
		int sum=0;
		System.out.print("Start Number :");
		n = To.nextInt();
		System.out.print("End Number :");
		n1 = To.nextInt();
		if (n%2==1) {
			n = n+1;
		}
		sum = sumSeries(n,n1);
		System.out.println("Summary is "+sum);
		
		
	}
	
	public static int sumSeries(int n, int n1) {
		int sum=0;
		for(int i=n;i<=n1;i=i+2) {
			sum = sum+i;
		}
			
		return sum;
	}

}
