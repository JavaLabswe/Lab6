import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);

		int n;
		do{
			System.out.print("Number [2 to 12] : ");
			n  = inp.nextInt();
			if(n<2 || n>12) {
				System.out.println("Invalid data, please try again.");
			}

		}
		while(2>n || n>12) ;
		displayMul(n);
		System.out.println("bye bye !!!");
	}
	public static void displayMul(int n) {
		int sum=0;
		for(int i=1;i<=12;i++) {
			sum+=n;
			System.out.println(n+" x "+i+" = "+sum);
			}
	}
}
