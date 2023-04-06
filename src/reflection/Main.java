package reflection;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException {
        ReflectionTest r = new ReflectionTest();
        //this is for when I'm too lazy to run it from the command line with my batch file
        if (args.length == 0){
            args = new String[1];
            args[0] = "Reflection.ExampleClass";
        }
        r.run(args[0]);
    }
}
