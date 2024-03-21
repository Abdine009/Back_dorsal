package dock.example.dock.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

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

    private String role;


    //Definition du lien existant entre un utilisateur et ses corrections

    @OneToMany(cascade = CascadeType.ALL,
    orphanRemoval = true,
    fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private List<Correction> corrections = new ArrayList<>();

    //@OneToMany(mappedBy = "userr", cascade = CascadeType.ALL, orphanRemoval = true)
   // private List<Correction> corrections = new ArrayList<>();
}
