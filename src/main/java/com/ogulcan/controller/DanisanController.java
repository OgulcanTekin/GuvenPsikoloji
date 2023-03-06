package com.ogulcan.controller;

import com.ogulcan.dto.request.DanisanSaveRequestDto;
import com.ogulcan.repository.entity.Danisan;
import com.ogulcan.service.DanisanService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.ogulcan.constants.EndPoints.*;

@RestController
// localhost:9090/danisan
@RequestMapping(API+VERSION+DANISAN)
@RequiredArgsConstructor
public class DanisanController {

    private final DanisanService danisanService;

    @GetMapping(SAVE)
    public ResponseEntity<String> save(DanisanSaveRequestDto dto){
        danisanService.saveDto(dto);
        return ResponseEntity.ok("Ok.");
    }
    @GetMapping(GETBYAD)
    public ResponseEntity<Danisan> findByAd(String ad){
        return ResponseEntity.ok(danisanService.findByAd(ad));
    }
}
