package domain.model.entities.producto;


import domain.model.entities.IdPersistence;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "producto_personalizado")
@Getter
@Setter
public class ProductoPersonalizado extends IdPersistence {
    @ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    @JoinColumn(name = "producto_id", referencedColumnName = "id")
    private Producto producto ;


    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "producto_personalizado_id",referencedColumnName = "id")
    private List<Personalizacion> personalizacion ;

    public ProductoPersonalizado(Producto producto) {
        this.producto = producto;
        this.personalizacion =new ArrayList<>();
    }

    public ProductoPersonalizado() {

    }


    public int precioDelProductoPersonalizado(){
        return producto.getPrecioBase() + this.sumaPreciosDePersonalizaciones();
    }
    public int sumaPreciosDePersonalizaciones(){
        return personalizacion.stream().mapToInt(x-> x.precioPersonalizacion()).sum();
    }
    public void agregarPersonalizacion(Personalizacion unaPersonalizacion){
        //if(producto.getEsPersonalizable()){
            personalizacion.add(unaPersonalizacion);
        //}
        //else throw new ExceptionAreaNoPersonalizable("la personalizacion de esta area no esta disponible");
    }
}
