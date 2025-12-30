import java.util.*;
class P9{
    public static void main(String args[]){
        int[][] board={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,15,11},
            {13,0,14,12}
        };
        int e_row=3;
        int e_col=2;
        Scanner s=new Scanner(System.in);
        while(true){
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    if(board[i][j]==0){
                        System.out.print("\t");
                    }
                    else{
                        System.out.print(board[i][j]+"\t");
                    }
                }
                System.out.println();
            }
            boolean won=true;
            int count=1;
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    if(i==3 && j==3){
                        if(board[i][j]!=0){
                            won=false;
                        }
                    }
                    else{
                        if(board[i][j]!=count){
                            won=false;
                        }
                    }
                    count++;
                }
            }
            if(won){
                System.out.println("CONGRATULATIONS!");
                break;
            }
            System.out.println("Enter tile number to move: ");
            int tile=s.nextInt();
            if(tile==0){
                break;
            }
            int t_row=-1;
            int t_col=-1;
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    if(board[i][j]==tile){
                        t_row=i;
                        t_col=j;
                    }
                }
            }
            boolean canMove=false;
            if(t_row-1==e_row && t_col==e_col){
                canMove=true;
            }
            if(t_row+1==e_row && t_col==e_col){
                canMove=true;
            }
            if(t_row==e_row && t_col-1==e_col){
                canMove=true;
            }
            if(t_row==e_row && t_col+1==e_col){
                canMove=true;
            }
            if(canMove){
                board[e_row][e_col]=tile;
                board[t_row][t_col]=0;
                e_row=t_row;
                e_col=t_col;
            }
            else{
                System.out.println("INAVLID MOVE!");
            }
        }
    }
}