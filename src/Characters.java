import java.util.Scanner;
public class Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter start char: ");
		char s = inp.next().charAt(0);
		System.out.print("Enter stop char: ");
		char e = inp.next().charAt(0);
		
		char20(s,e);
		
	}

	private static void char20(char s, char e) {
		int posS=(int)s;
		int posE=(int)e;
		for(int i = s;i<=e;i++)
		{
			System.out.print(((char)i)+" ");
			if((i-posS)%20==19)
				System.out.println();
		}
		
	}

}
