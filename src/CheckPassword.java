import java.util.Scanner;
public class CheckPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner inp = new Scanner(System.in);
			System.out.print("Input a password :");
			String pas = inp.nextLine();
			ispass(pas);
	}
	public static  void ispass(String p) {
		boolean ans = true;
		char chpas;
		int k=0;
		if(p.length()<=10) {
			System.out.print("xxxx");
		}
		for(int i=1;i<=p.length();i++) {
		chpas = p.charAt(i);
		switch(p.charAt(i)) {
		case '1': k+=1;
		break;
		case '2': k+=1;
		break;
		case '3': k+=1;
		break;
		}
		}
		//return ans;
	}

}
