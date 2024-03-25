package dock.example.dock.service;

import dock.example.dock.model.Correction;
import dock.example.dock.model.Userr;
import dock.example.dock.repository.CorrectionRepository;
import dock.example.dock.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class CorrectionService {

    @Autowired
    private CorrectionRepository correctionRepository;
@Autowired
    private UserRepository userRepository;

    //Obtenir toutes les corrections
    public Iterable <Correction> getCorrections(){
        return  correctionRepository.findAll();
    }

    //Créer une nouvelle correction
    public Correction createCorrection(Correction correction){
        Correction createdCorrection = correctionRepository.save(correction);
        return createdCorrection;
    }

    //Supprimer un user
    public void deleteCorrection(final Long id){
        correctionRepository.deleteById(id);
    }

    //Retouner une correction particulière

    public Optional<Correction> getCorrection(final Long id){
        return correctionRepository.findById(id);
    }


    /////Corrections d'un user

    public List<Correction> getCorrections(Integer userId){
        Userr userr = userRepository.findById(userId).orElse(null);

        if(userr==null){
            return Collections.emptyList();
        }
        return userr.getCorrections();
    }

    //Cette fonction permet à l'utilisateur de remonté ses corrections entre deux dates
/*
    public List<Correction> getCorrectionsByUserAndPeriod(Integer userId, LocalDate startDate, LocalDate endDate) {
        Userr user = userRepository.findById(userId).orElse(null);

        if (user == null) {
            return Collections.emptyList();
        }

        return correctionRepository.findByUserAndDateBetween(user, startDate, endDate);
    }*/
}
