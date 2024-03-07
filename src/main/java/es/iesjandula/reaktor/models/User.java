package es.iesjandula.reaktor.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * @author David Martinez
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User
{

    /** Attribute id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;

    /** Attribute userName*/
    @Column(name = "user_name", length = 5, nullable = false)
    private String userName;

    /** Attribute password*/
    @Column(name = "password", nullable = false)
    private String password;

    /** Attribute active*/
    @Column(name = "active")
    private Boolean active;

    /** Attribute roles*/
    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roles;

}
