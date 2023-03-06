package com.ogulcan.service;

import com.ogulcan.dto.request.RandevuSaveRequestDto;
import com.ogulcan.mapper.IRandevuMapper;
import com.ogulcan.repository.IRandevuRepository;
import com.ogulcan.repository.entity.Randevu;
import com.ogulcan.utility.ServiceManager;
import org.springframework.stereotype.Service;

import javax.persistence.Id;


@Service
public class RandevuService extends ServiceManager<Randevu,Long> {

    private final IRandevuRepository repository;
    public RandevuService(IRandevuRepository repository) {
        super(repository);
        this.repository=repository;
    }
    public Randevu findById(Id id) {
        return repository.findById(id);
    }

    public void saveDto(RandevuSaveRequestDto dto){
        save(IRandevuMapper.INSTANCE.randevuOlustur(dto));
    }
}
