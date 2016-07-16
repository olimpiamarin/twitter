import java.sql.*;
import java.util.ArrayList;

/**
 * Created by pia on 7/16/2016.
 */
public class AccessDB {


    public static void readTweets() throws ClassNotFoundException, SQLException {
        try {// 1. load driver
            Class.forName("org.postgresql.Driver");

            // 2. define connection params to db
            final String URL = "jdbc:postgresql://54.93.65.5:5432/4_Olimpia";
            final String USERNAME = "fasttrackit_dev";
            final String PASSWORD = "fasttrackit_dev";

            // 3. obtain a connection
            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            // 4. create a query statement
            Statement st = conn.createStatement();

            // 5. execute a query
            ResultSet rs = st.executeQuery("SELECT content,insertdate FROM tweet");

            // 6. iterate the result set and print the values


            while (rs.next()) {
                System.out.println(rs.getString("content").trim());
                System.out.println("--");
                System.out.println(rs.getString("insertdate").trim());
            }


            // 7. close the objects
            rs.close();
            st.close();
            conn.close();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
         }

}
