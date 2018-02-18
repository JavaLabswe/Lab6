import java.util.Scanner;
public class TempCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double fah,cel;
		char  c;
		System.out.print("Input temp :");
		double temp = in.nextDouble();
		System.out.print("C or F :");
		c = in.next().toUpperCase().charAt(0);
		if(c== 'C') {
			fah = celToFar(temp);
			System.out.print("Temp in Farenheit " + fah);
		}else {
			cel = FarTocel(temp);
			System.out.print("Temp in Celsius " + cel);
		}
	
	}
	public static double celToFar(double c) {
		double f;
		f = 1.8 * c + 32;
		return f;
	}
	public static double FarTocel(double f) {
		double c;
		c = 5*(f-32)/9;
		return c;
	}

}
