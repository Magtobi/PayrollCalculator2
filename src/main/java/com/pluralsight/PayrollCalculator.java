package com.pluralsight;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class PayrollCalculator {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader bufreader = new BufferedReader(fileReader);
            String input;

            while ((input = bufreader.readLine()) != null) {
                String[] employee = input.split("\\|");
                int employeeID = Integer.parseInt(employee[0]);
                String name = employee[1];
                double hoursWorked = Double.parseDouble(employee[2]);
                double payRate = Double.parseDouble(employee[3]);

                Employee employ = new Employee(employeeID, name, hoursWorked, payRate);
                System.out.printf("Employee Id: %d, Name: %s, GrossPay: $%.2f%n", employ.getEmployeeID(), employ.getName(), employ.getGrossPay());
            }
            bufreader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}