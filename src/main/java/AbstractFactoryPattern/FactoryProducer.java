package AbstractFactoryPattern;

import AbstractFactoryPattern.MoteurFacroty.MoteurFactory;
import AbstractFactoryPattern.PortiereFactory.PortiereFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type) {
        if (type.equalsIgnoreCase("moteur")) {
            return new MoteurFactory();
        } else if (type.equalsIgnoreCase("portiere")) {
            return new PortiereFactory();
        }
        return null;
    }
}
