package com.ogulcan.repository.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "tbldanisan")
@Entity
public class Danisan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ad;
    String telefon;
    String adres;
    String username;
    String password;
    String email;
}
