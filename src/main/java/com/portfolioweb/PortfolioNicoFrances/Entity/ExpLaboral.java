
package com.portfolioweb.PortfolioNicoFrances.Entity;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Nico
 */
@Getter @Setter
@Entity
@Table(name = "explaboral")
public class ExpLaboral {

    
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long explaboral_id;
    private String trabajoactual;
    private Date fechainicio;
    private String fechafin;
    @Size(min = 1, max = 2048, message = "Mensaje muy largo, máximo 300 caracteres")
    private String descripcion;
    private String tipoempleo;    

  
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="person_id", referencedColumnName ="id")
    private Persona person;

     public ExpLaboral() {
    }

  public ExpLaboral(Long explaboral_id, String trabajoactual, Date fechainicio, String fechafin, String descripcion, String tipoempleo, Persona person) {
        this.explaboral_id = explaboral_id;
        this.trabajoactual = trabajoactual;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.descripcion = descripcion;
        this.tipoempleo = tipoempleo;
        this.person = person;
    }
   

    
    
}
