package domain.model.entities.producto;


import domain.model.entities.IdPersistence;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "contenido")
public class Contenido extends IdPersistence {
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "precio_personalizado")
    private int precioPersonalizado;

    public Contenido() {

    }
    public Contenido(String nombre, int precioPersonalizado) {
        this.nombre = nombre;
        this.precioPersonalizado = precioPersonalizado;
    }


}
