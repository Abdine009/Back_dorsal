package dock.example.dock.repository;

import dock.example.dock.model.Correction;
import dock.example.dock.model.Userr;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CorrectionRepository extends CrudRepository<Correction,Long> {

    //@Query("SELECT c FROM Correction c WHERE c.user_id = ?1 AND c.date BETWEEN ?2 AND ?3")

    //List<Correction> findByUserAndDateBetween(Userr user, LocalDate startDate, LocalDate endDate);

}
