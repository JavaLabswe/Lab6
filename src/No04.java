import java.util.Scanner;
public class No04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double c,f;
		System.out.print("Celsius :");
		c = in.nextDouble();
		
		f = celToFar(c);
		System.out.print("Fahrenheit = " + f);
	}
	public static double celToFar(double c) {
		double f;
		f = 9/5.0 * c + 32;
		return f;
	}

}
