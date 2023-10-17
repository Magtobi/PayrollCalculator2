package com.pluralsight;

public class Employee {
    private int employeeID;
    private String name;
    private double hoursWorked;
    private double payRate;

    public Employee(int employeeID, String name, double hoursWorked, double payRate) {
        this.employeeID = Integer.parseInt(String.valueOf(employeeID));
        this.name = name;
        this.hoursWorked = Double.parseDouble(String.valueOf(hoursWorked));
        this.payRate = Double.parseDouble(String.valueOf(payRate));
    }

    public int getEmployeeID() {
        return this.employeeID;
    }
    public void setemployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHoursWorked() {
        return this.hoursWorked;
    }
    public void setHoursWorked() {
        this.hoursWorked = hoursWorked;
    }
    public double getPayRate() {
        return this.payRate;
    }
    public void setPayRate() {
        this.payRate = payRate;
    }
    public double getGrossPay() {
        double gross = 0.0;
        if(this.getHoursWorked() <= 40) {
            gross = this.getHoursWorked() * this.getPayRate();
        } else{
            gross = this.getPayRate() * 40;
            gross += ((this. getHoursWorked() - 40) * (this.getPayRate() * 1.5));
        }
        return gross;
    }
}
