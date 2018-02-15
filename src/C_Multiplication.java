import java.util.Scanner;

public class C_Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Mu = new Scanner(System.in);
		int n;
		do {
			System.out.print("Number [2 to 12] : ");
			n = Mu.nextInt();
			if(n<2 || n>12) {
				System.out.println("Invalid data, please try again.");
			}
		}while(n<2 || n>12);
		
		displayMul(n);
	}
	
		public static void displayMul(int n) {
			int mul;
			for(int i=1;i<=12;i++) {
				mul = n*i;
				System.out.println(n+"*"+i+"="+mul);
			}
			System.out.println("Bye Bye!!");
		}

}
