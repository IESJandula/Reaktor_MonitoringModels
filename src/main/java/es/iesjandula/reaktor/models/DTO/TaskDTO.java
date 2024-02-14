package es.iesjandula.reaktor.models.DTO;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDTO
{
	/** Attribute - name */
	private String name;
	
	/** Attribute - commandWindows */
	private String commandWindows;
	
	/** Attribute - commandLinux */
	private String commandLinux;
	
	/** Attribute - info */
	private String info;
	
	/** Attribute - date */
	private Date date;
}
