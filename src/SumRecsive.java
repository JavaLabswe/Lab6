import java.util.Scanner;
public class SumRecsive {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("input n : ");
		int n = in.nextInt();
		if(n >= 1 && n <= 500) {
			System.out.println("sum : "+sum(n));
		}
	}
	public static int sum(int n) {
		int summ=0;
		for(int i=1;i<=n;i++) {
			summ=summ+i;
		}
			return summ;	
	}
}