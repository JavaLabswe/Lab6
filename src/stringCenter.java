import java.util.Scanner;
public class stringCenter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a String : ");
		String a = in.next();
		center(a);
	}
	public static void center(String a) {
		System.out.print("The middle Character in the string : ");
		int size = a.length();
		int index = size/2;
		if(size % 2 == 0) {
			System.out.print(a.charAt(index-1)+""+a.charAt(index));
		}
		else {
				System.out.print(a.charAt(index));
			}		
	}
}
