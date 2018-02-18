import java.util.Scanner;
public class no4eng {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter start char: ");
		char c = in.next().charAt(0);
		System.out.print("Enter stop char: ");
		char s = in.next().charAt(0);
		char20(c,s);
	}
	public static void char20(char c, char s) {
		int C=(int)c;
		for(int i = c;i<=s;i++)
		{
			System.out.print(((char)i)+" ");
			if((i-C)%20==19)
				System.out.println();
		}
	}
}