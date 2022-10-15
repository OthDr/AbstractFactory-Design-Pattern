package AbstractFactoryPattern.MoteurFacroty.Moteurs;

import AbstractFactoryPattern.MoteurFacroty.Moteur;

public class MoteurCatA implements Moteur {

    public String puissance;


    @Override
    public void accelererMoteur() {
        System.out.println("\n--- Moteur categorie(A) Accelere ---\n");
    }
}
