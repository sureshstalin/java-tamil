package com.itgarden.tamil;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    //  http://localhost:8080/display - URL or API Endpoint

    @GetMapping("/display")
    public String print() {
        return "This is my First Spring Boot Application";
    }

//    http://localhost:8080/employee
//    @GetMapping("/employee")
//    public Employee getEmployeeInfo() {
//        Employee employee = new Employee("100","Suresh Stalin","Chennai");
//        return employee;
//    }

    @GetMapping("/employee")
    public Employee getEmployeeInfo(@RequestParam("employeeId") String employeeId,
                                    @RequestParam("employeeName") String employeeName,
                                    @RequestParam("address") String address,
                                    @RequestParam(value = "type",required = false,defaultValue = "Permanent") String employeeType) {
        Employee employee = new Employee(employeeId, employeeName, address,employeeType);
        return employee;
    }
}
