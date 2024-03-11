package es.iesjandula.reaktor.models.Id;

import java.io.Serial;
import java.io.Serializable;

import es.iesjandula.reaktor.models.Motherboard;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Neil Hdez
 * @version 1.0.0
 * @since 03/02/2023
 */

@Embeddable
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GraphicCardId implements Serializable
{

    /** Attribute serialVersionUID*/
    @Serial
    private static final long serialVersionUID = 8701481126108693094L;

    /** Attribute idGraphicCard*/
    private String idGraphicCard;

    /** Attribute motherboard*/
    @OneToOne
    @JoinColumn(name = "serial_number_motherboard")
    private Motherboard motherboard;

}
