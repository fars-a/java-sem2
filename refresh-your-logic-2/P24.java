import java.util.*;
class UDE extends Exception{       // User Defined Exception class
    String error;
    public UDE(){
        error="Invalid Password";
    }
    public UDE(String s){
        error=s;
    }
    public String showError(){
        return error;
    }
}
class P24{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        boolean special=false,digit=false,upper=false,lower=false;
        System.out.print("Enter the password: ");
        String pwd=sc.nextLine();
        try{
            for(int i=0;i<pwd.length();i++){      // check each character
                char ch=pwd.charAt(i);
                switch(ch){
                    case '@':
                    case '(':
                    case ')':
                    case '*':
                    case '{':
                    case '}':
                    case '[':
                    case ']':
                    case '=':
                        special=true;
                        break;
                    default:
                        if(Character.isUpperCase(ch)){
                            upper=true;
                        }
                        else if(Character.isLowerCase(ch)){
                            lower=true;
                        }
                        else if(Character.isDigit(ch)){
                            digit=true;
                        }
                }
                if(i>0 && ch==pwd.charAt(i-1)){
                    throw new UDE("Consecutive characters not allowed!");
                }
            }
            if(pwd.length()<8){
                throw new UDE("Password should contain atleast 8 characters!");
            }
            if(!upper){
                throw new UDE("Password must contain one Uppercase!");
            }
            if(!lower){
                throw new UDE("Password must contain one Lowercase!");
            }
            if(!digit){
                throw new UDE("Password must contain one Digit!");
            }
            if(!special){
                throw new UDE("Password must contain atleast one Special Character!");
            }
            System.out.println("valid password");
        }
        catch(UDE e){    // handle user defined exception
            System.out.println("Invalid Password: "+e.showError());
        }
    }
}