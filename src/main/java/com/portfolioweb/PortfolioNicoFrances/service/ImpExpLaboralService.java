
package com.portfolioweb.PortfolioNicoFrances.service;

import com.portfolioweb.PortfolioNicoFrances.Entity.ExpLaboral;
import com.portfolioweb.PortfolioNicoFrances.Interface.IExpLaboralService;
import com.portfolioweb.PortfolioNicoFrances.repository.IExpLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nico
 */

@Service
public class ImpExpLaboralService implements IExpLaboralService {
    @Autowired IExpLaboralRepository iexplaboralRepository;

    @Override
    public List<ExpLaboral> getExpLaboral() {
           List<ExpLaboral> expLaboral = iexplaboralRepository.findAll();
           return expLaboral;
    }

    @Override
    public void savePersona(ExpLaboral explaboral) {
        iexplaboralRepository.save(explaboral);
    }

    @Override
    public void deletePersona(Long explabora_id) {
         iexplaboralRepository.deleteById(explabora_id);
    }

    @Override
    public ExpLaboral findPersona(Long explaboral_id) {
        ExpLaboral explaboral = iexplaboralRepository.findById(explaboral_id).orElse(null);
        return explaboral;
    }

    @Override
    public ExpLaboral findExpLaboral(Long explaboral_id) {
        ExpLaboral explaboral = iexplaboralRepository.findById(explaboral_id).orElse(null);
        return explaboral;
    }
    
}
