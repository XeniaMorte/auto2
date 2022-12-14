package Cars;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Sponsor> sponsors = new ArrayList<>();
        ArrayList<Driver> drivers = new ArrayList<>();

        LiteCar audi = new LiteCar("audi", "6dcw2", 212, TypeCouzov.HETCHBEK, true);
        LiteCar bmw = new LiteCar("BMW", "x4", 300, TypeCouzov.COUPE, true);
        LiteCar toyta = new LiteCar("TOY", "rav", 270, TypeCouzov.SEDAN, false);
        LiteCar tesla = new LiteCar("T", "69dne3", 312, TypeCouzov.SEDAN, true);

        BigCar maz = new BigCar("maz", "w2", 412, TypeCouzov.FURGON);
        BigCar volvo = new BigCar("Vol", "SCJ", 300, TypeCouzov.FURGON);
        BigCar daf = new BigCar("DaF", "9nde2", 570, TypeCouzov.FURGON);
        BigCar scania = new BigCar("scania", "SCAW", 312, TypeCouzov.FURGON);

        Bus e33 = new Bus("ee", "332", 512, TypeCouzov.PIKAP);
        Bus q12 = new Bus("y6", "9dj3", 220, TypeCouzov.PIKAP);
        Bus m1 = new Bus("MMM", "92", 370, TypeCouzov.PIKAP);
        Bus we2 = new Bus("WW99", "oc03n", 412, TypeCouzov.PIKAP);


        DriverB driverB = new DriverB("Ivan Petrovich", audi);
        DriverD driverD = new DriverD("Ivan Petrovich", volvo);
        DriverC driverC = new DriverC("Ivan Petrovich", m1);
        Sponsor stepan = new Sponsor("Step", "Alpha", 245890);
        Sponsor vova = new Sponsor("Vova", "ES", 67890);

        ArrayList<Car> grishaCars = new ArrayList<>();
        grishaCars.add(audi);
        grishaCars.add(bmw);
        grishaCars.add(toyta);
        grishaCars.add(scania);
        Mechanic grisha = new Mechanic("Гриша", "ORE", grishaCars);
        sponsors.add(stepan);
        sponsors.add(vova);

        drivers.add(driverB);
        drivers.add(driverC);
        drivers.add(driverD);

        cars.add(audi);
        cars.add(bmw);
        cars.add(tesla);
        cars.add(toyta);
        cars.add(maz);
        cars.add(volvo);
        cars.add(daf);
        cars.add(scania);
        cars.add(e33);
        cars.add(q12);
        cars.add(m1);
        cars.add(we2);


        driverB.printCarMessage();
        driverD.printCarMessage();
        driverC.printCarMessage();
        bmw.printType();
        TexStation<LiteCar> minic=new TexStation<>(6);
        minic.addCar(audi);
    }

}