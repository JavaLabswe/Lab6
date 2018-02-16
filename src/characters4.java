import java.util.*;
public class characters4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter start char : ");
		char a = in.next().charAt(0);
		System.out.print("Enter stop char : ");
		char b = in.next().charAt(0);
		characters(a,b);
		//System.out.print(c);
	}
	public static void characters(char a,char b) {
		int m=0;
		for(char i=a;i<=b;i++) {
			System.out.print(i+" ");
			m++;
			if(m==20) {
				System.out.println();
				m=0;
			}
		
		//return a;
		}
		System.out.println(" ");
		}

}
