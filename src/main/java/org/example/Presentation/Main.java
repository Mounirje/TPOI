package org.example.Presentation;

import org.example.dao.Etudiant;
import org.example.dao.EtudiantDAODictionary;
import org.example.dao.IEtudiantDAO;
import org.example.metier.EtudiantManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IEtudiantDAO etudiantDAODict = new EtudiantDAODictionary();
        Etudiant e1 = new Etudiant(1,"Jon","Jones","jon.jones@gmail.com");
        Etudiant e2 = new Etudiant(1,"Khabib","Nurmagodev","khabib.ufc@gmail.com");
        Etudiant e3 = new Etudiant(1,"Goerge","Saint-Pierre","gsp@gmail.com");
        Etudiant e4 = new Etudiant(1,"James","Jones","james.jones@gmail.com");

        EtudiantManager etudiantManager = new EtudiantManager(etudiantDAODict);
        etudiantManager.addEtudiant(e1);
        etudiantManager.addEtudiant(e2);
        etudiantManager.addEtudiant(e3);
        etudiantManager.addEtudiant(e4);

        e4.setPrenom("Jordan");
        etudiantManager.updateEtudiant(e4);
        System.out.println(etudiantManager.getAllEtudiants());
    }
}