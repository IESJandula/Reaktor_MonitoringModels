package es.iesjandula.reaktor.models.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HardDiskDTO
{
    /** Attribute id*/
    private String id;

    /** Attribute size*/
    private Long size;

    /** Attribute model*/
    private String model;

}
