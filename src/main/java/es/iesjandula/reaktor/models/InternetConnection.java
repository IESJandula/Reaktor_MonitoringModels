package es.iesjandula.reaktor.models;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


/**
 * @author Neil Hdez
 *
 * Class - Internet connection
 */
@Entity
@Table(name = "internet_connection")
@Getter
@Setter
@Data
@Component
public class InternetConnection
{
    /**
     * Attribute - id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Attribute - name of network
     */
    @Column(nullable = false)
    private String networkName;

    /**
     * Constructor by default
     */
    public InternetConnection()
    {

    }
}
