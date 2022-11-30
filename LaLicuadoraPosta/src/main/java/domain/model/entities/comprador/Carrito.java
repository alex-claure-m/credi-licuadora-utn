package domain.model.entities.comprador;


import domain.model.entities.IdPersistence;
import domain.model.entities.producto.ProductoPersonalizado;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "carrito_compra")
@Getter
@Setter
public class Carrito extends IdPersistence {
    @Transient
    private Comprador comprador;
    @Transient
    private List<ProductoPersonalizado> productosAgregadosAlCarrito;

    @Transient
    private Estado estadoCompra;

    public Carrito() {
        this.productosAgregadosAlCarrito=new ArrayList<>();
    }

    public void agregarProductos(ProductoPersonalizado unProducto){
        productosAgregadosAlCarrito.add(unProducto);
    }
    public void quitarProducto(ProductoPersonalizado unProducto){
        productosAgregadosAlCarrito.remove(unProducto);
    }
    public void precioCarrito(){
        productosAgregadosAlCarrito.stream().mapToInt(x->x.precioDelProductoPersonalizado()).sum();
    }
}
