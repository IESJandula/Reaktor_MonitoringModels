package es.iesjandula.reaktor.models.jpa;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class TaskId implements Serializable
{
	/**
	 * Serial version
	 */
	private static final long serialVersionUID = -2686153173707368266L;
	/**Id de la accion a realizar */
	private String actionId;
	/**Fecha de la realizacion de la accion */
	private Date date;
	/**Informacion adicional sobre la accion */
	private String info;
	/**Serial number de la placa base */
	private String motherBoardId;

}