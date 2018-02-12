import java.util.Scanner;

public class CalTrippleX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int x,result=0;
		double x1,result1=0;
		
		System.out.print("input X :");
		x = in.nextInt();
		result = trippleX(x);
		System.out.println(x+"^3 :"+result);
		
		System.out.print("input X1 :");
		x1 = in.nextDouble();
		result1 = trippleX(x1);
		System.out.println(x1+"^3 :"+result1);
		
		
	}
	public static int trippleX(int x) {
		int result;
		result = x*x*x;
		
		return result;
	}
	public static double trippleX(double x) {
		double result;
		result = x*x*x;
		
		return result;
	}
}
