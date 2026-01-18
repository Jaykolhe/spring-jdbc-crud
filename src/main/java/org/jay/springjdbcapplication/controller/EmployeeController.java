package org.jay.springjdbcapplication.controller;

import org.jay.springjdbcapplication.entity.employee;
import org.jay.springjdbcapplication.repository.EmployeeDao;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


    private final EmployeeDao employeeDao;

    public EmployeeController(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @PostMapping("/create")
    public ResponseEntity<employee> createEmployee(@RequestBody employee employee) {

        System.out.println("Name = " + employee.getName());
        System.out.println("Salary = " + employee.getSalary());
        int id = employeeDao.save(employee);
        employee.setId(id);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(employee);
    }

    @GetMapping("/getEmployeeById/{id}")
    public ResponseEntity<employee> getEmployeeById(@PathVariable int id) {

        employee emp = employeeDao.findById(id);

        return ResponseEntity.ok(emp);
    }

    @GetMapping("/all")
    public ResponseEntity<List<employee>> getAllEmployee(){

        List<employee> employees = employeeDao.findALl();

        return ResponseEntity.ok(employees);
    }

    @PutMapping("/update")
    public ResponseEntity<employee> updateEmployee(@RequestBody employee employee){

        employeeDao.update(employee);

        return   ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(employee);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable int id){
        employeeDao.delete(id);

        return new ResponseEntity(HttpStatus.ACCEPTED);

    }


}

