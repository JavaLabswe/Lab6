import java.util.Scanner;
public class C2F {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double cel;
		System.out.print("Celsius : ");
		cel = in.nextDouble();
		System.out.println("Fahrenheit : " + celToFar(cel));
	}
	public static double celToFar(double cel) {
		double fah;
		fah = 9/5.0 * cel + 32;
		return fah;
	}
}