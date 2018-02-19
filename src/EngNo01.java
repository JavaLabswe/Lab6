import java.util.Scanner;
public class EngNo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			double temp;
			double fah,cel;
			char  c;
			System.out.print("Input temp : ");
			temp = in.nextDouble();
			System.out.print("C or F : ");
			c = in.next().charAt(0);
			if(c=='c') {
			fah = celToFar(temp);
			System.out.println("Temp in Farenheit " + fah);
			}else {
				cel = FarTocel(temp);
				System.out.println("Temp in Celsius " + cel);
			}
		}
	
	public static double celToFar(double cel) {
			double fah;
			fah = 9/5.0 * cel + 32;
			return fah;
		}
		public static double FarTocel(double Far) {
			double cel;
			cel = 5*(Far-32)/9;
			return cel;
		}
}