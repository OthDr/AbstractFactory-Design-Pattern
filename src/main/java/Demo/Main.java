package Demo;

import AbstractFactoryPattern.AbstractFactory;
import AbstractFactoryPattern.FactoryProducer;
import AbstractFactoryPattern.MoteurFacroty.Moteur;
import AbstractFactoryPattern.PortiereFactory.Portiere;

public class Main {
    public static void main(String[] args) {

        AbstractFactory moteurFactory = FactoryProducer.getFactory("moteur");

        Moteur engine_1 = moteurFactory.creerMoteur("catA");
        engine_1.accelererMoteur();
        Moteur engine_2 = moteurFactory.creerMoteur("catB");
        engine_2.accelererMoteur();
        Moteur engine_3 = moteurFactory.creerMoteur("catC");
        engine_3.accelererMoteur();


        AbstractFactory abstractPorte = FactoryProducer.getFactory("portiere");

        Portiere door_1 = abstractPorte.creePortiere("coulissante");
        door_1.ouvrePorte();
        Portiere door_2 = abstractPorte.creePortiere("standard");
        door_2.ouvrePorte();
    }


}