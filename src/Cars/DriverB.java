package Cars;

public class DriverB<T extends LiteCar> extends Driver<Driver.LicenceB> {
    public DriverB(String fio, T car) {
        super(fio, new Driver.LicenceB());
        this.car = car;
    }

    private T car;

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
