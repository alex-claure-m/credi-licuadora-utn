package domain.model.entities.servicio;

import domain.DTO.ProductoDTO;
import domain.model.entities.comprador.Comprador;
import domain.model.entities.producto.Producto;
import domain.repositories.RepoProductoBase;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
@AllArgsConstructor
public class ProductoService {

    private final RepoProductoBase repoProductoBase;

    public void addProducto(Producto unProducto){
        repoProductoBase.save(unProducto);
    }


    public void deleteProducto (Long id) throws Exception {
        if(!repoProductoBase.existsById(id)){
            throw new Exception("no se encontrl el producto");
        }
        repoProductoBase.deleteById(id);
    }

    //traigo al comprador desde el service
    public Producto getProducto(Long id) throws Exception {
        Optional<Producto> unProducto = repoProductoBase.findById(id);
        if(!unProducto.isPresent()){
            throw new Exception("comprador inexistente");
        }
        return unProducto.get();
    }
}
