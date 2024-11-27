package org.example.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EtudiantDAODictionary implements IEtudiantDAO{
    static HashMap<Integer,Etudiant> stringEtudiantHashMap = new HashMap<Integer,Etudiant>();
    @Override
    public Etudiant addEtudiant(Etudiant etud) {
        return stringEtudiantHashMap.put(etud.getId(),etud);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etud) {
        for(Etudiant e : getAllEtudiants()){
            if(e.getId()==etud.getId()){
                e.setNom(etud.getNom());
                e.setPrenom(etud.getPrenom());
                e.setEmail(etud.getEmail());
            }
        }
        return etud;
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return new ArrayList<>(stringEtudiantHashMap.values());
    }
}
