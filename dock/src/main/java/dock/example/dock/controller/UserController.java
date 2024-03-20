package dock.example.dock.controller;

import dock.example.dock.model.Userr;
import dock.example.dock.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    //Retun all users
    @GetMapping("/users")
    public Iterable<Userr> getUsers(){
        return userService.getUsers();
    }


    //Créer un nouvel user

    @PostMapping("user/create")
    public Userr newUserr(@RequestBody Userr userr){
        return  userService.createUser(userr);
    }

    //Supprimer un user

    @DeleteMapping("user/delete/{id}")
    public void deleteUser(@PathVariable("id") final Integer id){
        userService.deleteUser(id);
    }

    //Return home page
    @GetMapping("/")
    public String home(Principal principal){
        return  "Hello, world" + principal.getName();
    }

    //Retourner un user particulier
    @GetMapping("/user/find/{id}")
    public Userr getUser(@PathVariable ("id") final Integer id){
        Optional<Userr> userr = userService.getUser(id);
        if(userr.isPresent()){
            return userr.get();
        }else{
            return  null;
        }
    }

    //Retourner un user mise à jour

    @PutMapping("/user/update/{id}")
    public Userr updateUser(@PathVariable("id") final Integer id, @RequestBody Userr userr){
        Optional<Userr> u = userService.getUser(id);
        if(u.isPresent()){
            Userr currentUserr= u.get();

            //On a fini de recupérer l'user de la BD, on effectue maintenant les changements s'il on lieu et on finit par un enregistrement dans la BD

            String name = userr.getName();
            if(name !=null){
                currentUserr.setName(name);
            }
            String surName = userr.getSurname();
            if (surName!=null){
                currentUserr.setSurname(surName);
            }
            String userName = userr.getUsername();
            if (userName!=null){
                currentUserr.setUsername(userName);
            }
            String password = userr.getPassword();
            if (password!=null){
                currentUserr.setPassword(password);
            }

            userService.createUser(currentUserr);
            return currentUserr;
        }else {
            return null;
        }
    }

}
