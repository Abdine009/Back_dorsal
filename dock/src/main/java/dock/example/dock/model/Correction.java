package dock.example.dock.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "correction")
public class Correction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "commentaire")
    private String commentaire;
    private Date date;


   /*@ManyToOne
   @JoinColumn(name = "user_id")
    private Userr userr;*/

}
