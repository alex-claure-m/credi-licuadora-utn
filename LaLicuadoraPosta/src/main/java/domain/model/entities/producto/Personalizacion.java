package domain.model.entities.producto;


import domain.model.entities.IdPersistence;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "personalizacion")
@Getter
@Setter
public class Personalizacion extends IdPersistence {

    @OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.LAZY)
   // @JoinColumn(name = "area_tipo_personalizable_id", referencedColumnName = "id")
    private List<AreaTipoPersonalizable> areasPersonalizables;

    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    //@JoinColumn(name = "contenido_personalizado_id", referencedColumnName = "id")
    private Contenido personalizacionProducto;

    public Personalizacion() {
    }
    public Personalizacion(Contenido personalizacionProducto) {
        this.personalizacionProducto = personalizacionProducto;
        this.areasPersonalizables=new ArrayList<>();
    }


    public void setAreasPersonalizables(AreaTipoPersonalizable unArea){
        areasPersonalizables.add(unArea);
    }
    public int precioPersonalizacion(){
       return personalizacionProducto.getPrecioPersonalizado();
    }


}
