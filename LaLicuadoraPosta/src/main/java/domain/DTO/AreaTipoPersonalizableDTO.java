package domain.DTO;

import domain.model.entities.producto.TipoPersonalizacion;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AreaTipoPersonalizableDTO {

    private Long id;

    private Enum area;

    private TipoPersonalizacionDTO unTipoPersonalizacion;


}
