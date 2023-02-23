package Factory;

public class JobCenter {
    //leave a local reference for the object
    PeopleFactory pf;

    public JobCenter(PeopleFactory pf){
        this.pf = pf;
    }

    //Person is created and its methods get called bc why not, returns created person
    public Person getEmployee(String type){
        Person person = pf.createPerson(type);
        person.doJob();
        person.getPaid();
        return person;
    }
}
