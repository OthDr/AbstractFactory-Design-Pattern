package AbstractFactoryPattern;

import AbstractFactoryPattern.MoteurFacroty.Moteur;
import AbstractFactoryPattern.PortiereFactory.Portiere;

public abstract class AbstractFactory {

   public abstract Moteur creerMoteur(String type);
   public abstract Portiere creePortiere(String type);


}
