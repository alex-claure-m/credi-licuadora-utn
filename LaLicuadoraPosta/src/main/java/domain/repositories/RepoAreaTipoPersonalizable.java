package domain.repositories;

import domain.model.entities.producto.AreaTipoPersonalizable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "tipoPersonalizable")
public interface RepoAreaTipoPersonalizable extends JpaRepository<AreaTipoPersonalizable,Long> {

    @RestResource(exported = false)
    void deleteById(Long id);

    @RestResource(exported = false)
    void delete(AreaTipoPersonalizable tipoPersonalizacion);
}
