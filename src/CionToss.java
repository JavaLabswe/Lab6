import java.util.Scanner;

public class CionToss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int n;
		double  count=0;
		boolean isHead;
		System.out.println("input :");
		n = in.nextInt();												
		
		for(int i=1;i<=n;i++) {
			isHead = toosFlip();
			if(isHead) {
				System.out.println("Head");
				count++;
			}
			else {
				System.out.println("Tail");
			}
		}
		System.out.println(count+"/"+n+"="+((count/n)*100)+"%");
	}
		public static boolean toosFlip(){
			double randvalue;
			randvalue = Math.random();
			if(randvalue>=0.5) {
				return true;
			}
			return false;
		}
}
