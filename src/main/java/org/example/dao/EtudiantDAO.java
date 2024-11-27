package org.example.dao;

import java.util.ArrayList;
import java.util.List;

public class EtudiantDAO implements IEtudiantDAO{
    static List<Etudiant> etudiants = new ArrayList<Etudiant>();
    @Override
    public Etudiant addEtudiant(Etudiant etud) {
        etudiants.add(etud);
        return etud;
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etud) {
        for(Etudiant et : etudiants){
            if(et.getId() == etud.getId()){
                et.setEmail(etud.getEmail());
                et.setNom(etud.getNom());
                et.setPrenom(etud.getPrenom());
            }
        }
        return etud;
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiants;
    }
}
