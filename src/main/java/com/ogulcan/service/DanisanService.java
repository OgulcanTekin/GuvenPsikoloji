package com.ogulcan.service;

import com.ogulcan.dto.request.DanisanSaveRequestDto;
import com.ogulcan.mapper.IDanisanMapper;
import com.ogulcan.repository.IDanisanRepository;
import com.ogulcan.repository.entity.Danisan;
import com.ogulcan.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class DanisanService extends ServiceManager<Danisan,Long> {

    private final IDanisanRepository repository;

    public DanisanService(IDanisanRepository repository){
        super(repository);
        this.repository=repository;
    }

    public Danisan findByAd(String ad){
        return repository.findByAd(ad);
    }

    public void saveDto(DanisanSaveRequestDto dto){
        save(IDanisanMapper.INSTANCE.danisanOlustur(dto));
    }

    public boolean doLogin(String username,String password){
        Optional<Danisan> danisan=repository.findOptionalByUsernameAndPassword(username,password);
        if(danisan.isEmpty())return false;
        return true;
        }

}


