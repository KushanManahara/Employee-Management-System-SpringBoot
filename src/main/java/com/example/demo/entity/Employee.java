// src/main/java/com/example/demo/entity/Employee.java

package com.example.demo.entity;

import jakarta.persistence.*;

/**
 * Represents an Employee entity in the system.
 * This class is annotated with {@link Entity} to indicate that it is a JPA entity.
 */
@Entity
public class Employee {
    
    /**
     * The unique identifier for the Employee.
     * It is annotated with {@link Id} to indicate that it is the primary key.
     * The generation strategy is set to {@link GenerationType#IDENTITY} to automatically generate the id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    /**
     * The name of the Employee.
     */
    private String name;
    
    /**
     * The department of the Employee.
     */
    private String department;
    
    /**
     * The email of the Employee.
     */
    private String email;
    
    // Getters and Setters
    
    /**
     * Returns the id of the Employee.
     * @return the id
     */
    public Long getId() {
        return id;
    }
    
    /**
     * Sets the id of the Employee.
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * Returns the name of the Employee.
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the name of the Employee.
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Returns the department of the Employee.
     * @return the department
     */
    public String getDepartment() {
        return department;
    }
    
    /**
     * Sets the department of the Employee.
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }
    
    /**
     * Returns the email of the Employee.
     * @return the email
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * Sets the email of the Employee.
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
