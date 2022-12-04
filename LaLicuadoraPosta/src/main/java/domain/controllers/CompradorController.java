package domain.controllers;

//import domain.mapper.CompradorMapper;
import domain.DTO.CompradorDTO;
import domain.mapper.CompradorMapper;
import domain.model.entities.comprador.Comprador;
import domain.model.entities.servicio.CompradorService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/comprador")
@AllArgsConstructor
public class CompradorController {

    private CompradorService compradorService;

    private CompradorMapper compradorModel;


    @PostMapping()
    public Comprador agregarComprador(@RequestBody Comprador unComprador){
        return compradorService.crearComprador(unComprador);
    }

    @GetMapping("{id}")
    public CompradorDTO getComprador(@PathVariable("id") Long id) throws Exception {
        Comprador unComprador = compradorService.getComprador(id);
        return compradorModel.convertToDTO(unComprador);
    }


}
