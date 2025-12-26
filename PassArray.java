import java.util.*;
class PA{
	void dispArray(int a[]){  //Display array using array length
        	System.out.print("Display array(Method 1): ");
        	for(int i=0;i<a.length;i++){
            		System.out.print(a[i]+" ");
		}
        	System.out.println();
    	}
    	void dispArraySize(int a[],int n){   //Display array using size passed separately
        	System.out.print("Display array(Method 2): ");
        	for(int i=0;i<n;i++){
            		System.out.print(a[i] + " ");
		}
        	System.out.println();
    	}
}	
class P5{  // Main class
	public static void main(String args[]){
        	Scanner s=new Scanner(System.in);
	        System.out.print("Enter number of elements: ");
        	int n =s.nextInt();
	        int a[]=new int[n];
	        System.out.println("Enter "+n+" elements: ");
        	for(int i=0;i<n;i++){
	        	a[i]=s.nextInt();
	        }
	        PA obj=new PA();
        	obj.dispArray(a);
        	obj.dispArraySize(a,n);
    }
}
