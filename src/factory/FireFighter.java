package factory;

public class FireFighter extends Person{
    private String name;
    public FireFighter(){
        name = "Firefighter";
    }
    public void fightFire(){
        System.out.println("Fighting fires!");
    }
    public String getName(){
        return name;
    }
}
