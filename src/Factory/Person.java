package Factory;

public class Person {
    private String name;
    public Person(){
        name = "DefaultNameBcI'mTooLazyToDoThisRight";
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void doJob(){
        System.out.println("Doing my job");
    }
    public void getPaid(){
        System.out.println("I'm getting paid bitches");
    }
}
