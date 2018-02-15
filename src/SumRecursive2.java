import java.util.Scanner;

public class SumRecursive2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int n,sumn;
		
		System.out.println("input n:");
		n = in.nextInt();
		
		sumn = Sum(n);
		System.out.println("SUM = "+sumn);
		
	}
	public static int Sum(int n) {
		if(n>1) {
			return n+Sum(n-1);
		}else {
			return 1;
		}
//		int sum=0;
//		for (int i=1;i<=n;i++) {
//			sum =sum+i;
//		}
//		return sum;
	}
}
