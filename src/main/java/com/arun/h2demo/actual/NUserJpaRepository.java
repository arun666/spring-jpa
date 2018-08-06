package com.arun.h2demo.actual;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface NUserJpaRepository extends JpaRepository<NUser, Integer> {

}
