import java.util.Scanner;
public class SumAToB {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b;
		System.out.print("Start Number : ");
		a =in.nextInt();
		System.out.print("End Number : ");
		b =in.nextInt();
		System.out.print("Summary is "+sumSeries(a,b));
	}
	public static int sumSeries(int a,int b) {
		int sum=0;
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		return sum;
	}
}
