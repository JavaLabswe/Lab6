import java.util.Scanner;
public class Cf {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input Temp : ");
		double temp =in.nextDouble();
		System.out.print("C or F : ");
		char c =in.next().charAt(0);
		checkCF(temp, c);
	}
	public static void checkCF(double temp,char c) {
		if(c=='C'||c=='c') {
			double a = ((9*temp)/5)+32;
			System.out.print("Temp in Farrenheit : "+a);
		}
		else{
			double b =(5*(temp-32))/9;
			System.out.print("Temp in Celsius : "+b);
		}
	}
}
