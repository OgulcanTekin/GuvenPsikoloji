package com.ogulcan.repository.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "tblrandevu")
@Entity
public class Randevu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    LocalDate date;
    Long danisanId;
    Long psikologId;
}
