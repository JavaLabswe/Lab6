import java.util.Scanner;
public class Method4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter start char : ");
		char n = in.next().charAt(0);
		System.out.print("Enter stop char : ");
		char n1 = in.next().charAt(0);
		characters(n,n1);
		
	}
	public static void characters(char a,char b) {
		int n=0;
		for(char i=a;i<=b;i++) {
			System.out.print(i+" ");
			n++;
			if(n==20) {
				System.out.println( );
			n=0;
			}
		}
		System.out.println();
	}

}
