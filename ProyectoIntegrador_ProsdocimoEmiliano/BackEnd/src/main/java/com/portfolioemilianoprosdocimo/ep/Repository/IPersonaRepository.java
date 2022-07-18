
package com.portfolioemilianoprosdocimo.ep.Repository;

import com.portfolioemilianoprosdocimo.ep.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>{
    
}
