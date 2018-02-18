import java.util.Scanner;
public class CoinToss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter number of toss :");
		int n;
		double  count=0;
		boolean isHead;
		System.out.print("input :");
		n = inp.nextInt();												
		
		for(int i=1;i<=n;i++) {
			isHead = tossFlip();
			if(isHead) {
				System.out.println("Head");
				count++;
			}
			else {
				System.out.println("Tail");
			}
		}
		System.out.println("number of times the head is "+((count/n)*100)+"%");
	}
	public static boolean tossFlip() {
		double randvalue;
		randvalue = Math.random();
		if(randvalue>=0.5) {
			return true;
		}
		return false;
	}

}
