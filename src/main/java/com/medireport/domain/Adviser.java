package com.medireport.domain;

public class Adviser {

    private String idAdviser;
    private String names;
    private String lastname;
    private String phone;
    private String email;
    private String birthdate;

    public String getIdAdviser() {
        return idAdviser;
    }

    public void setIdAdviser(String idAdviser) {
        this.idAdviser = idAdviser;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
