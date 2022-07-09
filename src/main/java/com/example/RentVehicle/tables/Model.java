package com.example.RentVehicle.tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "model")
public class Model {
    @Id
    @Column(name = "id_model_type", nullable = false)
    private Integer id;

    @Column(name = "model_type", nullable = false, length = 50)
    private String modelType;

    @Column(name = "number_of_wheels")
    private Integer numberOfWheels;

    @Column(name = "number_of_seats", nullable = false)
    private Integer numberOfSeats;

    @Column(name = "wheel_size", nullable = false)
    private Integer wheelSize;

    @Column(name = "wheel_type", nullable = false, length = 50)
    private String wheelType;

    @Column(name = "frame_type", nullable = false, length = 50)
    private String frameType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(Integer numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Integer getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(Integer wheelSize) {
        this.wheelSize = wheelSize;
    }

    public String getWheelType() {
        return wheelType;
    }

    public void setWheelType(String wheelType) {
        this.wheelType = wheelType;
    }

    public String getFrameType() {
        return frameType;
    }

    public void setFrameType(String frameType) {
        this.frameType = frameType;
    }

}