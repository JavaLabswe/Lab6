import java.util.Scanner;
import java.lang.*;
public class MagicSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a positive integer or -1 to exit:");
		int n=in.nextInt();
		int u=0;
		while(n!=-1){
			String p=Integer.toString(n);
			for(int i=0;i<p.length();i++) {
			if(p.charAt(i)=='8') {
				u=u+n;
				
			}
			
			}
			System.out.print("Enter a positive integer or -1 to exit:");
			n=in.nextInt();
			
		}
		System.out.print("Output"+u);
		
		
	}

}
