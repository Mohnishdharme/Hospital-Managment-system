package com.mdcorporation.hospital.entity;

import javax.persistence.*;

@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-increment ID
    private int id;

    @Column(nullable = false)  // Name must not be null
    private String name;

    @Column(nullable = false)  // Age must not be null
    private int age;

    @Column(nullable = false)  // Gender must not be null
    private String gender;
    
    @Column(nullable = false)
    private String mobile;  // Changed to String for mobile numbers (avoids issues with long values and formats)
    
    @Column(name = "patient_condition", nullable = false)  // Renamed column to avoid reserved keyword 'condition'
    private String condition;

    // Default constructor
    public Patient() {}

    // Parameterized constructor
    public Patient(String name, int age, String gender, String mobile, String condition) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mobile = mobile;
        this.condition = condition;
    }

    // Getters and Setters
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", mobile=" + mobile
                + ", condition=" + condition + "]";  // Updated to reflect new column name
    }
}
