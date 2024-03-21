package dock.example.dock.repository;

import dock.example.dock.model.Correction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorrectionRepository extends CrudRepository<Correction,Long> {
}
