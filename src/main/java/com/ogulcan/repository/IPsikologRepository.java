package com.ogulcan.repository;

import com.ogulcan.repository.entity.Psikolog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPsikologRepository extends JpaRepository<Psikolog,Long> {

    Psikolog findByAd(String ad);

    List<Psikolog> findAllByAd(String ad);
    Optional<Psikolog> findOptionalByUsernameAndPassword(String username, String password);
}
