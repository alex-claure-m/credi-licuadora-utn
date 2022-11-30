package domain.model.entities.vendedor;


import domain.model.entities.MedioDePago;
import domain.model.entities.producto.ProductoPersonalizado;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "vendedor")
@Getter
@Setter
public class Vendedor extends MedioDePago {

    @Id
    @GeneratedValue
    private Long id;

    @Transient
    private List<ProductoPersonalizado> productosPersonalizados;

    @Transient
    private List<MedioDePago> unMedio ;

    public Vendedor() {
        this.productosPersonalizados =  new ArrayList<>();;
        this.unMedio =new ArrayList<>();
    }

    public int prefioFinal(){
       return productosPersonalizados.stream().mapToInt(x-> x.precioDelProductoPersonalizado()).sum();
    }

    public void agregarProductoPersonalizado(ProductoPersonalizado unaPersonalizacion){
        productosPersonalizados.add(unaPersonalizacion);
    }




}
