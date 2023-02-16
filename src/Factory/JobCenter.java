package Factory;

public class JobCenter {
    PeopleFactory pf;
    public JobCenter(PeopleFactory pf){
        this.pf = pf;
    }

    public Person getEmployee(String type){
        Person person = pf.createPerson(type);
        person.doJob();
        person.getPaid();
        return person;
    }
}
