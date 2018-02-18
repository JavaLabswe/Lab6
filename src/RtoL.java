import java.util.Scanner;
public class RtoL {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input : ");
		String a = in.next();
		stringLtoR(a);
	}
	private static void stringLtoR(String a) {
		System.out.print("Output : ");
		for(int i = a.length()-1  ; i >= 0 ;i--)
		{
			System.out.print(a.charAt(i));
		}
	}
}