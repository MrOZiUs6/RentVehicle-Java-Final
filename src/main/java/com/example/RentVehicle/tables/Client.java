package com.example.RentVehicle.tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @Column(name = "document_number", nullable = false, precision = 10)
    private BigDecimal id;

    @Column(name = "surname", nullable = false, length = 50)
    private String surname;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "patronymic", length = 50)
    private String patronymic;

    @Column(name = "telephone_number", nullable = false, precision = 11)
    private BigDecimal telephoneNumber;

    @Column(name = "password", nullable = false, length = 50)
    private String password;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public BigDecimal getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(BigDecimal telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}