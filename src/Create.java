import java.util.Scanner;
public class Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Input:");
		int n=in.nextInt();
		int dow=0;
		while(n!=0) {
			dow=dow*10;
			dow=dow+(n%10);
			n=n/10;
			
		}
		System.out.print("output"+dow);
	}
	

}
