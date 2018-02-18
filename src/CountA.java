import java.util.Scanner;
public class CountA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner inp = new Scanner(System.in);
	System.out.print("Input : ");
	String input = inp.next();
	int output = countA(input);
	System.out.print("Output : "+output);
}

	public static int countA(String input) {
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
