package domain.model.entities.comprador;

import domain.model.entities.IdPersistence;
import domain.model.entities.MedioDePago;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "compra")
public class Compra extends IdPersistence {

    @Column(name = "fecha")
    private LocalDate fechaCompra;

    @Column(name = "hora")
    private LocalDateTime hora;

    @Transient
    private List<ItemCarrito> items;

    @Transient
    private List<MedioDePago> mediosDePago;

    @Enumerated
    @Column(name = "estado_compra")
    private Estado estadoCompra;



}
