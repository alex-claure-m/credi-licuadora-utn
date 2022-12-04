package domain.model.entities.servicio;

import domain.model.entities.producto.Producto;
import domain.model.entities.producto.TipoPersonalizacion;
import domain.repositories.RepoTipoPersonalizacion;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
@AllArgsConstructor
public class TipoPersonalizacionService {

    private final RepoTipoPersonalizacion repoTipoPersonalizacion;

    public void addTipoPersonalizacion(TipoPersonalizacion unTipoPersonalizacion){
        repoTipoPersonalizacion.save(unTipoPersonalizacion);
    }

    public void deleteTipoPersonalizacion (Long id) throws Exception {
        if(!repoTipoPersonalizacion.existsById(id)){
            throw new Exception("no se encontrl el tipo de Personalizacion del producto");
        }
        repoTipoPersonalizacion.deleteById(id);
    }

    //traigo al comprador desde el service
    public TipoPersonalizacion getTipoPersonalizacion(Long id) throws Exception {
        Optional<TipoPersonalizacion> unTipoPersonalizacion = repoTipoPersonalizacion.findById(id);
        if(!unTipoPersonalizacion.isPresent()){
            throw new Exception("Tipo de personalizacion inexistente");
        }
        return unTipoPersonalizacion.get();
    }



}
