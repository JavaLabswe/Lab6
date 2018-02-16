import java.util.Scanner;
public class Method06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=0,a=0;
		while(n!=-1) {
			System.out.print("Enter a positive integer or -1 to exit : ");
			n = in.nextInt();
			Magicsum(n);
		}
		System.out.print("The magic sum is : " + a);
	}
	public static int Magicsum(int n) {
		int sum=n;
		sum+=n;
		return n;
		
	
	}	
		
	}


