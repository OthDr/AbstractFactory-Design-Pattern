package AbstractFactoryPattern.PortiereFactory.Portieres;

import AbstractFactoryPattern.PortiereFactory.Portiere;

public class PortiereCoulissante implements Portiere {

    private String verouillageVitres ;

    public PortiereCoulissante() {
        this.verouillageVitres = "vitre manuel";
    }


    @Override
    public void ouvrePorte() {
        System.out.println("\n+++Porte Coulissante : ouverte +++\n");
    }
}
