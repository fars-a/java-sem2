import java.util.*;
class Polygon{
    void feature(){
        System.out.println("Polygon is a closed figure");
    }
}
class Sides{
    void length(){
        System.out.println("Side has specific length");
    }
}
class Quadrilateral extends Polygon{ //ISA : Quadrilateral is a Polygon
    Sides side;   //HASA: Quadrilateral has sides
    Quadrilateral(){
        side=new Sides();
    }
    void print_quad(){
        side.length();
        System.out.println("Quadrilateral is a polygon that has four sides");
    }
}
class P15{
    public static void main(String args[]){
        Quadrilateral q=new Quadrilateral();
        q.feature();  //ISA
        q.print_quad();  //HASA
    }
}