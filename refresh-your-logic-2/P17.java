import java.util.*;
import java.io.*;
class Person{
    int age;
    String name;
    Person(int age, String name){
       this.age=age;
       this.name=name;
       System.out.println("Person constructor called");
    }
    public void disp(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class Teacher extends Person{
    String subject;
    Teacher(int age, String name, String subject){
       super(age,name);
       this.subject=subject;
       System.out.println("Teacher constructor called");
    }
    public void disp(){
        super.disp();
        System.out.println("Subject: "+subject);
    }
}
class P17{
    public static void main(String args[]){
        Teacher t=new Teacher(23,"Anu","Physics");
        t.disp();
    }
}