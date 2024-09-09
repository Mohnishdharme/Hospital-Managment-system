package com.mdcorporation.hospital.entity;

import javax.persistence.*;

@Entity
@Table(name = "doctors")
public class Staff {

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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Column(nullable = false)  // position must not be null
    private String position;
    

    @Column(nullable = false)  // Specialization must not be null
    private String specialization;

    // Default constructor
    public Staff() {}

    // Parameterized constructor
    public Staff(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
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

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", mobile=" + mobile
				+ ", position=" + position + ", specialization=" + specialization + "]";
	}
}
