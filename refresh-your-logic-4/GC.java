import java.util.*;
class GStack <T>{
    int top=-1;
    ArrayList<T> stack=new ArrayList<T>();
    void push(T d){
        stack.add(d);
        top++;
    }
    void pop(){
        System.out.println(stack.remove(top--));
    }
}
class GC{
    public static void main(String args[]){
        GStack<Integer> gs=new GStack<Integer>();
        gs.push(12);
        gs.pop();
    }
}