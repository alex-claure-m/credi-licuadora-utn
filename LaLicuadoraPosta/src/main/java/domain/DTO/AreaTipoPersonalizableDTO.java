package domain.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class AreaTipoPersonalizableDTO {
    private Long id;

    private List<Long> tiposDePersonalizacionesId;

}
