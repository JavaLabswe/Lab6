import java.util.Scanner;
public class MagicSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		int n=0,a=0;
		int sum=0;
		while(n!=-1) {
			System.out.print("Enter a positive integer or -1 to exit : ");
			n = inp.nextInt();
			boolean m = Magicsum(n);
			if(m) {
				sum+=n;
				}			
		}
		System.out.print("The magic sum is : " + sum);
	}
	public static boolean Magicsum(int n) {
		if(n/10==8||n%10==8) {
			return true;	
		}
		return false;
	}		
}
