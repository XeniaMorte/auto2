package Cars;

public class DriverC<T extends Bus> extends Driver<Driver.LicenceC> {


    public DriverC(String fio, T car) {
        super(fio, new Driver.LicenceC());
        this.car = car;

    }
    private final T car;
    @Override
    String start() {
        return " Go";
    }

    @Override
    String stop() {
        return "stop";
    }

    @Override
    String refuel() {
        return "bllllll";
    }



    public void printCarMessage() {
        System.out.println("водитель " + this.getFio() + " управляет автомобилем "
                + car.getBrand() + " " + car.getModel() + " и будет участвовать в заезде");


    }
}


