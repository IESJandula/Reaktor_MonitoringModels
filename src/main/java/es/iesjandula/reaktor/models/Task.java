package es.iesjandula.reaktor.models;

import es.iesjandula.reaktor.models.Id.TaskId;
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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "action")
public class Task
{

	@EmbeddedId
	private TaskId taskId;
	
	private String info;
	
	private String status;
	
	@ManyToOne
	@MapsId("actionName")
	private Action action;
	
	@ManyToOne
	@MapsId("serialNumber")
	private Motherboard motherboard;
}
