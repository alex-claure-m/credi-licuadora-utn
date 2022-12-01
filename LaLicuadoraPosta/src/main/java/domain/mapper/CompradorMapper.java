package domain.mapper;


import domain.DTO.CompradorDTO;
import domain.model.entities.comprador.Comprador;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;


public class CompradorMapper {
    // el mapper para convertir de entidad a dto para la implementacion de microservicios puede servir
    // pero estosy en duda!
    private ModelMapper compradorMapper;

    public CompradorMapper(ModelMapper compradorMapper) {
        this.compradorMapper = compradorMapper;
    }

    public List<CompradorDTO> convertToDTOList(List<Comprador> compradorList){
        List<CompradorDTO> compradorDTOList  = new ArrayList<>();
        for(Comprador unComprador: compradorList){
            compradorDTOList.add(compradorMapper.map(unComprador,CompradorDTO.class));
        }
        return compradorDTOList;
    }

    public CompradorDTO convertToDTO(Comprador comprador){
        return compradorMapper.map(comprador, CompradorDTO.class);
    }
    public Comprador convertToEntidad(CompradorDTO unCompradorDTO){
        return compradorMapper.map(unCompradorDTO,Comprador.class);
    }


}

