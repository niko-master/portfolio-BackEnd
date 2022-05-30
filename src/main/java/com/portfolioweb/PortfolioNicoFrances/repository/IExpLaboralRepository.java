
package com.portfolioweb.PortfolioNicoFrances.repository;

import com.portfolioweb.PortfolioNicoFrances.Entity.ExpLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nico
 */
@Repository
public interface IExpLaboralRepository extends JpaRepository <ExpLaboral, Long>{
    
}
