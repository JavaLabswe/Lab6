import java.util.Scanner;
public class CheckPassword {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a password : ");
		String pass =in.next();
		if(pass.length()>10) {
			System.out.println("Error Password");
		}
		else {
			check(pass);
		}	
	}
	public static void check(String pass) {
		int x=0;
		for(int i=0;i<pass.length();i++) {
			if(Character.isDigit(pass.charAt(i))==true) {
				x=x+1;
			}
		}
		if(x>1) {
				System.out.println("Password is valid: "+pass);
		}
		else {
			System.out.println("Error Password");
		}
	}
}
