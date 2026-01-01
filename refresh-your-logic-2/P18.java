//  Create a class for an employee having eno, ename and esal as data members. Provide 
// functions for reading, displaying, and comparing by eno. Accept n employees' 
// information in the main function, display the same, and search for an employee whose 
// eno is given. 

import java.util.*;
class Employee{
    int eno;
    String ename;
    int esal;
    void read(Scanner s){
        System.out.print("Enter eno: ");
        eno=s.nextInt();
        s.nextLine();
        System.out.print("Enter ename: ");
        ename=s.nextLine();
        System.out.print("Enter esal: ");
        esal=s.nextInt();
    }
    void disp(){
        System.out.println("Eno: "+eno);
        System.out.println("Ename: "+ename);
        System.out.println("Esal: "+esal);
    }
    boolean search(int id){
        return this.eno==id;
    }
}
class P18{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int ch;
        int id=0;
        int n=0;
        Employee e[]=null;
        do{
            System.out.println("\n1.Read Employee data\n2.Display details\n3.Search Employees\n4.Exit\nEnter your choice: ");
            ch=s.nextInt();
            s.nextLine();
            switch(ch){
                case 1:
                    System.out.println("Enter number of employees: ");
                    n=s.nextInt();
                    e=new Employee[n];
                    for(int i=0;i<n;i++){
                        System.out.println("---Employee "+(i+1)+"---");
                        e[i]=new Employee();
                        e[i].read(s);
                    }
                    break;
                case 2:
                    for(int i=0;i<n;i++){
                        System.out.println("---Employee "+(i+1)+"---");
                        e[i].disp();
                    }
                    break;
                case 3:
                    System.out.println("Enter id to search: ");
                    id=s.nextInt();
                    boolean found = false;
                    for(int i=0;i<n;i++){
                        if(e[i].search(id)){
                            System.out.println("Employee found!");
                            e[i].disp();
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                            System.out.println("Employee not found!");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Wrong choice!");
            }
        }while(ch!=4);
    }
}