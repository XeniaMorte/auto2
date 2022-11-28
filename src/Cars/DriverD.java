package Cars;

public class DriverD<T extends BigCar>extends Driver {
        public DriverD(String fio,String skill,boolean havingLicense){
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
        public String massengeCar(BigCar bigCar){
            return "driver"+getFio()+bigCar.getBrand()+bigCar.getModel()+"go race";
        }
    }

