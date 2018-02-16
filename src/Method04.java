import java.util.*;
public class Method04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter start char : ");
		char a = in.next().charAt(0);
		System.out.print("Enter stop char : ");
		char b = in.next().charAt(0);
		char c = characters(a,b);
		System.out.print(c);
	}
	public static char characters(char a,char b) {
		return a;
	}

}
