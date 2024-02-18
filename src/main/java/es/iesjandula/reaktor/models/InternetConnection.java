package es.iesjandula.reaktor.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import es.iesjandula.reaktor.exceptions.ComputerError;

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
