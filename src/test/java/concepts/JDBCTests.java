package concepts;

import java.sql.*;

public class JDBCTests {
    public static void main(String[] args) throws SQLException {

        String JDBCURL= "jdbc:mysql://localhost:3306/bookshop";
        Connection conn = DriverManager.getConnection(JDBCURL,"root","Quest@sql1");
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM books");
        ResultSet rs= ps.executeQuery();

        while(rs.next()){
            System.out.println(rs.getString("author_fname"));
        }




    }






}
