package automotivecompany.builder;

import automotivecompany.entity.Car;
import automotivecompany.gateway.CustomizationCar;


public class CarBuilder implements CustomizationCar {

    private Car car;
    private String engine;
    private String color;
    private String tires;
    private String soundSystem;
    private String interiors;
    private Boolean sunroof;
    private Boolean gps;

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }
    @Override
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public void setTires(String tires) {
        this.tires = tires;
    }
    @Override
    public void setSoundSystem(String soundSystem) {
        this.soundSystem = soundSystem;
    }
    @Override
    public void setInteriors(String interiors) {
        this.interiors = interiors;
    }
    @Override
    public void setSunroof(Boolean sunroof) {
        this.sunroof = sunroof;
    }

    @Override
    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public Car getCar() {
        return new Car(engine, color, tires, soundSystem, interiors, sunroof, gps);
    }

}
