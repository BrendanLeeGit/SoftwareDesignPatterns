package Factory;

public class Policeman extends Person{
    private String name;
    public Policeman(){
        name = "Police";
    }
    public void arrestCriminal(){
        System.out.println("Arresting criminal!");
    }
    public String getName(){
        return name;
    }
}
