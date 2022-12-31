package com.itgarden.tamil;

import org.springframework.web.bind.annotation.*;

import java.net.URLDecoder;
import java.net.URLEncoder;

@RestController
public class TestController {

    //  http://localhost:8080/display - URL or API Endpoint

    @GetMapping("/display")
    public String print() {
        return "This is my First Spring Boot Application";
    }

//    http://localhost:8080/employee
    @GetMapping("/employee")
    public Employee getEmployeeInfo(@RequestParam("employeeId") String employeeId,
                                    @RequestParam("employeeName") String employeeName,
                                    @RequestParam("address") String address,
                                    @RequestParam(value = "type",required = false,defaultValue = "Permanent") String employeeType) {
        Employee employee = new Employee(employeeId, employeeName, address,employeeType);
        return employee;
    }

//    http://localhost:8080/employee/post
    @PostMapping("/employee/post")
    public Employee getEmployeeInfoPost(@RequestParam("employeeId") String employeeId,
                                    @RequestParam("employeeName") String employeeName,
                                    @RequestParam("address") String address,
                                    @RequestParam(value = "type",required = false,defaultValue = "Permanent") String employeeType) {
        Employee employee = new Employee(employeeId, employeeName, address,employeeType);
        return employee;
    }


//    http://localhost:8080/create
    @PostMapping("/create")
    public Employee create(@RequestBody Employee employee) {
        // this data will send to database
        // if employee created successfully in the database
        // it will create success message or employee full information
        System.out.println("Employee No " + employee.getEmployeeId());
        System.out.println("Employee Name " + employee.getEmployeeName());
        System.out.println("Employee Address " + employee.getAddress());
        System.out.println("Employee Type " + employee.getEmployeeType());
        return employee;
    }



    @GetMapping("/ascii") // http://localhost:8080/ascii
    public String ascii(@RequestParam ("data") String data){
        return "Client sent value is " + data;
    }

}
