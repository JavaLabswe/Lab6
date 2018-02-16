import java.util.Scanner;
public class CalTrippleX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter X : ");
		int x = in.nextInt();
		int a = trippleX(x);
		System.out.println("X = "+ a);
	}
	public static int trippleX(int a) {
		a = (int) Math.pow(a, 3);
		return a;
	}

}
