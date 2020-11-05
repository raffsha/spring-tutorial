package com.kanaex.springrestapi.dao;

import com.kanaex.springrestapi.model.Employee;
import com.kanaex.springrestapi.model.Employees;
import org.springframework.stereotype.Repository;

//DAO class uses a static list to store data.
// Here we need to implement actual database interaction.
@Repository
public class EmployeeDAO {
    private static Employees list = new Employees();

    static
    {
        list.getEmployeeList().add(new Employee(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Alex", "Kolenchiskey", "abc@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "David", "Kameron", "titanic@gmail.com"));
    }

    public Employees getAllEmployees(){
        return list;
    }

    public void addEmployee(Employee employee){
        list.getEmployeeList().add(employee);
    }
}
