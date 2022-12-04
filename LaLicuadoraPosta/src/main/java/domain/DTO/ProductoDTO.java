package domain.DTO;

import domain.model.entities.producto.AreaTipoPersonalizable;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ProductoDTO {

    private String nombre;
    private String descripcion;
    private int precioBase;
    private LocalDate tiempoFabricacion;
    private List<AreaTipoPersonalizableDTO> areaPersonalizable;


    public ProductoDTO() {
    }

    public ProductoDTO(String nombre, String descripcion, int precioBase, LocalDate tiempoFabricacion, List<AreaTipoPersonalizable> areaPersonalizable) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.tiempoFabricacion = LocalDate.now();
        this.areaPersonalizable = new ArrayList<>();
    }
}
