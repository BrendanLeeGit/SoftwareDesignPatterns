package observerPatternCustom;
/**
 * Jogger can jog 10 miles a day.
 * They want to maximize miles jogged bc they're an exercise junkie.
 */
public class Jogger implements Observer{
    private int milesJogged;
    private boolean willJog;

    public Jogger(Subject aQR){
        milesJogged = 0;
        willJog = true;
    }

    public void update(boolean safe){
        if (safe){
            willJog = true;
        }
        else{
            willJog = false;
        }
    }

    public void attemptJog(){
        if (willJog == true){
            milesJogged++;
        }
    }

    public int getMilesJogged(){
        return milesJogged;
    }

    //for use when ppl unsubscribe, else they might unsubscribe and just never jog again if they unsubscribed
    //when the air wasn't safe
    public void resetJogger(){
        willJog = true;
    }
}
