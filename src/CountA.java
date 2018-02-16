import java.util.Scanner;
public class CountA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Input : ");
		String s = in.nextLine();
		countA(s);
	}
	
	public static void countA(String s) {
		int count = 0;
	      for (int i = 0; i < s.length(); i++) {
	         if(s.charAt(i) == 'A' || s.charAt(i) == 'a' )
	           {
	             count++;  
	            }
	      }	
	      System.out.println("Output : " + count); 
	   }
}
