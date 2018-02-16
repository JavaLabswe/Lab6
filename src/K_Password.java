import java.util.*;
public class K_Password {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);  
        System.out.print("Please enter a Password: ");  
        String pass = in.next(); 
        boolean p =isValid(pass);
        if (p) {  
            System.out.println("Valid Password"+": "+ pass); 
        } else {  
            System.out.println("Invalid Password");  
        }  
    }  

    public static boolean isValid(String password) {  
        if (password.length() < 10) {    
            char c;  
            int count = 1;   
            for (int i = 0; i < password.length(); i++) {  
                c = password.charAt(i);  
                if (Character.isDigit(c)) {  
                    count++;  
                    if (count > 2)   {     
                        return true;  
                    }     
                }  
            }
        } else {   
        	return false;
              
        }  
        return false;  
    }  
}