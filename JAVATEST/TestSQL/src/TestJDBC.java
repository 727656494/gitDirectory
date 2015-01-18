import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by admin on 2015/1/17.
 */
public class TestJDBC {
    public static void main(String args[]) {
        // Create a variable for the connection string.

        String url = "jdbc:sqlserver://192.168.2.245:1433;databaseName=PRICE_MONITOR;user=sa;password=3132_deeposh_0083";//sa身份连接

        // Declare the JDBC objects.
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Establish the connection.
            System.out.println("begin.");
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url);
            System.out.println("end.");

            // Create and execute an SQL statement that returns some data.
            String SQL = "SELECT *  FROM [dbo].[tb_City]";
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);

            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                System.out.println(rs.getString(4) + " " + rs.getString(6));
            }
        }

        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            if (rs != null)
                try {
                    rs.close();
                } catch (Exception e) {
                }
            if (stmt != null)
                try {
                    stmt.close();
                } catch (Exception e) {
                }
            if (con != null)
                try {
                    con.close();
                } catch (Exception e) {
                }
        }
    }
}
