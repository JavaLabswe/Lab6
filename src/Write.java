import java.util.Scanner;
public class Write {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);  
        System.out.print("Please enter a Password: ");  
        String n = in.next();  
        if (isValid(n)) {  
            System.out.println("password is valid: "+ n); 
        } 
        else {  
            System.out.println("password is invalid");  
        }  
    }  

    public static boolean isValid(String n) {  
        if (n.length() < 10) {    
            char s;  
            int count=1;   
            for (int i=0;i<n.length();i++) {  
                s = n.charAt(i);  
                if (Character.isDigit(s)) {  
                    count++;  
                    if (count>2)   {     
                        return true;  
                    }     
                }  
            }
        }
        else {   
        	return false;     
        }  
        return false;  
    }  
}