package domain.controllers;

import domain.DTO.PersonalizacionDTO;
import domain.DTO.ProductoDTO;
import domain.mapper.PersonalizacionMapper;
import domain.model.entities.producto.Personalizacion;
import domain.model.entities.producto.Producto;
import domain.model.entities.servicio.PersonalizacionService;
import domain.repositories.RepoPersonalizacion;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/personalizacion")
@AllArgsConstructor
public class PersonalizacionController {

    private final PersonalizacionService personalizacionService;

    private final PersonalizacionMapper personalizacionMapper;

    @PostMapping()
    public void agregarPersonalizacion (@RequestBody PersonalizacionDTO personalizacionDTO){
        Personalizacion unaPersonalizacion = personalizacionMapper.convertToEntity(personalizacionDTO);
        personalizacionService.addPersonalizacion(unaPersonalizacion);
    }
    @GetMapping(value = "{id}")
    @ResponseStatus(HttpStatus.OK)
    public PersonalizacionDTO getPersonalizacion(@PathVariable("id") Long id) throws Exception {

        Personalizacion unaPersonalizacion = personalizacionService.getPersonalizacion(id);
        return personalizacionMapper.convertToDto(unaPersonalizacion);

    }


}
