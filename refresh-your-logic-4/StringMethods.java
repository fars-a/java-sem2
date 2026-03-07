import java.util.*;
class StringMethods{
    public static void main(String args[]){
        int ch;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1.Compare\n2.Uppercase\n3.Lowercase\n4.Length\n5.Substring\n6.Reverse\n7.Exit");
            System.out.println("Enter choice: ");
            ch=sc.nextInt();
            sc.nextLine();
            String s=new String();
            String s1=new String();
            String s2=new String();
            switch(ch){
                case 1:
                    System.out.println("String 1: ");
                    s1=sc.nextLine();
                    System.out.println("String 2: ");
                    s2=sc.nextLine();
                    if(s1.equals(s2)){
                        System.out.println("same");
                    }
                    else{
                        System.out.println("different");
                    }
                    break;
                case 2:
                    System.out.println("String: ");
                    s=sc.nextLine();
                    System.out.println(s.toUpperCase());
                    break;
                case 3:
                    System.out.println("String: ");
                    s=sc.nextLine();
                    System.out.println(s.toLowerCase());
                    break;
                case 4:
                    System.out.println("String: ");
                    s=sc.nextLine();
                    int length=s.length();
                    System.out.println("Length: "+length);
                    break;
                case 5:
                    System.out.println("String: ");
                    s1=sc.nextLine();
                    System.out.println("Start: ");
                    int start=sc.nextInt();
                    System.out.println("End: ");
                    int end=sc.nextInt();
                    System.out.println(s1.substring(start,end));
                case 6:
                    String rev="";
                    System.out.println("String: ");
                    s=sc.nextLine();
                    for(int i=s.length()-1;i>=0;i--){
                        rev=rev+s.charAt(i);
                    }
                    System.out.println(rev);
                case 7:
                    break;
                default:
                    System.out.println("wrong choice!");
                    break;
            }
        }while(ch!=7);
    }
}