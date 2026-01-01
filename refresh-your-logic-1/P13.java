import java.util.*;
class CString{
    String str;
    CString(String str){
        this.str=str;
    }
    void read_Str(Scanner s){
        str=s.nextLine();
    }
    void disp_Str(){
        System.out.println(str);
    }
    boolean comp_Str(CString s){
        return str.equals(s.str);
    }
    void add_Str(CString str1,CString str2){
        str= str1.str+str2.str;
    }
    void conc_Str(CString s){
        str= str.concat(s.str);
    }
}
class P13{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int ch;
        CString str1=new CString("");
        CString str2=new CString("");
        CString r=new CString("");
        do{
            System.out.print("\n1.Read Strings\n2.Display\n3.Compare\n4.Add\n5.Concatenate\n6.Exit\nEnter your choice: ");
            ch=s.nextInt();
            s.nextLine();
            switch(ch){
                case 1:
                    System.out.println("String 1: ");
                    str1.read_Str(s);
                    System.out.println("String 2: ");
                    str2.read_Str(s);
                    break;
                case 2:
                    str1.disp_Str();
                    str2.disp_Str();
                    break;
                case 3:
                    if(str1.comp_Str(str2)){
                        System.out.println("Equal");
                    }
                    else{
                        System.out.println("Not equal");
                    }
                    break;
                case 4:
                    r.add_Str(str1,str2);
                    r.disp_Str();
                    break;
                case 5:
                    str1.conc_Str(str2);
                    System.out.print("Concatenated String: ");
                    str1.disp_Str();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Wrong chocie");
            }
        }while(ch!=6);
    }
}