package es.iesjandula.reaktor.models.Id;

import java.io.Serial;
import java.io.Serializable;

import es.iesjandula.reaktor.models.Motherboard;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Neil Hdez
 */
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Data
public class CpuId implements Serializable
{

    /** Attribute serialVersionUID*/
    @Serial
    private static final long serialVersionUID = -8958993707778577542L;

    /** Attribute idCpu*/
    private String idCpu;

    /** Attribute motherboard*/
    @OneToOne
    @JoinColumn(name = "serial_number_motherboard")
    private Motherboard motherboard;

    /**
     * Method getIdCpu
     * @return
     */
    public String getIdCpu()
    {
        return this.idCpu;
    }

    /**
     * Method getMotherboard
     * @return
     */
    public Motherboard getMotherboard() {
        return motherboard;
    }

    /**
     * Method setMotherboard
     * @param motherboard
     */
    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }
}
