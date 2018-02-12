import java.util.Scanner;
public class Method3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Number [2 to 12] : ");
		int n = in.nextInt();
		
		while(n<2 || n>12) {
			System.out.println("Invalid data, please try again.");
			System.out.println("Number [2 to 12] : ");
			n = in.nextInt();
		}
		
		displayMul(n);
		
		
		System.out.println("Bye Bye !!");

	}
	
	public static void displayMul(int n) {
		
		for(int i = 1 ; i<=12 ; i++) {
			System.out.println(n + " x " + i + " = " + (n*i));
		}
		
	}

}
