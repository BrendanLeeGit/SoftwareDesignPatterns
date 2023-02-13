package ObserverPattern;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;
//idea is to have different air quality every day
//ppl wanna jog as much as possible, and rely on air quality reporting
//to know if they can jog or not
public class AirQualityReporting implements Subject {
    private ArrayList observers;
    private boolean safe;

    public AirQualityReporting() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(safe);
        }
    }

    public void beginRandomAirQuality(){
        Random r = new Random();
        for (int i = 0; i < 10000; i++){
            if (r.nextInt(100) == 69){
                safe = false;
            }
            else {safe = true;}
            notifyObservers();
        }
    }


}
