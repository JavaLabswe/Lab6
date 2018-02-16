import java.util.Scanner;

public class fourteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Input : ");
		String input = in.next();
		int output = countA(input);
		System.out.print("Output : "+output);
	}

	private static int countA(String input) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = 0 ; i < input.length() ;i++)
		{
			if(input.toUpperCase().charAt(i)=='A')
				count++;
		}
		return count;
	}

}
