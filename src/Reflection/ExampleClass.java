package Reflection;

public class ExampleClass {
    private boolean weird;
    private int randomInt;
    public double pubDub;
    public String name;

    public ExampleClass(){
        weird = false;
        randomInt = 3;
        pubDub = 1.2;
    }

    public ExampleClass(boolean weird){
        this.weird = weird;
        randomInt = 3;
        pubDub = 2.5;
    }

    public void doubleDouble(){
        pubDub *= 2;
    }

    private void switchBool(){
        weird = !weird;
    }
}
