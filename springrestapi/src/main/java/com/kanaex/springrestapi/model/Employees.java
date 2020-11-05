package com.kanaex.springrestapi.model;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
public class Employees {
    private List<Employee> employeeList;

    public List<Employee> getEmployeeList(){
        if(employeeList == null){
            employeeList = new ArrayList<>();
        }
        return employeeList;
    }


}
