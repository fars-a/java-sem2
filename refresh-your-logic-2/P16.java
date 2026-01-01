import java.util.*;
import java.io.*;
class Person{
    int age;
    String name;
    public void read(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name and age: ");
        name=s.nextLine();
        age=s.nextInt();
    }
    public void disp(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class Teacher extends Person{
    String subject;
    public void read(){
        super.read();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter subject: ");
        subject=s.nextLine();
    }
    public void disp(){
        super.disp();
        System.out.println("Subject: "+subject);
    }
}
class P16{
    public static void main(String args[]){
        Person p=new Person();
        Teacher t=new Teacher();
        p.read();
        p.disp();
        t.read();
        t.disp();
    }
}