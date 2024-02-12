package es.iesjandula.reaktor.models.Id;

import java.util.Date;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class TaskId
{

	private String serialNumber;
	private String actionName;
	private Date date;
	
}
