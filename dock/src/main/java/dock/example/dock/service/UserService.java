package dock.example.dock.service;

import dock.example.dock.model.Userr;
import dock.example.dock.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //La méthode qui me permet de recupérer la liste des users de mon site
    public Iterable <Userr> getUsers(){
        return  userRepository.findAll();
    }


    //La méthode pourcréer un nouvel utilisateur

    public  Userr createUser(Userr userr){
        Userr createdUserr = userRepository.save(userr);
        return createdUserr;
    }

    //Supprimer un user
    public void deleteUser(final Integer id){
        userRepository.deleteById(id);
    }

    //Retourner un userr particulier
    public Optional<Userr> getUser(final Integer id){
        return userRepository.findById(id);
    }

}
