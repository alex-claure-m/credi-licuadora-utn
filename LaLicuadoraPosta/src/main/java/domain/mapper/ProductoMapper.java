package domain.mapper;

import domain.DTO.ProductoDTO;
import domain.model.entities.producto.Producto;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class ProductoMapper {

    private final ModelMapper productoMapper;

    public List<ProductoDTO> convertToDTOList(List<Producto> listaProdudctos){
        List<ProductoDTO> listaProductosDTO = new ArrayList<>();
        for(Producto unProducto : listaProdudctos){
            listaProductosDTO.add(productoMapper.map(unProducto, ProductoDTO.class));
        }
        return listaProductosDTO;
    }

    public ProductoDTO convertToDto(Producto productBase) {
        return productoMapper.map(productBase, ProductoDTO.class);
    }

    public Producto convertToEntity(ProductoDTO productoDTO) {
        return productoMapper.map(productoDTO, Producto.class);
    }
}
