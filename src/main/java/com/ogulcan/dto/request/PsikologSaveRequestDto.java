package com.ogulcan.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PsikologSaveRequestDto {

    String ad;
    String unvan;
    String username;
    String password;
    String email;
}
