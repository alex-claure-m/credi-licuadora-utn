package domain;

import domain.model.entities.producto.Producto;
import domain.model.entities.producto.TipoPersonalizacion;
import domain.repositories.RepoComprador;
import domain.repositories.RepoProductoBase;
import domain.repositories.RepoTipoPersonalizacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.time.LocalDate;


@SpringBootApplication
public class AppRunAplicationCredicoop {
/*
    @Autowired
    RepositoryRestConfiguration config;
*/

    public static void main(String[] args) {
        SpringApplication.run(AppRunAplicationCredicoop.class,args);
    }
/*
    @Bean
    public CommandLineRunner init(RepoComprador repoComprador){
        config.exposeIdsFor(repoComprador.class);

        return(args) ->{
            repoProdu.save(new Producto("almohada","almohada roja",100, LocalDate.now(),Boolean.TRUE));
        };
    }

*/
}
