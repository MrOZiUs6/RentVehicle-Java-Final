package com.example.RentVehicle.tables;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "contract")
public class Contract {
    @Id
    @Column(name = "id_contract", nullable = false)
    private Integer id;

    @Column(name = "date_of_conclusion", nullable = false)
    private Instant dateOfConclusion;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_employee", nullable = false)
    private Employee idEmployee;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "document_number", nullable = false)
    private Client documentNumber;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "serial_number", nullable = false)
    private Vehicle serialNumber;

    @Column(name = "final_price", nullable = false)
    private BigDecimal finalPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getDateOfConclusion() {
        return dateOfConclusion;
    }

    public void setDateOfConclusion(Instant dateOfConclusion) {
        this.dateOfConclusion = dateOfConclusion;
    }

    public Employee getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Employee idEmployee) {
        this.idEmployee = idEmployee;
    }

    public Client getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(Client documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Vehicle getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Vehicle serialNumber) {
        this.serialNumber = serialNumber;
    }

    public BigDecimal getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(BigDecimal finalPrice) {
        this.finalPrice = finalPrice;
    }

}