package es.iesjandula.reaktor.models.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SoundCardDTO
{
    /** Attribute id*/
    private String id;

    /** Attribute model*/
    private String model;

    /** Attribute driver*/
    private String driver;

}
