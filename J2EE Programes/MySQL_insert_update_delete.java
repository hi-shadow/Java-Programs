import java.security.DrbgParameters.NextBytes;
import java.sql.*;
import java.util.Scanner;

public class MySQL_insert_update_delete {
    public static void main(String[] args) throws ClassNotFoundException {
        try {

            Class.forName("con.mysql.jdbc.driver");
            Connection con = DriverManager.getConnection("jdbc :mysql:''localhost:3306/j2ee", "root", "");
          PreparedStatement ps = con.prepareStatement("INSERT INTO stud_info VALUES (?,?,?,?)");
          Scanner sc = new  Scanner(System.in);
          System.out.println("Id");
          int s_id = sc.nextInt();

          System.out.println("Name");
          String s_name = sc.next();

          System.out.println("Address");
          String  s_add= sc.next();

          System.out.println("Age");
          int s_age = sc.nextInt();

          ps.setInt(1 , s_id);
          ps.setString(2 , s_name);
          ps.setString(3 , s_add);
          ps.setInt(4, s_age);
            
          int Result = ps.executeUpdate();
          System.out.println("Number Of Inserted Record " +Result);

        //   DELETING

        PreparedStatement ps1 = con.prepareStatement("DELETE FROM stud_info WHERE s_id = ?");
       Scanner sc1 = new Scanner(System.in);
       int s_id1 = sc1.nextInt();
       int result1 = ps1.executeUpdate();

        System.out.println("number of deleted record " +result1);


        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

    }
    
}
