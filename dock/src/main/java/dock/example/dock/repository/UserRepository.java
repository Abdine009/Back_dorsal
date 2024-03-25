package dock.example.dock.repository;

import dock.example.dock.model.Userr;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface UserRepository extends CrudRepository<Userr,Integer> {
    Userr findByUsername(String username);
}
