package com.ogulcan.repository;

import com.ogulcan.repository.entity.Danisan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IDanisanRepository extends JpaRepository<Danisan,Long> {

    Danisan findByAd(String ad);

    List<Danisan> findAllByAd(String ad);
    Optional<Danisan> findOptionalByUsernameAndPassword(String username, String password);
}
