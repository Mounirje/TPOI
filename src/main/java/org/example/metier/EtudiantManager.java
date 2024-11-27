package org.example.metier;

import org.example.dao.Etudiant;
import org.example.dao.IEtudiantDAO;

import java.util.List;

public class EtudiantManager {
    public IEtudiantDAO iEtudiantDAO;
    public EtudiantManager(IEtudiantDAO iEtudiantDAO) {
        this.iEtudiantDAO = iEtudiantDAO;
    }

    public Etudiant addEtudiant(Etudiant et) {
        int count = 0;
        if(!iEtudiantDAO.getAllEtudiants().isEmpty()) {
            for(Etudiant etud : iEtudiantDAO.getAllEtudiants()) {
                if(etud.getEmail() == etud.getEmail()){
                    count++;
                }
            }
            if(count > 0 ){
                System.out.println("Email existe déjà");
            }else{
                iEtudiantDAO.addEtudiant(et);
            }
        }
        return et;
    }

    public Etudiant updateEtudiant(Etudiant et) {
        return iEtudiantDAO.updateEtudiant(et);
    }
    public List<Etudiant> getAllEtudiants(){
        return iEtudiantDAO.getAllEtudiants();
    }
}
