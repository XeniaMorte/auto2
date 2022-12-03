package Cars;

public class Bus extends Car implements Competing{
    public Bus(String brand, String model, int engineVolume,TypeCouzov typeCouzov) {
        super(brand, model, engineVolume,typeCouzov);
    }
    public   static final String[] COMPETING_BUS= {"1", "2", "3"};

    @Override
    protected void startMovieng() {

    }

    @Override
    protected void stopMovieng() {

    }

    @Override
    public String[] competingCars() {
        System.out.println("DONE");
        return COMPETING_BUS;
    }

    @Override
    public int bestTimeRing() {
        System.out.println("DONE");
        return 0;

    }

    @Override
    public int maxSpeed() {
        System.out.println("DONE");
        return 0;
    }

    @Override
    public boolean diagnoctic() {
        System.out.println(" ERROR");
        return false;
    }
}
