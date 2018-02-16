import java.util.Scanner;
public class C2F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double cel = in.nextDouble();
		double far = celToFar(cel);
		System.out.println("Fahrenheit = "+ far);
	}
	public static double celToFar(double cel) {
		double far = cel*1.80000+32;
		return far;
	}

}
