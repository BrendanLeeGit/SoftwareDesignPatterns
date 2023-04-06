package reflection;

public class ExampleClass {
    private boolean weird;
    private int randomInt;
    public double pubDub;
    public final String name;

    public ExampleClass(){
        weird = false;
        randomInt = 3;
        pubDub = 1.2;
        name = "woop";
    }

    public ExampleClass(boolean weird){
        this.weird = weird;
        randomInt = 3;
        pubDub = 2.5;
        name = "woop";
    }

    public void doubleDouble(){
        pubDub *= 2;
    }

    private void switchBool(){
        weird = !weird;
    }

    protected int hoolah(String poop){
        return 96;
    }
}
