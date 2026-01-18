package org.jay.springjdbcapplication.entity;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class employee {

    private int id;
    private String name;
    private BigDecimal salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
