package Cars;

public abstract class Car {
    private String brand;
    private String model;
    int engineVolume;
    TypeCouzov typeCouzov;


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public Car(String brand, String model, int engineVolume,TypeCouzov typeCouzov) {
        this.typeCouzov=typeCouzov;
        this.brand = brand;
        this.engineVolume = engineVolume;
        this.model = model;
    }

    protected abstract void startMovieng();

    protected abstract void stopMovieng();
    protected void  printType(){
        System.out.println(this.brand+ " "+this.model+" "+ " тип кузова "+" "+this.typeCouzov);
        if (this.typeCouzov == null){
            System.out.println(" тип кузова не указан");
        }
    }

}
