package com.ogulcan.controller;


import static com.ogulcan.constants.EndPoints.*;

import com.ogulcan.dto.request.PsikologSaveRequestDto;
import com.ogulcan.repository.entity.Psikolog;
import com.ogulcan.service.PsikologService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// localhost:9090/psikolog
@RequestMapping(API+VERSION+PSIKOLOG)
@RequiredArgsConstructor
public class PsikologController {

    private final PsikologService psikologService;

    @GetMapping(SAVE)
    public ResponseEntity<String> save(PsikologSaveRequestDto dto){
        psikologService.saveDto(dto);
        return ResponseEntity.ok("Ok.");
    }
    @GetMapping(GETBYAD)
    public ResponseEntity<Psikolog> findByAd(String ad){
        return ResponseEntity.ok(psikologService.findByAd(ad));
    }

}
