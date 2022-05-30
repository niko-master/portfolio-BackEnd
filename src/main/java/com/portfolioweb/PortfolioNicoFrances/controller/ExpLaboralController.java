
package com.portfolioweb.PortfolioNicoFrances.controller;

import com.portfolioweb.PortfolioNicoFrances.Entity.ExpLaboral;
import com.portfolioweb.PortfolioNicoFrances.Entity.Persona;
import com.portfolioweb.PortfolioNicoFrances.Interface.IExpLaboralService;
import com.portfolioweb.PortfolioNicoFrances.Interface.IPersonaService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nico
 */
@RestController
@CrossOrigin(origins = "https://portfolioweb-23eea.web.app/")
public class ExpLaboralController {
    @Autowired IExpLaboralService iexplaboralService;
    
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping("/explaboral/traer")
    public List<ExpLaboral> getExpLaboral(){
        return iexplaboralService.getExpLaboral();
    }
    @GetMapping("/explaboral/traer/{explaboral_id}")
    public ExpLaboral findExpLaboral(@PathVariable Long explaboral_id){
        return iexplaboralService.findExpLaboral(explaboral_id);
    }
    @PostMapping("/explaboral/crear")
    public String createPersona(@RequestBody ExpLaboral explaboral){
        iexplaboralService.savePersona(explaboral);
        return "Experiencia laboral guarada";
    }
    
    @DeleteMapping("/explaboral/borrar/{explaboral_id}")
    public String deletePersona(@PathVariable Long explaboral_id){
        iexplaboralService.deletePersona(explaboral_id);
        return "Experiencia laboral fue borrada correctamente";
    }
        
    @PutMapping("/explaboral/editar/{explaboral_id}")
    public ExpLaboral editPersona(@PathVariable Long explaboral_id,
                                @RequestParam("trabajoactual") String ntrabajoactual,
                                @RequestParam("fechainicio") Date nfechainicio,
                                @RequestParam("fechafin") String nfechafin,
                                @RequestParam("descripcion") String ndescripcion,
                                @RequestParam("tipoempleo") String ntipoempleo){
        ExpLaboral explaboral = iexplaboralService.findPersona(explaboral_id);
        
        explaboral.setTrabajoactual(ntrabajoactual);
        explaboral.setFechainicio(nfechainicio);
        explaboral.setFechafin(nfechafin);
        explaboral.setDescripcion(ndescripcion);
        explaboral.setTipoempleo(ntipoempleo);
        
        iexplaboralService.savePersona(explaboral);
        
        return explaboral;
    }
    @PostMapping("/{explaboralId}/explaboral/{personId}")
    public ExpLaboral AssingPersonToExpLaboral(
    @PathVariable Long explabora_id,
    @PathVariable Long id){
        Persona person = ipersonaService.findById(id);
        ExpLaboral explaboral = iexplaboralService.findPersona(explabora_id);
        ipersonaService.savePersona(person);
        iexplaboralService.savePersona(explaboral);
         return explaboral;
    }
    
}
