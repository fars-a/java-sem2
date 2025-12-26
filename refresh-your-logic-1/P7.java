import java.util.*;
class MaxNum{
	int maxTwo(int a,int b){
		if(a>b){
			return a;
		}
		else{
			return b;
		}
	}
}
class P7{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		MaxNum m=new MaxNum();
		int ch;
		do{
			System.out.println("1.Max of number");
			System.out.println("2.Exit");
			System.out.println("Enter your choice: ");
			ch=s.nextInt();
			switch(ch){
				case 1:
				System.out.println("Enter a b c: ");
				int a=s.nextInt();
				int b=s.nextInt();
				int c=s.nextInt();
				int max=m.maxTwo(m.maxTwo(a,b),c);
				System.out.println("Max= "+max);
			case 2:
				break;
			default:
				System.out.println("Wrong Choice");
			}
		}while(ch!=2);
	}
}