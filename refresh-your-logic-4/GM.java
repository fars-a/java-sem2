class GM{
    public static <E> void print(E[] e){
        for(int i=0;i<e.length;i++){
            System.out.println(e[i]);
        }
    }
    public static void main(String args[]){
        Integer[] intarray={1,2,3,4,5};
        Character[] chararray={'o','k'};
        Double[] doublearray={1.1,2.4,3.7,4.8,5.0};
        print(intarray);
        print(chararray);
        print(doublearray);
    }
}