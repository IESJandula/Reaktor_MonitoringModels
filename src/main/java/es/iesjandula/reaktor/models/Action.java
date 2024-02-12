package es.iesjandula.reaktor.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "action")
public class Action
{
	
	public static final String STATUS_TODO = "TO DO";
	public static final String STATUS_IN_PROGRESS= "IN PROGRESS";
	public static final String STATUS_DONE = "DONE";
	public static final String STATUS_FAILURE = "FAILURE";

	@Id
	@Column
	private String name;
	
	@Column
	private String commandWindows;
	
	@Column
	private String commandLinux;
	

}
