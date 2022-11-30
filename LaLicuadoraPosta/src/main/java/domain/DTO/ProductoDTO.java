package domain.DTO;

import domain.model.entities.producto.AreaTipoPersonalizable;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProductoDTO {

    private String nombre;
    private String descripcion;
    private int precioBase;
    private String tiempoFabricacion;
    private List<AreaTipoPersonalizable> areaPersonalizable;


    public ProductoDTO() {
    }

    public ProductoDTO(String nombre, String descripcion, int precioBase, String tiempoFabricacion, List<AreaTipoPersonalizable> areaPersonalizable) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.tiempoFabricacion = tiempoFabricacion;
        this.areaPersonalizable = areaPersonalizable;
    }
}
