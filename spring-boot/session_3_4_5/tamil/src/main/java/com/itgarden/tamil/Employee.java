package com.itgarden.tamil;

public class Employee {


    private String employeeId;

    private String employeeName;

    private String address;

    private String employeeType;
    public Employee(String employeeId,String employeeName,String address,String employeeType) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.address = address;
        this.employeeType=employeeType;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }
}
