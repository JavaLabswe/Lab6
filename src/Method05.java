import java.util.*;
public class Method05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Input a passwod : ");
		String a = in.next();
		String b = check(a);
		System.out.print("Password is valid : " + b);
	}
	public static String check(String a) {
		for(int i=0;i<=a.length();i++) {
			if(a.equals(10)) {
				return a;
			}
			if(a.equals('a')||a.equals('z')) {
				return a;
			}
			if(a.length()== 0 ||a.length()== 1||a.length()== 2||a.length()== 3||a.length()== 4||a.length()== 5||a.length()== 6||a.length()== 7||a.length()== 8||a.length()== 9)
				return a;
		}
		return a;
		
	}

}
