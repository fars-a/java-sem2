class P23{
    static void test(int a,int b){
        try{
            int c=a/b;
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught!");
            throw e;
        }
        finally{
            System.out.println("Finally block in test() executed");
        }
    }
    public static void main(String args[]){
        try{
            test(5,0);
        }
        catch(ArithmeticException e){
            System.out.println("Exception handled in main");
        }
    }
}