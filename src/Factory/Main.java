package Factory;

public class Main {
    public static void main(String[] args){
        JobCenter c = new JobCenter(new PeopleFactory());
        System.out.println(c.getEmployee("police").getName());
        System.out.println(c.getEmployee("firefighter").getName());
    }
}
