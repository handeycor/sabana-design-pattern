package automotivecompany.entity;

public class Car {
    private String engine;
    private String color;
    private String tires;
    private String soundSystem;
    private String interiors;
    private Boolean sunroof;
    private Boolean gps;

    public Car(String engine, String color, String tires, String soundSystem, String interiors, Boolean sunroof, Boolean gps) {
        this.engine = engine;
        this.color = color;
        this.tires = tires;
        this.soundSystem = soundSystem;
        this.interiors = interiors;
        this.sunroof = sunroof;
        this.gps = gps;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    public void setSoundSystem(String soundSystem) {
        this.soundSystem = soundSystem;
    }

    public void setInteriors(String interiors) {
        this.interiors = interiors;
    }

    public void setSunroof(Boolean sunroof) {
        this.sunroof = sunroof;
    }

    public void setGps(Boolean gps) {
        this.gps = gps;
    }


    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", tires='" + tires + '\'' +
                ", soundSystem='" + soundSystem + '\'' +
                ", interiors='" + interiors + '\'' +
                ", sunroof=" + sunroof +
                ", gps=" + gps +
                '}';
    }
}
