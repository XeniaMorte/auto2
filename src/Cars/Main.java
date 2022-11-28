package Cars;

import Cars.BigCar;
import Cars.Bus;
import Cars.LiteCar;

public class Main {
    public static void main(String[] args) {

       LiteCar audi=new LiteCar("audi","6dcw2",212);
        LiteCar bmw=new LiteCar("BMW","x4",300);
        LiteCar toyta=new LiteCar("TOY","rav",270);
        LiteCar tesla=new LiteCar("T","69dne3",312);

        BigCar maz=new BigCar("maz","w2",412);
        BigCar volvo=new BigCar("Vol","SCJ",300);
        BigCar daf=new BigCar("DaF","9nde2",570);
        BigCar scania=new BigCar("scania","SCAW",312);

        Bus e33=new Bus("ee","332",512);
        Bus q12=new Bus("y6","9dj3",220);
        Bus m1=new Bus("MMM","92",370);
        Bus we2=new Bus("WW99","oc03n",412);
    }
}