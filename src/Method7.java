import java.util.*;
public class Method7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Input : ");
		String n = in.next();
		revrese(n);
	}
	public static void revrese(String n) {
		System.out.print("Output : " );
		for (int i = (n.length() - 1); i >= 0; i--) { 
			System.out.print(n.charAt(i)); 
		}
	}
}