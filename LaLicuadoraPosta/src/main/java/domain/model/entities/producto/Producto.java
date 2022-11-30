package domain.model.entities.producto;


import domain.model.entities.IdPersistence;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "producto")
public class Producto extends IdPersistence {

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "precio_base")
    private int precioBase;

    @Column(name = "tiempo_fabricacion",columnDefinition = "DATE")
    private LocalDate tiempoFabricacion;

    @OneToMany(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    @JoinColumn(name = "producto_base_id", referencedColumnName = "id")
    // le digo en el joinColumn como se llamara la columna que debera joinear
    // que estara en la tabla Personalizacion y su referencia a la Clase Producto , se hace mediante el ID
    private List<AreaTipoPersonalizable> unAreaTipoPersonalizables;



    @Column(name ="es_personalizalble")
    private Boolean esPersonalizable;


    public Producto(String nombre, String descripcion, int precioBase, LocalDate tiempoFabricacion, Boolean esPersonalizable) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.tiempoFabricacion = tiempoFabricacion;
        this.esPersonalizable = esPersonalizable;
        this.unAreaTipoPersonalizables = new ArrayList<>();
    }

    public Producto() {

    }

    public void agregarAreaYtipoPersonalizable(AreaTipoPersonalizable unAreaPersonalizable){
        unAreaTipoPersonalizables.add(unAreaPersonalizable);
    }
/*
    public Boolean perteneceAlArea(Areas unArea){
       return areaPersonalizacion.contains(unArea);
    }

    public Boolean perteneceAlAreaAPersonalizar(Areas unArea){
        return this.perteneceAlArea(unArea);
    }
*/
}
