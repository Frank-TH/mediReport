package com.medireport.domain;

import java.time.LocalDateTime;
import java.util.List;


public class Order {

    private int orderId;
    private String patientId;
    private String adviserId;
    private LocalDateTime date;
    private List<Detail> exams;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getPatient() {
        return patientId;
    }

    public void setPatient(String patient) {
        this.patientId = patient;
    }

    public String getAdviser() {
        return adviserId;
    }

    public void setAdviser(String adviser) {
        this.adviserId = adviser;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public List<Detail> getExams() {
        return exams;
    }

    public void setExams(List<Detail> exams) {
        this.exams = exams;
    }
}
