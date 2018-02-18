import java.util.Scanner;
public class Multipcation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		do {
			System.out.print("Number [2-12] : ");
			num =in.nextInt();
			if(num<=12&&num>=2) {
				displayMul(num);
				System.out.println("Bye Bye !!");
			}
			else {
				System.out.println("Invalid data, plaease try again.");
			}
		}while(num>12||num<2);
	}
	public static void displayMul(int num) {
		for(int i=1;i<=12;i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
		}
	}
}