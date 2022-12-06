package Cars;

import java.util.ArrayDeque;
import java.util.Queue;

public class TexStation<T extends Car> {
    int time;

    public ArrayDeque<T> carQueue=new ArrayDeque<>() ;

    public TexStation( int time){
        this.time=time;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "TexStation{" +
                "time=" + time +
                ", carQueue=" + carQueue +
                '}';
    }
    public void addCar(T car){
        carQueue.add(car);
        System.out.println(" car "+car+ " добавлена в очередь");
    }
}
