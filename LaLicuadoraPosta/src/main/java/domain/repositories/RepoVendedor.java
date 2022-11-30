package domain.repositories;

import domain.model.entities.producto.Personalizacion;
import domain.model.entities.vendedor.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "vendedor")
public interface RepoVendedor extends JpaRepository<Vendedor,Long> {

    @RestResource(exported=false) // para evitar que no se mande automaticamente
    void deleteById(Long id);

    @RestResource(exported=false)
    void delete(Vendedor id);
}
