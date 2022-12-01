package domain.controllers;

import domain.DTO.CompradorDTO;
import domain.model.entities.comprador.Comprador;
import domain.model.entities.servicio.CompradorServiceV2;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@RestController
@RequestMapping("/compradores") // defino el endopoint
@AllArgsConstructor
public class CompradorControllerV2 {

    private final CompradorServiceV2 compradorServiceV2;

    @PostMapping
    public Comprador crearComprador(@RequestBody CompradorDTO compradorDTO){
        return this.compradorServiceV2.createComprador(compradorDTO);
    }
    @GetMapping
    public List<Comprador> findAll(){
        // como ya tenemos el metodo en el compradorServiceV2.. lo implemento aca
        return this.compradorServiceV2.findAll();
    }
}
