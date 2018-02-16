import java.util.Scanner;
public class N_CountA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Input : ");
		String n = in.nextLine();
		countA(n);
	}
	public static void countA(String n) {
		int count = 0;
	      for (int i = 0; i < n.length(); i++) {
	         if(n.charAt(i) == 'A' || n.charAt(i) == 'a' )
	           {
	             count++;  
	            }
	      }	
	      System.out.println("Output : " + count); 
	   }
}
