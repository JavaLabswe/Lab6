import java.util.*;
public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		do {
			System.out.print("Number [2 to 12]  : ");
			n = in.nextInt();
			if(n < 2 || n > 12) {
				System.out.print("Invalid data, please try again.");
			}
		}while(n < 2 || n > 12);
		displayMul(n);
}
	public static void displayMul(int n) {
		for(int i=1;i<=12;i++) {
			System.out.println(n + " X " + i + " = " + (n*i));
		}
	}
}
