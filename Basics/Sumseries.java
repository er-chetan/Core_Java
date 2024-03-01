import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sumseries {
    public void connection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "");
            System.out.println("Connection begin");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Sumseries s1 = new Sumseries();
        s1.connection();

    }
}
