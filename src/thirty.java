import java.util.Scanner;

public class thirty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Input : ");
		String input = in.next();
		String output = revertString(input);
		System.out.print("Output : "+output);
	}

	private static String revertString(String input) {
		String temp = "";
		for(int i = 0 ; i < input.length() ;i++)
		{
			temp = input.charAt(i) + temp;
		}
		return temp;
	}
	

}
