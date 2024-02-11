package es.iesjandula.reaktor.models.jpa;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="action")
public class Action 
{
	@Id
	@Column(length = 100)
	/**Nombre de la accion */
	private String name;
	
	@Column(length = 100)
	/**Comando a ejecutar en linux */
	private String commandL;
	
	@Column(length = 100)
	/**Comando a ejecutar en windows */
	private String commandW;
	
	@OneToMany(mappedBy = "action")
	/**Lista de tareas */
	private List<Task> taskList;
	
}