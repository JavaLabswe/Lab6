import java.util.Scanner;
public class SumAToB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner inp = new Scanner(System.in);
			System.out.print("Start Number : ");
			int n1 = inp.nextInt();
			System.out.print("End Number : ");
			int n2 = inp.nextInt();
			System.out.print("Summary is "+sumSeries(n1,n2));
	}
	public static int sumSeries(int n1, int n2) {
		int sum=0;
		if(n1%2==0 && n2%2==0) {
			for(int i=n1;i<=n2;i++) {
				if(i%2==0) {
					sum+=i;
				}
			}
		}else {
			n1++;
			for(int i=n1;i<=n2;i++) {
				if(i%2==0) {
					sum+=i;
				}
			}
		}
		return sum;
	}
}