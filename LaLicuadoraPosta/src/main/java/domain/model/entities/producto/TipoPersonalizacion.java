package domain.model.entities.producto;


import domain.model.entities.IdPersistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_personalizacion")
public class TipoPersonalizacion extends IdPersistence {

    @Column(name = "descripcion_tipo")
    public String descriptionTipo;


    public TipoPersonalizacion() {

    }
    public TipoPersonalizacion(String descriptionTipo) {
        this.descriptionTipo = descriptionTipo;
    }


}
