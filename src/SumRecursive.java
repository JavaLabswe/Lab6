import java.util.Scanner;
public class SumRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Recursive(n);
	}
	public static void Recursive(int n) {
		for(int i=n;i>=1;i--) {
			n = n+i;
		}
		System.out.print(n);
	}

}
