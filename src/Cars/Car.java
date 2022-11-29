package Cars;

public abstract class Car {
    private String brand;
    private String model;
    int engineVolume;


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

    public Car(String brand, String model, int engineVolume) {
        this.brand = brand;
        this.engineVolume = engineVolume;
        this.model = model;
    }

    protected abstract void startMovieng();

    protected abstract void stopMovieng();

}
