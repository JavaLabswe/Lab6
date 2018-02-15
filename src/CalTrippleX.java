import java.util.Scanner;

public class CalTrippleX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int x,result=0;
		double y,result1=0;
		
		System.out.print("input X :");
		x = in.nextInt();
		result = trippleX(x);
		System.out.println(x+"^3 :"+result);
		
		System.out.print("input Y :");
		y = in.nextDouble();
		result1 = trippleX(y);
		System.out.println(y+"^3 :"+result1);
		
		
	}
	
	public static int trippleX(int x) {
		int result;
		result = x*x*x;
		
		return result;
	}
	
	public static double trippleX(double y) {
		double result;
		result = y*y*y;
		
		return result;
	}
}
