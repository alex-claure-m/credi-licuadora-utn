package domain.model.entities.servicio;

import domain.model.entities.producto.Personalizacion;
import domain.model.entities.producto.TipoPersonalizacion;
import domain.repositories.RepoPersonalizacion;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class PersonalizacionService {
    private final RepoPersonalizacion repoPersonalizacion;


    public void addPersonalizacion(Personalizacion unaPersonalizacion){
        repoPersonalizacion.save(unaPersonalizacion);
    }

    public void deletePersonalizacion (Long id) throws Exception {
        if(!repoPersonalizacion.existsById(id)){
            throw new Exception("no se encontro Personalizacion del producto");
        }
        repoPersonalizacion.deleteById(id);
    }

    //traigo al comprador desde el service
    public Personalizacion getPersonalizacion(Long id) throws Exception {
        Optional<Personalizacion> unPersonalizacion = repoPersonalizacion.findById(id);
        if(!unPersonalizacion.isPresent()){
            throw new Exception("Personalizacion inexistente");
        }
        return unPersonalizacion.get();
    }

}
