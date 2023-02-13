package ObserverPattern;

public class JoggingCenter {
    public static void main(String[] args){
        Jogger[] joggers = new Jogger[20];
        AirQualityReporting aqr = new AirQualityReporting();
        for (Jogger j : joggers){
            j = new Jogger();
        }
    }
}
