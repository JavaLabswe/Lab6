import java.util.Scanner;
public class countA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Input:");
		String n=in.next();
		int count=0;
		for(int i=0;i<n.length();i++) {
			if(n.charAt(i)=='a'||n.charAt(i)=='A') {
			count++;
			
			}
			
		}
		System.out.print("Output:"+count);
		
		
	}

}
