package AbstractFactoryPattern.MoteurFacroty.Moteurs;

import AbstractFactoryPattern.MoteurFacroty.Moteur;

public class MoteurCatB implements Moteur {
    public String puissance;

    public MoteurCatB() {
        this.puissance = "90-150 HP";
        ;
    }


    @Override
    public void accelererMoteur() {
        System.out.println("\n--- Moteur categorie(B) Accelere ---\n");
    }

}
