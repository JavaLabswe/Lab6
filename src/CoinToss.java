import java.util.Scanner;
public class CoinToss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("input :");
		int n=in.nextInt();
		double count=0;
		for(int i=1;i<=n;i++) {
		if(toosFlip()) {
			System.out.println("head");
			count++;
		}
		else {
			System.out.println("tail");
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
