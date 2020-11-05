package com.kanaex.springbootcrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<EmployeeEntity>> getAllEmployees() throws RecordNotFoundException{
        List<EmployeeEntity> list = employeeService.getAllEmployees();

        return new ResponseEntity<List<EmployeeEntity>>(list, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeEntity> getEmployeeById(@PathVariable("id") Long id) throws RecordNotFoundException{
        EmployeeEntity entity = employeeService.getEmployeeById(id);

        return new ResponseEntity<EmployeeEntity>(entity, new HttpHeaders(), HttpStatus.OK);
    }



    @PostMapping
    public ResponseEntity<EmployeeEntity> createOrUpdateEmployee(@RequestBody EmployeeEntity employeeEntity) throws RecordNotFoundException {
        EmployeeEntity updated = employeeService.createOrUpdateEmployee(employeeEntity);
        return new ResponseEntity<>(updated, new HttpHeaders(), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteEmployeeById(@PathVariable("id") Long id)
        throws RecordNotFoundException {
        employeeService.deleteEmployeeById(id);
        return HttpStatus.FORBIDDEN;
    }


}
