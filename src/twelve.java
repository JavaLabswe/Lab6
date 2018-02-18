import java.util.Scanner;

public class twelve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0 ;
		System.out.print("Enter a positive interger or -1 to exit: ");
		int  n = in.nextInt();
		while(n!=-1)
		{
			if(hasEight(n))
			{
				sum += n ;
			}
			System.out.print("Enter a positive interger or -1 to exit: ");
			n = in.nextInt();
		}
		System.out.println("The magic sum is: "+sum);
	}

	private static boolean hasEight(int n) {
		while(n!=0)
		{
			if(n%10==8)
			{
				return true;
			}
			n = n/10;
		}
		return false;
	}
}
