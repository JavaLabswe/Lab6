import java.util.Scanner;
public class MagicSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=0,a=0;
		int sum=0;
		while(n!=-1) {
			System.out.print("Enter a positive integer or -1 to exit : ");
			n = in.nextInt();
			if(hasEigh(n)) {
				sum+=n;
				}			
		}
		System.out.print("The magic sum is : " + sum);
	}
	public static boolean hasEigh(int n) {
		if(n/100==8||n/10==8||n%10==8) {
			return true;	
		}
		return false;
	}		
}