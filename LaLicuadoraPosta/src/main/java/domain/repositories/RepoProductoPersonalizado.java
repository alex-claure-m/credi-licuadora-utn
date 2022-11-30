package domain.repositories;


import domain.model.entities.producto.Producto;
import domain.model.entities.producto.ProductoPersonalizado;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "productoPersonalizado")
public interface RepoProductoPersonalizado extends JpaRepository<ProductoPersonalizado,Long> {

    @RestResource(exported=false) // para evitar que no se mande automaticamente
    void deleteById(Long id);

    @RestResource(exported=false)
    void delete(ProductoPersonalizado id);




}
