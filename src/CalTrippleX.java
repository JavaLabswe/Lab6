import java.util.Scanner;
public class CalTrippleX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner inp = new Scanner(System.in);
			System.out.print("Enter X(int) : ");
			int x = inp.nextInt();
			System.out.println("Answer of integer is "+trippleX(x));
			
			System.out.print("Enter X(double) : ");
			double xx = inp.nextDouble();
			System.out.println("Answer of real number is "+trippleX(xx));
			
	}
	public static int trippleX(int x) {
		int ans=x*x*x;
		return ans;
	}
	public static double trippleX(double xx) {
		double ans=xx*xx*xx;
		return ans;
	}
}
