package reflection;

public class ReflectionTest {
    public void run(String className) throws ClassNotFoundException, IllegalAccessException {
        //create instance of example class, reflection instance, and test it fully
        ExampleClass ex = new ExampleClass();
        //note, since this is in a package you must add the package name before the class name weird ik
        Reflection r = new Reflection(className, ex);
        r.fullTest();
        //Now here me out... what if we use our reflection class to analyze ITSELF
        Reflection re = new Reflection("Reflection.Reflection", r);
        re.fullTest();
    }
}
