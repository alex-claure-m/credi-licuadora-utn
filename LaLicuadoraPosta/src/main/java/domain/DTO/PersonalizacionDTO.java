package domain.DTO;

import domain.DTO.AreaTipoPersonalizableDTO;
import domain.DTO.ContenidoDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class PersonalizacionDTO {
    private Long id;

    private List<AreaTipoPersonalizableDTO> areasTiposPersonalizables;

    private ContenidoDTO unContenido;
}
