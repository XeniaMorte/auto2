package Cars;

public class DriverD<T extends BigCar> extends Driver<Driver.LicenceD> {
    public DriverD(String fio, T car) {
        super(fio, new Driver.LicenceD());
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



