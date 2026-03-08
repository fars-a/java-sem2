import java.sql.*;
import java.util.*;
class DBInsert{
    public static void main(String args[]) throws Exception{
        Scanner s=new Scanner(System.in);
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1522/XEPDB1","system","oracle");
        System.out.println("Connected: "+con);
        System.out.println("ID: ");
        int id=s.nextInt();
        s.nextLine();
        System.out.println("NAME: ");
        String name=s.nextLine();
        Statement st=con.createStatement();
        int i=st.executeUpdate("insert into testjava values(" +id+ ",'" +name+ "')");
        System.out.println(i+"record inserted");
        con.close();
    }
}
