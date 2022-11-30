package domain.model.entities.comprador;

import domain.model.entities.IdPersistence;
import domain.model.entities.publicacion.Publicacion;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;


@Getter
@Setter
@Entity
@Table(name = "item_carrito")
public class ItemCarrito extends IdPersistence {

    @Transient
    private Publicacion publicacionCompra;

    @Column(name = "cantidad")
    private int cantidad;

}
