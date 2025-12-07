import java.util.*;
class IntRev{
	int rev(int n){   // Method to reverse a given integer
		int rev=0;
		while(n!=0){   // Reverse logic 
			rev=rev*10+(n%10);
			n=n/10;
		}
		return rev;
	}
	boolean isPalindrome(int n){  // Method to check whether the number is a palindrome
		return n==rev(n);
	}
}
class PalCheck{  // Main class for menu-driven program
	public static void main(String args[]){
		Scanner s =new Scanner(System.in);
		IntRev obj=new IntRev();
		int ch;
		do{
			System.out.println("1.Check for palindrome");
			System.out.println("2.Exit");
			System.out.println("Enter your choice: ");
   			ch=s.nextInt();
			switch(ch){
				case 1:
					System.out.println("Enter number: ");
					int num=s.nextInt();
					System.out.println(obj.isPalindrome(num));
					break;
				case 2:
					break;
				default:
					System.out.println("Wrong choice");
			}
		}while(ch!=2);
	}
}