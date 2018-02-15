import java.util.*;
public class SumAToB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n1,n2;
		System.out.print("Start Namber:");
		n1 = in.nextInt();
		System.out.print("End Namber:");
		n2 = in.nextInt();
		System.out.print("Sum:"+sumSeries(n1,n2));
	}
	public static int sumSeries(int n1, int n2) {
		int n = 0;
		for(int i=n1;i<=n2;i++) {
			if (i%2==0) {
				n+=i;				
			}
		}
		return n;
	}
}
