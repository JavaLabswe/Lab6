import java.util.Scanner;
public class EngNo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=0;
		
		int sum=0;
		while(n!=-1) {
			System.out.print("Enter a positive integer or -1 to exit : ");
			n = in.nextInt();
			boolean a = hasEight(n);
			if(a==true) {
				sum+=n;
			}
			
		}
		System.out.println("The magic sum is : " + sum);
	}
	public static boolean hasEight(int n) {
	
		if(n/10==8 || n%10==8) {
			return true;
		}
		return false;
	
	}	
	
}