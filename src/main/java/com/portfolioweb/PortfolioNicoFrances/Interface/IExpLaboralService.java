
package com.portfolioweb.PortfolioNicoFrances.Interface;

import com.portfolioweb.PortfolioNicoFrances.Entity.ExpLaboral;
import java.util.List;

/**
 *
 * @author Nico
 */

public interface IExpLaboralService {
    //Traer la lista de exp laboral
    public List<ExpLaboral> getExpLaboral();
    
    //Guardar Objetos de tipo ExpLaboral
    public void savePersona(ExpLaboral explaboral);
    
    //Eliminar Objetos de tipo persona, se busca por ID
    public void deletePersona(Long explabora_id);
    
    //Buscar Objeto dentro de persona x ID
    public ExpLaboral findPersona(Long explabora_id);
    
    public ExpLaboral findExpLaboral(Long explabora_id);
    
}
