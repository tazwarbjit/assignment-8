package bjit.academy;

import java.sql.SQLException;

public class Main {
    public static void main(String args[]) throws SQLException {
        DBOperations dbObj = new DBOperations();
        dbObj.doConnectDB();

        System.out.println("Existing default employees");
        dbObj.fetchEmployeeData();

        System.out.println("=============================================");

        System.out.println("Employees after adding");
        Employee newEmployee = new Employee("Mahnoor", "Marium", "Banani", 90000, 1, 1);
        dbObj.addEmployee(newEmployee);
        dbObj.fetchEmployeeData();
    }
}
