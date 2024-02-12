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
	
	public static final String TODO = "TO DO";

	@Id
	@Column
	private String name;
	
	@Column
	private String command_Windows;
	
	@Column
	private String command_Linux;
	

}
