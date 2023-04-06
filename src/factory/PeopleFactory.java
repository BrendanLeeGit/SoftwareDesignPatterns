package factory;

public class PeopleFactory {
    //this design pattern allows any changes to the types of ppl we need to make to stay in this class
    //maybe we'd have to touch the Person class too but most of it should happen here, other than the subclasses obv
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
