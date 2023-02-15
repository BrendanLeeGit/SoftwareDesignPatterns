package ObserverPatternCustom;

import java.util.Random;
public class JoggingCenter {
    public static void main(String[] args){
        AirQualityReporting aQR = new AirQualityReporting();
        Random r = new Random();
        Jogger[] joggers = new Jogger[20];
        AirQualityReporting aqr = new AirQualityReporting();

        //create 20 jogger objects and register them immediately
        for (int i = 0; i < 3; i++){
            joggers[i] = new Jogger(aQR);
            aQR.registerObserver(joggers[i]);
        }

        //actually no, the first jogger will just never register at all. out of sight out of mind, he says
        aQR.removeObserver(joggers[0]);

        //begin the first 100 days
        for (int i = 0; i < 100; i++){
            if (r.nextInt(10) > 8){
                aQR.setSafe(false);
            }
            else {
                aQR.setSafe(true);
            }

            for (int j = 0; j < 3; j++){
                joggers[j].attemptJog();
            }
        }

        //for funsies, for the next 100 days we'll just unsubscribe the third jogger
        aQR.removeObserver(joggers[2]);
        joggers[2].resetJogger();

        //begin the next 100 days
        for (int i = 0; i < 100; i++){
            if (r.nextInt(11) > 9){
                aQR.setSafe(false);
            }
            else {
                aQR.setSafe(true);
            }

            for (int j = 0; j < 3; j++){
                joggers[j].attemptJog();
            }
        }

        //Show results of all the joggers
        //Those who unsubscribed have a halved life expectancy(not actually in code, imagination only :D )
        for (int i = 0; i < 3; i++){
            System.out.println("Miles jogged by jogger " + i + ": " + joggers[i].getMilesJogged());
        }
    }
}
