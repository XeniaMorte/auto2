package Cars;

public class LiteCar extends Car {

   TypeCouzov typeCouzov;
   boolean didiagnoctic;

    public LiteCar(String brand, String model, int engineVolume, TypeCouzov typeCouzov,boolean didiagnoctic) {

        super(brand, model, engineVolume,typeCouzov);
    }

    @Override
    protected void startMovieng() {

    }

    @Override
    protected void stopMovieng() {

    }

    @Override
    public boolean diagnoctic() {
        return this.diagnoctic();
    }
}
