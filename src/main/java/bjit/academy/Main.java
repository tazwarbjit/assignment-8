package bjit.academy;

import java.sql.SQLException;

public class Main {
    public static void main(String args[]) throws SQLException {
        DBOperations dbObj = new DBOperations();
        dbObj.doConnectDB();
        dbObj.fetchEmployeeData();
    }
}
