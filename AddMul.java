import java.util.*;
class OpMatrix{
	int[][] readMatrix(Scanner s){      //Read a matrix from user input
		System.out.println("Enter no: of rows: ");
		int r=s.nextInt();  // number of rows
		System.out.println("Enter no: of cols: ");
		int c=s.nextInt();  // number of columns
		System.out.println("Enter matrix:");
		int[][] m=new int[r][c];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				m[i][j]=s.nextInt();
			}
		}
		return m;
	}
        void displayMatrix(int[][] m){      //Display a matrix
		if(m==null){
			System.out.println("Enter the matrix first!");
			return;
		}
		else{
			System.out.println("matrix: ");
			for(int i=0;i<m.length;i++){
				for(int j=0;j<m[0].length;j++){
					System.out.print(m[i][j]+"\t");
				}
				System.out.println();
			}
		}
	}
	int[][] addMatrix(int[][] a,int[][] b){   //Add two matrices -
        	if(a==null||b==null){
      			System.out.println("Both matrices must be entered first!");
            		return null;
        	}
        	if(a.length!=b.length||a[0].length!=b[0].length){
            		System.out.println("Addition not possible!");
            		return null;
        	}
        	int[][] r = new int[a.length][a[0].length];
        		for(int i=0;i<a.length;i++){
            			for(int j=0;j<a[0].length;j++){
			                r[i][j] = a[i][j] + b[i][j];
            			}
        		}
        	return r;
    	}
	int[][] multiplyMatrix(int[][] a,int[][] b){   //Multiply two matrices 
        	if(a==null||b==null){
        		System.out.println("Both matrices must be entered first!");
            		return null;
        	}
        	if(a[0].length!=b.length){
        		System.out.println("Multiplication not possible!");
        		return null;
        	}
        	int[][] r=new int[a.length][b[0].length];
		for(int i = 0;i<a.length;i++){
        		for(int j=0;j<b[0].length;j++){
                		for(int k=0;k<a[0].length;k++){
                    			r[i][j]+=a[i][k]*b[k][j];
                		}
            		}
        	}
        	return r;
    	}
}
class AddMul{   //Main class 
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		OpMatrix obj=new OpMatrix();
		int[][] a=null;
		int[][] b=null;
		int ch;
		do{
			System.out.println("1.Read Matrix a");
			System.out.println("2.Read Matrix b");
			System.out.println("3.Add Matrix");
			System.out.println("4.Multiply Matrix");
			System.out.println("5.Exit");
			System.out.print("Enter your choice: ");
			ch=s.nextInt();
			switch(ch){
				case 1:
					a=obj.readMatrix(s);
					break;
				case 2:
					b=obj.readMatrix(s);
					break;
				case 3:
					int[][] add=obj.addMatrix(a,b);
                                        if(add!=null){
                  				System.out.println("Result of a + b:");
                        			obj.displayMatrix(add);
                    			}
                    			break;

				case 4:
					int[][] mul=obj.multiplyMatrix(a,b);
                    			if(mul!=null){
                        			System.out.println("Result of a * b:");
                        			obj.displayMatrix(mul);
                    			}
                    			break;
				case 5:
					break;
				default:
					System.out.println("Wrong Choice");
			}
		}while(ch!=5);
	}
}