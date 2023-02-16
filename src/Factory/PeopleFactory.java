package Factory;

public class PeopleFactory {
    public Person createPerson(String type){
        Person person = null;
        if (type.equals("police")){
            person = new Policeman();
        }
        else if (type.equals("firefighter")){
            person = new FireFighter();
        }
        return person;
    }

}
