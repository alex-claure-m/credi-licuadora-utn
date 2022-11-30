package domain.repositories;

import domain.model.entities.producto.TipoPersonalizacion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "tipoPersonalizacion")
public interface RepoTipoPersonalizacion extends JpaRepository<TipoPersonalizacion,Long> {

    @RestResource(exported = false)
    void deleteById(Long id);

    @RestResource(exported = false)
    void delete(TipoPersonalizacion tipoPersonalizacion);

   // Page<TipoPersonalizacion> findByNombre(String nombre, Pageable page);
}
