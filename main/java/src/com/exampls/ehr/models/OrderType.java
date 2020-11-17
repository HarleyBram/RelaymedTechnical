package com.exampls.ehr.models;

public class OrderType {
    private Long orderCode;
    private String orderDescription;
    private String specimen;

    public OrderType(Long orderCode, String orderDescription, String specimen) {
        this.orderCode = orderCode;
        this.orderDescription = orderDescription;
        this.specimen = specimen;
    }

    public Long getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(Long orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public String getSpecimen() {
        return specimen;
    }

    public void setSpecimen(String specimen) {
        this.specimen = specimen;
    }
}
