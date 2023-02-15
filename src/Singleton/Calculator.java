package Singleton;

public class Calculator {
    private static Calculator calc;
    private float ans;
    private Calculator(){
        ans = 0;
    };
    public static Calculator getInstance(){
        if (calc == null){
            calc = new Calculator();
        }
        return calc;
    }

    /*
    Why a calculator, you may ask. Idk, it just makes sense since you'll only really ever need one calculator probs
    Unless you really want two, but then why?
     */

    public float add(float a){
        ans += a;
        return ans;
    }

    public void clear(){
        ans = 0;
    }

    public float getAnswer(){
        return ans;
    }
}
