package ObserverPatternCustom;
import java.util.ArrayList;

//idea is to have different air quality every day
//ppl wanna jog as much as possible, and rely on air quality reporting
//to know if they can jog or not
public class AirQualityReporting implements Subject {
    private ArrayList observers;
    private boolean safe;
    private boolean previousSafe;

    public AirQualityReporting() {
        observers = new ArrayList<Observer>();
        previousSafe = true;
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


    public void setSafe(boolean safe){
        this.safe = safe;
        if (safe != previousSafe){
            notifyObservers();
        }
        previousSafe = safe;
    }

}