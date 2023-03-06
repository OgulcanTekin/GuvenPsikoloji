package com.ogulcan.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DanisanSaveRequestDto {
    String ad;
    String username;
    String password;
    String email;
    String adres;
    String telefon;
}
