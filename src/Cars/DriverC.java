package Cars;

public class DriverC<T extends Bus>extends Driver {
        public DriverC(String fio,String skill,boolean havingLicense){
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
        public String massengeCar(Bus bus){
            return "driver"+getFio()+bus.getBrand()+bus.getModel()+"go race";
        }
    }


