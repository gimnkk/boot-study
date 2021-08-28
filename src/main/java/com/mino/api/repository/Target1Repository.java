package com.mino.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mino.api.entity.Target1;

@Repository
public interface Target1Repository extends JpaRepository<Target1, Long> {

}
