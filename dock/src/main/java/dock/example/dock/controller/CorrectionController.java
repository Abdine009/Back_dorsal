package dock.example.dock.controller;

import dock.example.dock.model.Correction;
import dock.example.dock.model.Userr;
import dock.example.dock.repository.UserRepository;
import dock.example.dock.service.CorrectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CorrectionController {

    @Autowired
    private CorrectionService correctionService;

    @Autowired
    private UserRepository userRepository;

    //Return all users
    @GetMapping("/corrections")
    public Iterable<Correction> getCorrections(){
        return correctionService.getCorrections();
    }

    //Créer une nouvelle correction
    @PostMapping("/correction/create")
    public Correction createCorrection(@RequestBody Correction correction){
        return correctionService.createCorrection(correction);
    }

    //Supprimer une correction

    @DeleteMapping("/correction/delete/{id}")
    public void deleteCorrection(@PathVariable("id") final Long id){
        correctionService.deleteCorrection(id);
    }

    //Retouner une correction particulière

    @GetMapping("/correction/find/{id}")
    public Correction getCorrection(@PathVariable ("id") final Long id){
        Optional<Correction> correction = correctionService.getCorrection(id);
        if(correction.isPresent()){
            return  correction.get();
        } else {
            return null;
        }

    }


    //Retourner une correction mise à jour

    @PutMapping("/correction/update/{id}")
    public Correction updateCorrection(@PathVariable("id") final Long id, @RequestBody Correction correction){
        Optional<Correction> correct = correctionService.getCorrection(id);
        if(correct.isPresent()){
            Correction currentCorrection= correct.get();

            //On a fini de recupérer la correction de la BD, on effectue maintenant les changements s'il on lieu et on finit par un enregistrement dans la BD

            String commentaire = correction.getCommentaire();
            if(commentaire !=null){
                currentCorrection.setCommentaire(commentaire);
            }
            Date date = correction.getDate();
            if (date!=null){
                currentCorrection.setDate(date);
            }


            correctionService.createCorrection(currentCorrection);
            return currentCorrection;
        }else {
            return null;
        }
    }


    //Retourner les corrections du user 1

    //Retouner une correction particulière

    @GetMapping("/correction/user/{id}")
    public List<Correction> getUserCorrections(@PathVariable ("id") final Integer id){

        return correctionService.getCorrections(id);

    }
}
