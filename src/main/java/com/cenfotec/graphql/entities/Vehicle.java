package com.cenfotec.graphql.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;

import java.io.Serializable;

@Data
@EqualsAndHashCode
@Entity
public class Vehicle {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "type", nullable = false)
    private String type;
    @Column(name = "model_code", nullable = false)
    private String modelCode;
    @Column(name = "brand_name")
    private String brandName;
    @Column(name = "launch_date")
    private LocalDate launchDate;
    private transient String formattedDate;
    public String getFormattedDate() {
        return getLaunchDate().toString();
    }
}
