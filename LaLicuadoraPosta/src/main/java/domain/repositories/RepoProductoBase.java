package domain.repositories;


import domain.model.entities.producto.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.RestController;

@RepositoryRestResource(path = "producto")
public interface RepoProductoBase extends JpaRepository<Producto,Long> {

    @RestResource(exported=false) // para evitar que no se mande automaticamente
    void deleteById(Long id);

    @RestResource(exported=false)
    void delete(Producto id);

    // Page<Producto> findProductoByNombre(String nombre, Pageable page);
}
