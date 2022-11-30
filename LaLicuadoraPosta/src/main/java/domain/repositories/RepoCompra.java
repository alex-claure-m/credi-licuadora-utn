package domain.repositories;

import domain.model.entities.comprador.Compra;
import domain.model.entities.producto.Personalizacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "compra")
public interface RepoCompra extends JpaRepository<Compra,Long> {

    @RestResource(exported=false) // para evitar que no se mande automaticamente
    void deleteById(Long id);

    @RestResource(exported=false)
    void delete(Compra id);
}
