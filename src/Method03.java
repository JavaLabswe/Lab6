import java.util.Scanner;
public class Method03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer : ");
		String n = in.next();
		sum(n);
	}
	public static void sum(String n) {
		int sum=0,a=0;
		for(int i=0;i<n.length();i++) {
			char c = n.charAt(i);
			sum=sum+a;
			switch(c) {
			case '0' : a=0;
			break ;
			case '1' : a=1;
			break ;
			case '2' : a=2;
			break ;
			case '3' : a=3;
			break ;
			case '4' : a=4;
			break ;
			case '5' : a=5;
			break ;
			case '6' : a=6;
			break ;
			case '7' : a=7;
			break ;
			case '8' : a=8;
			break ;
			case '9' : a=9;
			break ;
			}
			}
		System.out.print("The sum is " + sum);
	}
	}

