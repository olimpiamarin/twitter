import java.sql.SQLException;

import static org.junit.Assert.*;

/**
 * Created by pia on 7/16/2016.
 */
public class AccessDBTest {

    public static void main(String[] args) {

        AccessDB ab = new AccessDB();
        try {
            ab.readTweets();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}