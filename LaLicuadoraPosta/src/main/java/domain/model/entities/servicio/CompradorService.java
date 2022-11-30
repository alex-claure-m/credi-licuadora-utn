package domain.model.entities.servicio;

import domain.model.entities.comprador.Comprador;
import domain.repositories.RepoComprador;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor // para el private final , asi evito Constructor
public class CompradorService {

    private final RepoComprador repoComprador;


    //agrego al comprador desde el service
    public Comprador postComprador(Comprador unComprador){
        return repoComprador.save(unComprador);
    }

    //traigo al comprador desde el service
    public void deleteComprador(Long id) throws Exception {
        if(!repoComprador.existsById(id)){
            throw new Exception("no se encontrl al comprador");
        }
        repoComprador.deleteById(id);
    }

    //traigo al comprador desde el service
    public Comprador getComprador(Long id) throws Exception {
        Optional<Comprador> unComprador = repoComprador.findById(id);
        if(unComprador.isPresent()){
            throw new Exception("comprador inexistente");
        }
        return unComprador.get();
    }

}
