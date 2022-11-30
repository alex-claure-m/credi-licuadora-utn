package domain.model.entities.publicacion;

import domain.model.entities.IdPersistence;
import domain.model.entities.producto.ProductoPersonalizado;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Setter
@Getter
@Entity
@Table(name = "publicacion")
public class Publicacion extends IdPersistence {

    @Column(name = "nombre_publicacion")
    private String nombrePublicaicon;

    @Transient
    private ProductoPersonalizado unProductoPersonalizado;

    @Transient
    private EstadoPublicacion estadoDePublicacion;

}
