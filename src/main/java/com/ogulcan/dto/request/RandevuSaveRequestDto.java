package com.ogulcan.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RandevuSaveRequestDto {
    String token;
    Long danisanId;
    Long psikologId;
    LocalDate date;
}
