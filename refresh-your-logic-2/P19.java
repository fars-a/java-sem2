interface Bird{
    public void color();
}
class Parrot implements Bird{
    public void color(){
        System.out.println("Parrot is green");
    }
}
class Crow implements Bird{
    public void color(){
        System.out.println("Crow is black");
    }
}
class P19{
    public static void main(String args[]){
        Bird b;
        b=new Parrot();
        b.color();  //Run-time polymorphism
        b=new Crow();
        b.color();  //Run-time polymorphism
    }
}