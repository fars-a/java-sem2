import java.util.*;
class P4{
	public static void main(String args[]){
      		int i=0,j=0;
		Scanner s=new Scanner(System.in);
		// Read number of elements
		System.out.println("Enter number of elements: ");
		int n=s.nextInt();
		int a[]=new int[n];   // Create array of size n
		System.out.println("Enter "+n+" elements");
		for(i=0;i<n;i++){
			a[i]=s.nextInt();    // Input array elements
		}
		// Bubble Sort algorithm to sort the array
		for(i=0;i<n-1;i++){
			for(j=0;j<n-1-i;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}	
		}
		System.out.println("Sorted array: ");
		for(i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int low=0,high=n-1,e;    // Binary Search
		boolean found=false;
		System.out.println("Enter element to search: ");
		e=s.nextInt();
                while(low<=high){
			int mid=(high+low)/2;
			if(e<a[mid]){
				high=mid-1;
		}
			else if(e>a[mid]){
				low=mid+1;
			}
			else{
				System.out.println(e+" found at position "+mid);
				found=true;
				break;
			}
		}
		if(!found){
			System.out.println("Element not found");
		}
	}
}