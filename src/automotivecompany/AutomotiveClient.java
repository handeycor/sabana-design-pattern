package automotivecompany;

import automotivecompany.builder.CarBuilder;
import automotivecompany.builder.CarDirector;
import automotivecompany.entity.Car;

public class AutomotiveClient {

    public void execute(){

        final CarBuilder basicCar = new CarBuilder();
        final CarBuilder customCar = new CarBuilder();

        final CarDirector carDirector = new CarDirector();

        System.out.println("Car Builder: Auto básico.");
        carDirector.makeBasicCar(basicCar);
        Car basic = basicCar.getCar();
        System.out.println("Car Builder: Auto básico. "+ basic.toString());

        System.out.println("Car Builder: Auto Personalizado!.");
        carDirector.makeHighCustomCar(customCar);
        Car custom = customCar.getCar();
        System.out.println("Car Builder: Auto Personalizado!. "+ custom.toString());
    }
}
