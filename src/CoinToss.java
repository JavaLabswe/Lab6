import java.util.Scanner;
public class CoinToss {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double  x=0;
		boolean Head;
		System.out.print("input : ");
		int n = in.nextInt();												
		for(int i=1;i<=n;i++) {
			Head = toosFlip();
			if(Head) {
				System.out.println("Head");
				x++;
			}
			else {
				System.out.println("Tail");
			}
		}
		System.out.println(x+"/"+n+"="+((x/n)*100)+"%");
	}
		public static boolean toosFlip(){
			double randValue = Math.random();
			if(randValue>=0.5) {
				return true;
			}
			return false;
		}
}