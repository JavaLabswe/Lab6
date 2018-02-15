import java.util.Scanner;

public class S_character2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner mid = new Scanner(System.in);
		String c,sh;
		System.out.print("Input a string: ");
		c = mid.next();
		sh = middle(c);
		System.out.println("The middle charecter in the string: "+sh);
		
	}
	
	public static String middle(String c) {
		int siz = c.length();
		if(siz%2==0) {
			int pos = siz/2;
			return " "+c.charAt(pos-1)+c.charAt(pos);
		}else {
			int pos = (siz-1)/2;
			return " "+c.charAt(pos);
			
		}
	}

}
