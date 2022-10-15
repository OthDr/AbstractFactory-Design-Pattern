package AbstractFactoryPattern.PortiereFactory.Portieres;

import AbstractFactoryPattern.PortiereFactory.Portiere;

public class PortiereStandard implements Portiere {
    private String verouillageVitres ;

    public PortiereStandard() {
        this.verouillageVitres = "vitre automatique";
    }


    @Override
    public void ouvrePorte() {
        System.out.println("\n+++Porte Standard : ouverte +++\n");
    }
}
