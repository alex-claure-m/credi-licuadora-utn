package domain.repositories;


import domain.model.entities.producto.Contenido;
import domain.model.entities.producto.Personalizacion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "contenido")
public interface RepoContenido {

    @RestResource(exported=false) // para evitar que no se mande automaticamente
    void deleteById(Long id);

    @RestResource(exported=false)
    void delete(Contenido id);


}
