import java.util.Scanner;
public class SumAToB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Start Number : ");
		int n1 = in.nextInt();
		System.out.print("End Number : ");
		int n2 = in.nextInt();
		int sum = sumSeries(n1,n2);
		System.out.print("Summary is  " + sum);
	}
	
	public static int sumSeries(int n1,int n2) {
		if(n1%2==1) {
			n1 = n1+1;
		}
		if(n2%2==1) {
			n2 = n2-1;
		}
		for(int i=n1;i<=n2;) {
			n1 = n1+i;
			i=i+2;
		}
		return n1;
		
	}

}
