package Cars;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Mechanic {
    String name;
    String company;
    ArrayList<Car> someCars;
    public Set<Mechanic>mechanics=new HashSet<>();

    public Mechanic(String name, String company, ArrayList<Car> someCars) {
        this.company = company;
        this.name = name;
        this.someCars = someCars;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Car> getSomeCars() {
        return someCars;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", someCars=" + someCars +
                '}';
    }

    public void repairCar(Car car) {
        if (someCars.contains(car)) {
            System.out.println("mexanic " + name + " company " + company + " repair " + car);

        } else {
            System.out.println(" механик не может починить машину ");
        }
    }

    public void tO(Car car) {
        if (someCars.contains(car)) {
            System.out.println("mexanic " + name + " company " + company + " repair " + car);

        } else {
            System.out.println(" механик не может провести ТО");
        }
        System.out.println("mexanic " + name + " company " + company + " tO " + car);

    }

}

