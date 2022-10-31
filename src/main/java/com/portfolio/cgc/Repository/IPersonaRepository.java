package com.portfolio.cgc.Repository;

import com.portfolio.cgc.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Cristian Cacciolatti
 */
@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
