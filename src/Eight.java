import java.util.Scanner;

public class Eight {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner in = new Scanner(System.in);		
		String c,s;
		System.out.print("Input a string:");
		c = in.next();	
		s = midstring(c);
		System.out.println("The middle charecter in the string:"+s);		
	}
	public static String midstring(String c) {
		int size = c.length();
		if(size%2==0) {
			int p = size/2;
			return ""+c.charAt(p-1)+c.charAt(p);
		}
		else {
			int p = (size-1)/2;
			return ""+c.charAt(p);	
		}
	}

}