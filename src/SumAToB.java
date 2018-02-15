import java.util.Scanner;

public class SumAToB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int n1,n2;
		int sum=0;
		System.out.print("Start Number :");
		n1 = in.nextInt();
		System.out.print("End Number :");
		n2 = in.nextInt();
		if (n1%2==1) {
			n1 = n1+1;
		}
		sum = sumSeries(n1,n2);
		System.out.println("Summary is "+sum);
		
		
	}
	
	public static int sumSeries(int n1, int n2) {
		int sum=0;
		for(int i=n1;i<=n2;i=i+2) {
			sum = sum+i;
		}
			
		return sum;
	}

}
