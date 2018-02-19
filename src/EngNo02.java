import java.util.Scanner;
public class EngNo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String c,show;
		System.out.print("Input a string: ");
		c = in.next();
		show = middle(c);
		System.out.println("The middle charecter in the string: "+show);
		
	}
	
	public static String middle(String c) {
		int size = c.length();
		if(size%2==0) {
			int pos = size/2;
			return " "+c.charAt(pos-1)+c.charAt(pos);
		}else {
			int pos = (size-1)/2;
			return " "+c.charAt(pos);
			
		}
	}

}