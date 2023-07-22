package com.medireport.domain;

import java.time.LocalDateTime;
import java.util.List;


public class Attention {

    private int attentionId;
    private String patientId;
    private String adviserId;
    private int quantity;
    private LocalDateTime date;
    private List<AttentionExam> exams;

    public int getAttentionId() {
        return attentionId;
    }

    public void setAttentionId(int attentionId) {
        this.attentionId = attentionId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getAdviserId() {
        return adviserId;
    }

    public void setAdviserId(String adviserId) {
        this.adviserId = adviserId;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public List<AttentionExam> getExams() {
        return exams;
    }

    public void setExams(List<AttentionExam> exams) {
        this.exams = exams;
    }
}
