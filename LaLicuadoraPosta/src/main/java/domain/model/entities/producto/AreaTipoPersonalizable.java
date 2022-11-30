package domain.model.entities.producto;

import domain.model.entities.IdPersistence;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "area_tipo_personalizable")
@Getter
@Setter
public class AreaTipoPersonalizable extends IdPersistence {

    @Enumerated(EnumType.STRING)
    @Column(name = "area")
    private Areas area;

    @OneToMany(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    //@JoinColumn(name = "tipo_personalizacion_id",referencedColumnName = "id")
    private List<TipoPersonalizacion> tiposDePersonalizaciones;


    public AreaTipoPersonalizable() {
    }

    public AreaTipoPersonalizable(Areas area) {
        this.area = area;
        this.tiposDePersonalizaciones=new ArrayList<>();
    }
    public void setTiposDePersonalizaciones(TipoPersonalizacion unTipo){
        tiposDePersonalizaciones.add(unTipo);
    }
}
