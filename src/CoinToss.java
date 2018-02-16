import java.util.Scanner;
public class CoinToss {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double c=0;
		int n = in.nextInt();
		for(int i=1;i<=n;i++) {
			boolean a = tossFlip();
			if(a == true) {
				c++;
			}
		}
		double avg = (c/n)*100;
		System.out.println("Percentage " + avg + " %");
	}
	public static boolean tossFlip() {
		
		double randvalue = (double)(Math.random());
		if(randvalue >= 0.5) {
			return true;
		}
		else {
			return false;
		}
	}
}
