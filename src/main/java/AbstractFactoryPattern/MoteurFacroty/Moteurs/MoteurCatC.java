package AbstractFactoryPattern.MoteurFacroty.Moteurs;

import AbstractFactoryPattern.MoteurFacroty.Moteur;

public class MoteurCatC implements Moteur {
    public String puissance;

    public MoteurCatC() {
        this.puissance = "-90 HP";
    }

    @Override
    public void accelererMoteur() {

        System.out.println("\n--- Moteur categorie(C) Accelere ---\n");
    }
}
