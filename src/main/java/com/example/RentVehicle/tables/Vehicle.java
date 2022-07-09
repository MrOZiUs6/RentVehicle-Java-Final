package com.example.RentVehicle.tables;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @Column(name = "serial_number", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_model_type", nullable = false)
    private Model idModelType;

    @Column(name = "life_time", nullable = false)
    private Integer lifeTime;

    @Column(name = "rental_price", nullable = false)
    private BigDecimal rentalPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Model getIdModelType() {
        return idModelType;
    }

    public void setIdModelType(Model idModelType) {
        this.idModelType = idModelType;
    }

    public Integer getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(Integer lifeTime) {
        this.lifeTime = lifeTime;
    }

    public BigDecimal getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(BigDecimal rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

}