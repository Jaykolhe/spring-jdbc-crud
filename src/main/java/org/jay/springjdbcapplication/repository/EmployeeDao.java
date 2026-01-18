package org.jay.springjdbcapplication.repository;

import org.jay.springjdbcapplication.EmployeeRowMapper;
import org.jay.springjdbcapplication.entity.employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDao {

    private final JdbcTemplate jdbcTemplate;


    public EmployeeDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public int save(employee emp){
        String sql = "Insert into employee(name,salary) values(?,?) RETURNING id";
        return jdbcTemplate.queryForObject(sql,Integer.class, emp.getName(),emp.getSalary());
    }


    public employee findById(int id){

        String sql = "Select * from employee where id = ?";
        return jdbcTemplate.queryForObject(sql,new EmployeeRowMapper(),id);
    }


    public List<employee> findALl(){

        String sql = "Select * from employee";

        return jdbcTemplate.query(sql,new EmployeeRowMapper());
    }

    public int update(employee emp){
        String sql = "Update employee set name=?,salary=? where id=?";

        return jdbcTemplate.update(sql,emp.getName(),emp.getSalary(),emp.getId());
    }

    public int delete(int id){

        String sql = "Delete from employee where id = ?";
        return jdbcTemplate.update(sql,id);
    }

}
