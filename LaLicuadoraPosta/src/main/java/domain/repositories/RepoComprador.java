package domain.repositories;

import domain.model.entities.comprador.Comprador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;


public interface RepoComprador extends JpaRepository<Comprador,Long> {

    @RestResource(exported=false) // para evitar que no se mande automaticamente
    void deleteById(Long id);

    @RestResource(exported=false)
    void delete(Comprador id);

    //Comprador createComprador(Comprador compra);

    //Comprador getCompradorBy(Long id);
}
