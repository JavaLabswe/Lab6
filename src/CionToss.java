import java.util.Scanner;

public class CionToss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int n;
		double  count=0;
		boolean H;
		System.out.print("input : ");
		n = in.nextInt();												
		
		for(int i=1;i<=n;i++) {
			H = toosFlip();
			if(H) {
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
			double value;
			value = Math.random();
			if(value>=0.5) {
				return true;
			}
			return false;
		}
}
