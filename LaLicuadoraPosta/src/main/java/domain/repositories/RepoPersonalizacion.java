package domain.repositories;


import domain.model.entities.producto.Personalizacion;
import domain.model.entities.producto.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "personalizacion")
public interface RepoPersonalizacion extends JpaRepository<Personalizacion,Long> {

    @RestResource(exported=false) // para evitar que no se mande automaticamente
    void deleteById(Long id);

    @RestResource(exported=false)
    void delete(Personalizacion id);

  //  Page<Personalizacion> findPersonalizacionByNombre(String nombre, Pageable page);

}
