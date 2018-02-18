import java.util.Scanner;

public class eleven {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a password :");
		String password = in.next();
		if(checkPassword(password)){
			System.out.print("Password is valid : "+password);
		}else {
			System.out.print("Password is Invalid");
		}
	}

	private static boolean checkPassword(String password) {
		if(password.length()<10)
		{
			return false;
		}
		else if(!isLetter(password)||countDigit(password) < 0)
		{
			return false;
		}
		else if(countDigit(password) < 2)
		{
			return false;
		}
		return true;
	}

	private static int countDigit(String password) {
		int sum = 0 ;
		for(int i = 0; i<password.length();i++)
		{
			if(password.charAt(i)>='0' && password.charAt(i)<='9')
			{
				sum++;
			}
		}
		return sum;
	}

	private static boolean isLetter(String password) {
		password = password.toUpperCase();
		for(int i = 0; i<password.length();i++)
		{
			if(password.charAt(i)>='A' && password.charAt(i)<='Z')
			{
				return true;
			}
		}
		return false;
	}
	

}
