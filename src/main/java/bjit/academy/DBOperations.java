package bjit.academy;

import java.sql.*;

public class DBOperations {
    Connection conn;
    Statement stmt;
    public void doConnectDB() {
        String connectionStr = "jdbc:mysql://localhost:3306/"+Utils.DB_NAME;
        String userName = "root";
        String password = "";
        try {
            conn = DriverManager.getConnection(connectionStr, userName, password);
            stmt = conn.createStatement();
            System.out.println("DB Connection is successful!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void fetchEmployeeData() {
        try {
            ResultSet rs = stmt.executeQuery("SELECT employee.first_name, employee.last_name, employee.salary, department.department_name, employee_role.role_title\n" +
                    "FROM employee\n" +
                    "INNER JOIN department ON employee.department_id = department.department_id\n" +
                    "INNER JOIN employee_role ON employee.role_id = employee_role.role_id;");
            while (rs.next()) {
                String first_name = rs.getString(1);
                String last_name = rs.getString(2);
                int salary = rs.getInt(3);
                String department = rs.getString(4);
                String role = rs.getString(5);
                System.out.println("Name: " + first_name + " " + last_name + ", Salary: " +
                        salary + ", Department: " + department + ", Job Title: " + role);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addEmployee(Employee employee) {
        try {
            int count = stmt.executeUpdate("INSERT INTO employee (first_name, last_name, address, salary, department_id, role_id)\n" +
                    "VALUES ('"+employee.getFirstName()+"', '"+employee.getLastName()
                    +"', '"+employee.getAddress()+"', "+employee.getSalary()+", "+employee.getDepartmentID()+", "
                    +employee.getRoleID()+")");
            System.out.println("Row inserted.............................");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
//
//    public void deleteEmployee() {
//        try {
//            ResultSet rs = stmt.executeQuery("SELECT * FROM employee;");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
}