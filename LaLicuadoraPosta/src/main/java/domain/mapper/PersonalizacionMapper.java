package domain.mapper;

import domain.DTO.PersonalizacionDTO;
import domain.DTO.ProductoDTO;
import domain.model.entities.producto.Personalizacion;
import domain.model.entities.producto.Producto;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class PersonalizacionMapper {

    private final ModelMapper personalizacionMapper;

    public List<PersonalizacionDTO> convertToDTOList(List<Personalizacion> listaPersonalizacion){
        List<PersonalizacionDTO> listaPersonlizacionDTO = new ArrayList<>();
        for(Personalizacion unaPersonalizacion : listaPersonalizacion){
            listaPersonlizacionDTO.add(personalizacionMapper.map(unaPersonalizacion, PersonalizacionDTO.class));
        }
        return listaPersonlizacionDTO;
    }

    public PersonalizacionDTO convertToDto(Personalizacion unaPersonalizacion) {
        return personalizacionMapper.map(unaPersonalizacion, PersonalizacionDTO.class);
    }

    public Personalizacion convertToEntity(PersonalizacionDTO unaPersonalizacionDTO) {
        return personalizacionMapper.map(unaPersonalizacionDTO, Personalizacion.class);
    }
}
