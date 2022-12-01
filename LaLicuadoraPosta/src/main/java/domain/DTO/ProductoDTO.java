package domain.DTO;

import domain.model.entities.producto.AreaTipoPersonalizable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class ProductoDTO {

    private String nombre;
    private String descripcion;
    private int precioBase;
    private String tiempoFabricacion;
    private List<AreaTipoPersonalizableDTO> areaPersonalizable;

    public ProductoDTO() {
    }

}
