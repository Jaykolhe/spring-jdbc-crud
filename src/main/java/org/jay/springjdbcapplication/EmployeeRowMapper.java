package org.jay.springjdbcapplication;

import org.jay.springjdbcapplication.entity.employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper  implements RowMapper<employee> {

    @Override
    public employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        employee emp = new employee();
        emp.setId(rs.getInt("id"));
        emp.setName(rs.getString("name"));
        emp.setSalary(rs.getBigDecimal("salary"));
        return emp;
    }



}
