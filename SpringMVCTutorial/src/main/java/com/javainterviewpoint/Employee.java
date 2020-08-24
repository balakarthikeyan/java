package com.javainterviewpoint;

import java.io.Serializable;

public class Employee implements Serializable 
{
    private static final long serialVersionUID = -1280037900360314186L;

    private Integer id;
    private String name;
    private Float salary;
    private String designation;
    public Employee()
    {
        super();
    }
    public Employee(Integer id, String name, Float salary, String designation)
    {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }
    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Float getSalary()
    {
        return salary;
    }
    public void setSalary(Float salary)
    {
        this.salary = salary;
    }
    public String getDesignation()
    {
        return designation;
    }
    public void setDesignation(String designation)
    {
        this.designation = designation;
    }
    
    @Override
    public String toString()
    {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
    }
}