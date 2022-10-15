package AbstractFactoryPattern.MoteurFacroty;

import AbstractFactoryPattern.MoteurFacroty.Moteurs.MoteurCatA;
import AbstractFactoryPattern.MoteurFacroty.Moteurs.MoteurCatB;
import AbstractFactoryPattern.MoteurFacroty.Moteurs.MoteurCatC;
import AbstractFactoryPattern.AbstractFactory;
import AbstractFactoryPattern.PortiereFactory.Portiere;


public class MoteurFactory extends AbstractFactory {


    @Override
    public Moteur creerMoteur(String type) {
        Moteur moteur = null;
        switch (type) {
            case "catA":
                moteur = new MoteurCatA();
                break;
            case "catB":
                moteur = new MoteurCatB();
                break;
            case "catC":
                moteur = new MoteurCatC();
                break;
        }
        return moteur;

    }

    @Override
    public Portiere creePortiere(String type) {
        return null;
    }



}
