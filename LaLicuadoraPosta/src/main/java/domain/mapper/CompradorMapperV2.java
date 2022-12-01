package domain.mapper;

import domain.DTO.CompradorDTO;
import domain.model.entities.comprador.Comprador;

public class CompradorMapperV2 implements IMapper<CompradorDTO, Comprador>{

    @Override
    public Comprador map(CompradorDTO in){
        Comprador unComprador = new Comprador();
        unComprador.getNombre();
        unComprador.getApellido();
        unComprador.getDireccion();
        unComprador.getDni();

        return unComprador;
    }
}
