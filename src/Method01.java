import java.util.Scanner;
public class Method01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		char c;
		System.out.print("Input temp : ");
		int n = in.nextInt();
		System.out.print(" C or F  : ");
		c = in.next().charAt(0);
		temp(n,c);
	}
	public static void temp(int n,char c) {
		if(c == 'C') {
			double a = (9*n/5)+32;
			System.out.print("Temp in Farenheit : " + a);
		}
		else {
			double a = 5*(n-32)/9;
			System.out.print("Temp in Celsius : " + a);
		}
	}

}
