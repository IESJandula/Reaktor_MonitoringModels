package es.iesjandula.reaktor.models.DTO;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDTO 
{
	private String name;
	
	private Date date;
	
	private String command_L;
	
	private String info;
}
