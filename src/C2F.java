import java.util.Scanner;
public class C2F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.print("Celsius  :");
		double c = inp.nextDouble();
		System.out.print("Fahrenheit : "+celToFar(c));
	}
	public static double celToFar(double c) {
		double f;
		f= 1.8 * c + 32; 
		return f;
	}
}
