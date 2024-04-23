package com.srinivas.appointmentschedulingapplication.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplointmentDto {
    private String patientName;
    private Long doctorId;
    private String specialisation;
    private LocalDate date;
    private LocalTime time;
}
