package dock.example.dock.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
//@Table(name = "user")
public class Userr {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    private String username;

    private String password;
}
