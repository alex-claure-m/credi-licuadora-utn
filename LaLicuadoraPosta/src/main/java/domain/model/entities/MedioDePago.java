package domain.model.entities;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Entity
@Table(name = "medio_pago")
public abstract class MedioDePago extends IdPersistence{
    @Column(name = "precio")
    public int precio = 0;
}
