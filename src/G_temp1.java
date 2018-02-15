import java.util.Scanner;

public class G_temp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Te = new Scanner(System.in);
		double temp;
		double f,ce;
		char  c;
		System.out.print("Input temp : ");
		temp = Te.nextDouble();
		System.out.print("C or F : ");
		c = Te.next().charAt(0);
		if(c=='c'||c=='C') {
			f = celToFar(temp);
			System.out.println("Temp in Farenheit " + (int) f);
		}else {
			ce = FarTocel(temp);
			System.out.println("Temp in Celsius " + ce);
		}
	
	}	public static double celToFar(double cel) {
		double fah;
		fah = 9/5.0 * cel + 32;
		return fah;
	}	public static double FarTocel(double Far) {
		double cel;
		cel =  (5*(Far-32)/9);
		return  cel;
	}

}
