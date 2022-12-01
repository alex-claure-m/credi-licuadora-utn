package domain.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

// permite mover datos sin necesidad de pasar los datos de TODA LA ENTIDAD A TODOS LOS LADOS


@Getter
@Setter
public class CompradorDTO {

    private String nombre;
    private String apellido;
    private String direccion;
    private String dni;

    public CompradorDTO() {
    }

    public CompradorDTO(String nombre, String apellido, String direccion, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.dni = dni;
    }
}
