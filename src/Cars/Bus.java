package Cars;

public class Bus extends Car implements Competing{
    public Bus(String brand, String model, int engineVolume) {
        super(brand, model, engineVolume);
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
        return COMPETING_BUS;
    }

    @Override
    public int bestTimeRing() {
        return 0;
    }

    @Override
    public int maxSpeed() {
        return 0;
    }
}
