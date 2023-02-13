package ObserverPattern;
/**
 * Jogger can jog 10 miles a day.
 * They want to maximize miles jogged bc they're an exercise junkie.
 */
public class Jogger implements Observer{
    int milesJogged;

    public Jogger(){
        milesJogged = 0;
    }

    public void update(boolean safe){
        if (safe){
            milesJogged += 10;
        }
    }

    public void say(){
        System.out.println("Poop");
    }
}
