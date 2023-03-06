package com.ogulcan.repository;

import com.ogulcan.repository.entity.Randevu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

import javax.persistence.Id;
import java.util.List;

@Repository
public interface IRandevuRepository extends JpaRepository<Randevu,Long> {

    Randevu findById(Id id);


}
