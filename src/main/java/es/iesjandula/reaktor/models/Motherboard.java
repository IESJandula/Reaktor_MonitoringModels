package es.iesjandula.reaktor.models;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Neil Hdez
 *
 * Class - Motherboard of computer
 */
@Entity
@Table(name = "motherboard")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Service
public class Motherboard
{
    /**
     * Attribute - serial number ID
     */
    @Id
    @Column(name = "serial_number")
    private String motherBoardSerialNumber;

    /**
     * Attribute - model of motherboard
     */
    @Column(nullable = false)
    private String model;

    /**
     * Attribute - classroom of motherboard
     */
    @Column(nullable = false)
    private String classroom;

    /**
     * Attribute - trolley of motherboard
     */
    @Column(nullable = false)
    private String trolley;
    
    /**
     * Attribute - floor of motherboard
     */
//    @Column(nullable = false, length = 1)
//    private Integer floor;
    
    
    /** Attribute andaluciaId*/
    @Column(nullable = false)
    private String andaluciaId;
    
    /** Attribute computerNumber*/
    @Column(nullable = false)
    private String computerNumber;

    /**
     * Attribute - teacher of motherboard
     */
    @Column(nullable = false)
    private String teacher;
    
    /** Attribute computerSerialNumber*/
    @Column(nullable = false)
    private String computerSerialNumber;

    /**
     * Attribute - last connection of motherboard
     */
    @Column(nullable = false)
    private Date lastConnection;

    /**
     * Attribute - last update computer on
     */
    @Column(nullable = false)
    private Date lastUpdateComputerOn;

    /**
     * Attribute - computer on
     */
    @Column(nullable = false)
    private Boolean computerOn;

    /**
     * Attribute - is admin
     */
    @Column(nullable = false)
    private Boolean isAdmin;

    /**
     * Attribute - Malware
     */
    @OneToMany(mappedBy = "motherBoardSerialNumber", cascade = CascadeType.ALL)
    private Set<MotherboardMalware> malware;

    @OneToMany(mappedBy = "motherboard")
    private List<Task> tasks;
    
}
