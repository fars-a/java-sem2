import java.util.*;
class Student{
    int sno;
    String sname;
    String sprogram;
    void read(Scanner s){
        System.out.println("Enter student no: ");
        sno=s.nextInt();
        s.nextLine();
        System.out.println("Enter name: ");
        sname=s.nextLine();
        System.out.println("Enter course: ");
        sprogram=s.nextLine();
    }
    void disp(){
        System.out.println("No: "+sno);
        System.out.println("Name: "+sname);
        System.out.println("Course: "+sprogram);
    }
    boolean comp(Student s){
        return(this.sno==s.sno && this.sname.equalsIgnoreCase(s.sname) && this.sprogram.equalsIgnoreCase(s.sprogram));
    }
}
class P14{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Student s1=new Student();
        Student s2=new Student();
        int ch;
        do{
            System.out.print("\n1.Enter student details\n2.Display details\n3.Compare\n4.Exit\nEnter your chocie: ");
            ch=s.nextInt();
            s.nextLine();
            switch(ch){
                case 1:
                    System.out.println("---Enter details of student 1---");
                    s1.read(s);
                    System.out.println("---Enter details of student 2---");
                    s2.read(s);
                    break;
                case 2:
                    System.out.println("---student 1---");
                    s1.disp();
                    System.out.println("---student 2---");
                    s2.disp();
                    break;
                case 3:
                    if(s1.comp(s2)){
                        System.out.println("The students are same");
                    }
                    else{
                        System.out.println("The students are not same");
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