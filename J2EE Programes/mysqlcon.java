import java.sql.*;

public class mysqlcon {

    public static void main(String[] args) throws ClassNotFoundException {
        try {

            Class.forName("con.mysql.jdbc.driver");
            Connection con = DriverManager.getConnection("jdbc :mysql:''localhost:3306/j2ee", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM stud_info");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "Id" + rs.getString(2) + "Name" + rs.getString(3) + "Address"
                        + rs.getInt(4) + "Age");

            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

    }
}