package AbstractFactoryPattern.PortiereFactory;

import AbstractFactoryPattern.MoteurFacroty.Moteur;
import AbstractFactoryPattern.PortiereFactory.Portieres.PortiereCoulissante;
import AbstractFactoryPattern.PortiereFactory.Portieres.PortiereStandard;
import AbstractFactoryPattern.AbstractFactory;

public class PortiereFactory extends AbstractFactory {


    @Override
    public Moteur creerMoteur(String type) {
        return null;
    }

    @Override
    public Portiere creePortiere(String type) {
        switch (type) {
            case "coulissante":
                return new PortiereCoulissante();
            case "standard":
                return new PortiereStandard();
        }
        return null;
    }

}
