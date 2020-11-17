package com.exampls.ehr.models;

import java.util.List;

public class Patient {
    private Long id;
    private int medicalRecordNumber;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String address;
    private List<PatientOrder> patientOrders;

    public Patient(Long id, int medicalRecordNumber, String firstName, String lastName, String dateOfBirth, String address, List<PatientOrder> patientOrders) {
        this.id = id;
        this.medicalRecordNumber = medicalRecordNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.patientOrders = patientOrders;
    }

    public Long getId() {
        return id;
    }

    public int getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(int medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<PatientOrder> getPatientOrders() {
        return patientOrders;
    }

    public void setPatientOrders(List<PatientOrder> patientOrders) {
        this.patientOrders = patientOrders;
    }
}
