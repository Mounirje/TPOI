package org.example.dao;

import java.util.List;

public interface IEtudiantDAO {
    Etudiant addEtudiant(Etudiant etud);
    Etudiant updateEtudiant(Etudiant etud);
    List<Etudiant> getAllEtudiants();
}
