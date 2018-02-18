import java.util.Scanner;
public class CF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double temp,fah,cel;
		char  c;
		System.out.println("Input temp :");
		temp = in.nextDouble();
		System.out.println("C or F :");
		c = in.next().charAt(0);
		if(c== 'C') {
			fah = celtofar(temp);
			System.out.println("Temp in Farenheit " + fah);
		}else {
			cel = farTocel(temp);
			System.out.println("Temp in Celsius " + cel);
		}
	}
	public static double celtofar(double cel) {
		double fah;
		fah = 9/5.0 * cel + 32;
		return fah;
	}
	public static double farTocel(double Far) {
		double cel;
		cel = 5*(Far-32)/9;
		return cel;
	}
}