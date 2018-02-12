import java.util.Scanner;
public class Method2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Start Number : ");
		int n1 = in.nextInt();
		System.out.println("End Number : ");
		int n2 = in.nextInt();
		
		int sum = sumSeries(n1,n2);
		
		System.out.println("Summary is " + sum);

	}
	
	public static int sumSeries(int n1, int n2) {
		int sum=0;
		for(int i = n1 ; i <= n2 ; i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		return sum;
	}
	

}
