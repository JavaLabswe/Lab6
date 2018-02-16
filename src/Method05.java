import java.util.*;
public class Method05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Input a passwod :  ");
		String a = in.next();
		boolean b = check(a);
		if(b == true) {
			System.out.print("Password is valid : " + a);
		}
		else {
			System.out.print("Password is not valid ");
		}
		
	}
	public static boolean check(String a) {
		int count=0;
		for(int i=0;i<=a.length();i++) {
			count++;
			}
		if(count==10) {
			if(a.charAt(9)=='0'||a.charAt(9)=='1'||a.charAt(9)=='2'||a.charAt(9)=='3'||a.charAt(9)=='4'||a.charAt(9)=='5'||a.charAt(9)=='6'||a.charAt(9)=='7'||a.charAt(9)=='8'||a.charAt(9)=='9') {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
			
	}
}