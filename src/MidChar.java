import java.util.Scanner;
public class MidChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
		
		String cc;
		System.out.print("Input a string:");
		String c = inp.next();
		
		cc = mid(c);
		System.out.println("The middle charecter in the string:"+cc);
		
	}
	public static String mid(String c) {
		int size = c.length();
		if(size%2==0) {
			int pos = size/2;
			return ""+c.charAt(pos-1)+c.charAt(pos);
		}else {
			int pos = (size-1)/2;
			return ""+c.charAt(pos);
			
		}
	}

}
