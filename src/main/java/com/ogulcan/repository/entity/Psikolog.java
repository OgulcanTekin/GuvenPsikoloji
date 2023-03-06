package com.ogulcan.repository.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "tblpsikolog")
@Entity
public class Psikolog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ad;
    String unvan;
    String username;
    String password;
    String email;
}
