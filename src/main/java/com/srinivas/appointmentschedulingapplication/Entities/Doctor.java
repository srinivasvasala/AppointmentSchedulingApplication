package com.srinivas.appointmentschedulingapplication.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "doctors")
public class Doctors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name="maxAppointments")
    private int maxAppointments;
    @Column(name="appointment_Date")
    private LocalDate date;
    @Column(name="appointment_Time")
    private LocalTime time;
    @Column(name="practice_location")
    private String location;
    @Enumerated(EnumType.STRING)
    @Column(name = "off_day")
    private DayOfWeek offDay = DayOfWeek.SUNDAY;

    @ManyToMany(mappedBy = "doctors")
    private Set<Appointment> appointments;

}
