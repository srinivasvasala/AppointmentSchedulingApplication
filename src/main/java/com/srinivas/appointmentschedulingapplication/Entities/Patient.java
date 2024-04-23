package com.srinivas.appointmentschedulingapplication.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String name;
   @ManyToMany(mappedBy = "patients")
   private Set<Appointment> appointmentS;
    public Patients(String patientName) {
        this.patientName = patientName;
    }
}
