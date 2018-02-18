import java.util.Scanner;
public class CountA {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input : ");
		String a = in.next();
		System.out.print("Output : "+numCountA(a));
	}
	public static int numCountA(String a) {
		int count=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='a'||a.charAt(i)=='A') {
				count =count+1;
			}
		}
		return count;
	}
}
