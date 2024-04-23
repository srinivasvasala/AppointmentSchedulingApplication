package com.srinivas.appointmentschedulingapplication.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.type.descriptor.DateTimeUtils;

import java.math.BigInteger;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Appointments {
    @Id
    private BigInteger id;
    private  Doctors;
    private Patients;
    private DateTimeUtils dateTimeUtils;

}
