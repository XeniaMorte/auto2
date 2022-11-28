package Cars;

public class DriverB<T extends LiteCar>extends Driver {
    public DriverB(String fio,String skill,boolean havingLicense){
        super( fio,skill, havingLicense);

    }
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
    public String massengeCar(LiteCar liteCar){
        return "driver"+getFio()+liteCar.getBrand()+liteCar.getModel()+"go race";
    }
}
