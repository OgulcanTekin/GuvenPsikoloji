package com.ogulcan.controller;


import com.ogulcan.dto.request.PsikologSaveRequestDto;
import com.ogulcan.dto.request.RandevuSaveRequestDto;
import com.ogulcan.repository.entity.Danisan;
import com.ogulcan.repository.entity.Randevu;
import com.ogulcan.service.PsikologService;
import com.ogulcan.service.RandevuService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.tokens.Token;

import javax.persistence.Id;

import static com.ogulcan.constants.EndPoints.*;

@RestController
// localhost:9090/psikolog
@RequestMapping(API+VERSION+RANDEVU)
@RequiredArgsConstructor
public class RandevuController {
    private final RandevuService randevuService;

    @GetMapping(SAVE)
    public ResponseEntity<String> save(RandevuSaveRequestDto dto){
        randevuService.saveDto(dto);
        return ResponseEntity.ok("Ok.");
    }

    @GetMapping(GETBYID)
    public ResponseEntity<Randevu> findById(Id id){
        return ResponseEntity.ok(randevuService.findById(id));
    }
}
