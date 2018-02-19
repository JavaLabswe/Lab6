import java.util.Scanner;

public class SumRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Re = new Scanner(System.in);
		int n,sum;
		System.out.println("input n: ");
		n = Re.nextInt();
		sum = Sum(n);
		System.out.println("Sum = "+sum);
		
	}public static int Sum(int n) {
		if(n>1) {
			return n+Sum(n-1);
		}else {
			return 1;
		}

	}
}
