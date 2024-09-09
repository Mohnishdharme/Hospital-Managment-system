package com.mdcorporation.hospital.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "appointments")
public class Appointment {

    // Primary key with auto-increment
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Many-to-one relationship: Many appointments can be associated with one patient
    // The 'patient_id' column in the 'appointments' table is a foreign key referencing the 'id' column in the 'patients' table
    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    // Many-to-one relationship: Many appointments can be associated with one doctor
    // The 'doctor_id' column in the 'appointments' table is a foreign key referencing the 'id' column in the 'doctors' table
    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false)
    private Staff doctor;

    // Appointment date, which cannot be null
    @Column(name = "appointment_date", nullable = false)
    private LocalDate appointmentDate;

    // Default constructor
    public Appointment() {}

    // Constructor to create an appointment with a specific patient, doctor, and appointment date
    public Appointment(Patient patient, Staff doctor, LocalDate appointmentDate) {
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentDate = appointmentDate;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Setter for ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter for Patient object
    public Patient getPatient() {
        return patient;
    }

    // Setter for Patient object
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    // Getter for Doctor object
    public Staff getDoctor() {
        return doctor;
    }

    // Setter for Doctor object
    public void setDoctor(Staff doctor) {
        this.doctor = doctor;
    }

    // Getter for appointment date
    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    // Setter for appointment date
    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    // toString method for easy debugging
    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", patient=" + patient.getName() +  // Retrieves the name of the patient associated with this appointment
                ", doctor=" + doctor.getName() +    // Retrieves the name of the doctor associated with this appointment
                ", appointmentDate=" + appointmentDate +
                '}';
    }
}
