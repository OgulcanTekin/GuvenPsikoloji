package com.ogulcan.service;

import com.ogulcan.dto.request.PsikologSaveRequestDto;
import com.ogulcan.mapper.IPsikologMapper;
import com.ogulcan.repository.IPsikologRepository;
import com.ogulcan.repository.entity.Psikolog;
import com.ogulcan.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class PsikologService extends ServiceManager<Psikolog,Long> {

    private final IPsikologRepository repository;
    public PsikologService(IPsikologRepository repository) {
        super(repository);
        this.repository=repository;
    }
    public Psikolog findByAd(String ad) {
        return repository.findByAd(ad);
    }

    public void saveDto(PsikologSaveRequestDto dto){
        save(IPsikologMapper.INSTANCE.psikologOlustur(dto));
    }

    public boolean doLogin(String username,String password){
        Optional<Psikolog> psikolog =repository.findOptionalByUsernameAndPassword(username,password);
        if(psikolog.isEmpty()) return false;
        return true;
    }

}
