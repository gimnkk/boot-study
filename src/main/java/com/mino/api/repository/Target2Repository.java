package com.mino.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mino.api.entity.Target2;

@Repository
public interface Target2Repository extends JpaRepository<Target2, Long> {

}
