package factory;

public class Main {
    public static void main(String[] args){
        //create job center object and use it to create a policeman and a firefighter
        JobCenter c = new JobCenter(new PeopleFactory());
        System.out.println(c.getEmployee("police").getName() + "\n");
        System.out.println(c.getEmployee("firefighter").getName());
    }
}
