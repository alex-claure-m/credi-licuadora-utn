package domain.mapper;

import domain.DTO.ProductoDTO;
import domain.DTO.TipoPersonalizacionDTO;
import domain.model.entities.producto.Producto;
import domain.model.entities.producto.TipoPersonalizacion;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class TipoPersonalizacionMapper {

    private final ModelMapper unTipoPersonalizacionMapper;


    public List<TipoPersonalizacionDTO> convertToDTOList(List<TipoPersonalizacion> listaTipoPersonalizacion){
        List<TipoPersonalizacionDTO> listaTipoPersonalizacionDTO = new ArrayList<>();
        for(TipoPersonalizacion unTipoPersonalizacion : listaTipoPersonalizacion){
            listaTipoPersonalizacionDTO.add(unTipoPersonalizacionMapper.map(unTipoPersonalizacion, TipoPersonalizacionDTO.class));
        }
        return listaTipoPersonalizacionDTO;
    }

    public TipoPersonalizacionDTO convertToDto(TipoPersonalizacion unTipoPersonalizacion) {
        return unTipoPersonalizacionMapper.map(unTipoPersonalizacion, TipoPersonalizacionDTO.class);
    }

    public TipoPersonalizacion convertToEntity(TipoPersonalizacionDTO tipoPersonalizacionDTO) {
        return unTipoPersonalizacionMapper.map(tipoPersonalizacionDTO, TipoPersonalizacion.class);
    }

}
