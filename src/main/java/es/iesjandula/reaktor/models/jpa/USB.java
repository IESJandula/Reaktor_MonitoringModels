package es.iesjandula.reaktor.models.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="usb")
public class USB 
{
	@Id
	@Column(length = 10)
	/**Identificador del usb */
	private Long id;
	@Column(length = 10)
	/**El usb esta activo/desactivo */
	private Boolean active;
	@Column(length = 100)
	/**Tipo de usb por ejemplo raton,teclado,etc */
	private String type;
	
	@ManyToOne
	/**Placa base a la que pertenece este usb */
	private MotherBoard serialNumber;
	
}