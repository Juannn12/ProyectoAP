package com.portfolioweb.AP.Repository;

import com.portfolioweb.AP.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iPersonaRepository extends JpaRepository<Persona,Long> {
    
}
