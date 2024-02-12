package es.iesjandula.reaktor.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usb")
public class Usb
{

	@Id
	@Column
	private Long id;
	
	@Column(nullable = false)
	private Boolean active;
	
	@Column(nullable = false)
	private String type;
	
	@ManyToOne
	Motherboard motherboard;
	
}
