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
        Employee e1 = new Employee("Mahnoor", "Marium", "Banani", 90000, 1, 1);
        dbObj.addEmployee(e1);
        Employee e2 = new Employee("Shahriar", "Nafis", "Dhanmondi", 80000, 1, 1);
        dbObj.addEmployee(e2);
        dbObj.fetchEmployeeData();

        System.out.println("=============================================");

        System.out.println("Employees after deleting");
        dbObj.deleteEmployee();
        dbObj.fetchEmployeeData();
    }
}
