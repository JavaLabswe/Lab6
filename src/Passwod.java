import java.util.*;
public class Passwod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);  
        System.out.print("Please enter a Password: ");  
        String p = input.next();  
        if (isValid(p)) {  
            System.out.println("Password is valid: "+ p); 
        } 
        else {  
            System.out.println("Password is Invalid");  
        }  
    }  

    public static boolean isValid(String p) {  
        if (p.length() < 10) {    
            char c;  
            int count = 1;   
            for (int i = 0; i < p.length(); i++) {  
                c = p.charAt(i);  
                if (Character.isDigit(c)) {  
                    count++;  
                    if (count > 2)   {     
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
