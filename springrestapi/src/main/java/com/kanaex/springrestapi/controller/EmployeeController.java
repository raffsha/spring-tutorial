package com.kanaex.springrestapi.controller;

import com.kanaex.springrestapi.dao.EmployeeDAO;
import com.kanaex.springrestapi.model.Employee;
import com.kanaex.springrestapi.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

//In Spring, a controller class, which is capable of serving REST API requests, is called rest controller.
// It should be annotated with @RestController annotation.
//        The resource uris are specified in @RequestMapping annotations.
//        It can be applied at class level and method level both.
//        Complete URI for an API is resolved after adding class level path and method level path.
//        We should always write produces and consumes attributes to specify the media type attributes for the API.
//        Never reply on assumptions.
//        In given controller, we have two API methods. Feel free to add more methods as needed.
//
//        HTTP GET /employees – Returns list of the employees.
//        HTTP POST /employees – Add an employee in the employees collection.

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController  {

    @Autowired
    private EmployeeDAO employeeDao;

    @GetMapping(path="/", produces = "application/json")
    public Employees getEmployees(){
        return employeeDao.getAllEmployees();
    }

    @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee){
        Integer id = employeeDao.getAllEmployees().getEmployeeList().size()+1;
        employee.setId(id);

        employeeDao.addEmployee(employee);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(employee.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }
}
