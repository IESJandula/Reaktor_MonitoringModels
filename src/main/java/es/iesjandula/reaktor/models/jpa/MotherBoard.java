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
@Table(name="motherBoard")
public class MotherBoard 
{
	@Id
	@Column(length = 10)
	/**Numero de serie del ordenador */
	private Long serialNumber;
	
	@OneToMany(mappedBy = "motherBoard")
	/**Lista de tareas a ejecutar */
	private List<Task> taskList;
	
	@OneToMany(mappedBy = "id")
	/**Lista de usb que posee el ordenador */
	private List<USB> usbList;
	

}