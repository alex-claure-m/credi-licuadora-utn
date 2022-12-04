package domain.controllers;

import domain.DTO.ProductoDTO;
import domain.mapper.ProductoMapper;
import domain.model.entities.producto.Producto;
import domain.model.entities.servicio.ProductoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/producto")
@AllArgsConstructor
public class ProductoController {
    private final ProductoService productoService;
    private final ProductoMapper productoMapper;

    @PostMapping()
    public void agregarProducto(@RequestBody ProductoDTO productoDTO){
        Producto unProducto = productoMapper.convertToEntity(productoDTO);
        productoService.addProducto(unProducto);
    }
    @GetMapping(value = "{id}")
    @ResponseStatus(HttpStatus.OK)
    public ProductoDTO getProductBase(@PathVariable("id") Long id) throws Exception {

        Producto productBase = productoService.getProducto(id);
        return productoMapper.convertToDto(productBase);

    }

}
