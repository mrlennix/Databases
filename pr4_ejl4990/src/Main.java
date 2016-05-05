import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;

public class Main
{
    private static final String url = "jdbc:mysql://omega.uta.edu/db?user=ejl4990&password=19ynam";

    public static void main(String[] args)
    {
         String pass;
        Scanner keyboard = new Scanner(System.in);
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            //System.out.println("Enter Database password to start:");
            //pass  = keyboard.nextLine();
            DriverManager.getConnection(url);
        } catch (ClassNotFoundException e) {
           System.err.println("JDBC Didn't work closing now");
            System.exit(1);
        } catch (SQLException e) {
            System.err.println("Connection err");
            System.exit(1);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.exit(1);
        }
        System.out.println("Worked!");
    }
}
