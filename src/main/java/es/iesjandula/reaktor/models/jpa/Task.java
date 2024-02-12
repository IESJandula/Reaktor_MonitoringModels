package es.iesjandula.reaktor.models.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="task")
public class Task 
{
	@EmbeddedId
	/**Id emmebido */
	private TaskId taskId;
	
	@Column(length = 10)
	/**Informacion de la tarea ( esta realizada, da error, etc ) */
	private Status status;
	
	@ManyToOne
	@JoinColumn(name = "motherBoardId")
	@MapsId("motherBoardId")
	/**Placa base en la que se ejecuta la tarea */
	private MotherBoard motherBoard;
	
	@ManyToOne
	@JoinColumn(name = "actionId")
	@MapsId("actionId")
	/**Accion de la tarea */
	private Action action;

}