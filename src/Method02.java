import java.util.Scanner;
public class Method02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Input a string : ");
		String n = in.next();
		middle(n);
	}
	public static void middle(String n) {
		if(n.length()%2==0) {
			int a=0;
			for(int i=0;i<n.length();i++) {
				a++;
			}
			char c = n.charAt(a/2);
			char d = n.charAt(a/2+1);
			System.out.print("The middle character in the string : "+ d + c );
		}
		else {
			int a=0;
			for(int i=0;i<n.length();i++) {
				a++;
			}
			char c = n.charAt(a/2);
			System.out.print("The middle character in the string : "+ c );
		}
	}

}
