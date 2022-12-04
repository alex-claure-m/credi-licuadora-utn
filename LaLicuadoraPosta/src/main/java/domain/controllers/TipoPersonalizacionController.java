package domain.controllers;

import domain.DTO.ProductoDTO;
import domain.DTO.TipoPersonalizacionDTO;
import domain.mapper.TipoPersonalizacionMapper;
import domain.model.entities.producto.Producto;
import domain.model.entities.producto.TipoPersonalizacion;
import domain.model.entities.servicio.TipoPersonalizacionService;
import domain.repositories.RepoTipoPersonalizacion;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class TipoPersonalizacionController {

    private final TipoPersonalizacionService tipoPersonalizacionService;

    private final TipoPersonalizacionMapper tipoPersonalizacionMapper;


    @PostMapping()
    public void agregarTipo(@RequestBody TipoPersonalizacionDTO unTipoPersonalizacionDTO){
        TipoPersonalizacion unTipoPersonalizacion = tipoPersonalizacionMapper.convertToEntity(unTipoPersonalizacionDTO);
        tipoPersonalizacionService.addTipoPersonalizacion(unTipoPersonalizacion);
    }


    @GetMapping(value = "{id}")
    public TipoPersonalizacionDTO getTipoPersonalizacion (@PathVariable("id") Long id) throws Exception {
        TipoPersonalizacion unTipo = tipoPersonalizacionService.getTipoPersonalizacion(id);
        return tipoPersonalizacionMapper.convertToDto(unTipo);

    }

}
