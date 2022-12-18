import java.sql.*;

public class Oracleconnection {
    public static void main(String[] args) throws ClassNotFoundException {
        try {

            Class.forName("Oracle.jdbc.driver.oracledriver");
            Connection con = DriverManager.getConnection("JDBC : Oracle:Thin@Localhost:1521:XE", "System", "Admin");
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
