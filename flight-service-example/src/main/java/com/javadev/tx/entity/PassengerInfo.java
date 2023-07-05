package com.javadev.tx.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="passenger_info")
public class PassengerInfo {
    @Id
    @GeneratedValue
    private Long pid;
    private String name;
    private String email;
    private String source;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date travelDate;
    private String destination;
    private String pickupTime;
    private String arrivalTime;
    private double fare;
}
