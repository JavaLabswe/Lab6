import java.util.Scanner;
public class CalTrippleX {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input X : ");
		double x =in.nextDouble();
		System.out.println(": "+trippleX(x));
	}
	public static double trippleX(Double x) {
		double mun = ((x*x)*x);
		return mun;		
	}

}
