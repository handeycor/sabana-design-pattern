package automotivecompany.builder;

import automotivecompany.gateway.CustomizationCar;

public class CarDirector {


    public CarDirector() {
    }

    public void makeBasicCar(CustomizationCar customizationCar) {
        customizationCar.setEngine("Motor 1.8L, 4 cilindros");
        customizationCar.setColor("Black");
        customizationCar.setTires("H/T Highway Terrain");
        customizationCar.setInteriors("Tela de paño estándar.");
    };

    public void makeHighCustomCar(CustomizationCar customizationCar) {
        customizationCar.setEngine("V8 Biturbo de alto rendimiento.");
        customizationCar.setColor("Rojo carmesí.");
        customizationCar.setTires("Eagle F1 Asymmetric");
        customizationCar.setSoundSystem("Pioneer TS-G1720F");
        customizationCar.setInteriors("Cuero negro!");
        customizationCar.setSunroof(true);
        customizationCar.setGps(true);
    };
}