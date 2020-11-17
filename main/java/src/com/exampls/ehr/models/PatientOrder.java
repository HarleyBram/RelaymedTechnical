package com.exampls.ehr.models;

public class PatientOrder {
    private Long id;
    private String date;
    private Long orderCode;
    private String status;
    private OrderType orderType;
    private Patient patient;

    public PatientOrder(Long id, String date, Long orderCode, String status, OrderType orderType, Patient patient) {
        this.id = id;
        this.date = date;
        this.orderCode = orderCode;
        this.status = status;
        this.orderType = orderType;
        this.patient = patient;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(Long orderCode) {
        this.orderCode = orderCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public Patient getPatientID() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
