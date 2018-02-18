import java.util.Scanner;

public class Printchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter start char: ");
		char s = in.next().charAt(0);
		System.out.print("Enter stop char: ");
		char e = in.next().charAt(0);
		printchar(s,e);
		
	}

	public static void printchar(char s, char e) {
		int count=0;
		for(char i = s;i<=e;i++)
		{
			System.out.print((i)+" ");
			if((count)%20==19)
				System.out.println();
			count++;
		}
		
	}

}