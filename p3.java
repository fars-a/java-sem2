import java.util.*;
class P3{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int secret=27;
		int guess;
		int attempts=0;
		System.out.println("Guess a number between 20 and 30");
		do{
			System.out.println("Guess Number: ");
			guess=s.nextInt();
			attempts++;
			if(guess>secret){
				System.out.println("Too High!");
			}
		        else if(guess<secret){
				System.out.println("Too Low!");
			}
			else{
				System.out.println("Your guess is correct");
				System.out.println("Number of attempts: "+attempts);
			}
		}while(guess!=secret);
	}
}

