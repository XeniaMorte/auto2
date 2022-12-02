package Cars;

import Cars.BigCar;
import Cars.Bus;
import Cars.LiteCar;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        LiteCar audi = new LiteCar("audi", "6dcw2", 212,TypeCouzov.HETCHBEK);
        LiteCar bmw = new LiteCar("BMW", "x4", 300,TypeCouzov.COUPE);
        LiteCar toyta = new LiteCar("TOY", "rav", 270,TypeCouzov.SEDAN);
        LiteCar tesla = new LiteCar("T", "69dne3", 312,TypeCouzov.SEDAN);

        BigCar maz = new BigCar("maz", "w2", 412,TypeCouzov.FURGON);
        BigCar volvo = new BigCar("Vol", "SCJ", 300,TypeCouzov.FURGON);
        BigCar daf = new BigCar("DaF", "9nde2", 570,TypeCouzov.FURGON);
        BigCar scania = new BigCar("scania", "SCAW", 312,TypeCouzov.FURGON);

        Bus e33 = new Bus("ee", "332", 512,TypeCouzov.PIKAP);
        Bus q12 = new Bus("y6", "9dj3", 220,TypeCouzov.PIKAP);
        Bus m1 = new Bus("MMM", "92", 370,TypeCouzov.PIKAP);
        Bus we2 = new Bus("WW99", "oc03n", 412,TypeCouzov.PIKAP);


        DriverB driverB = new DriverB("Ivan Petrovich", audi);
        DriverD driverD = new DriverD("Ivan Petrovich", volvo);
        DriverC driverC = new DriverC("Ivan Petrovich", m1);
        driverB.printCarMessage();
        driverD.printCarMessage();
        driverC.printCarMessage();
        bmw.printType();
    }

}