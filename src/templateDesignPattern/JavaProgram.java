package templateDesignPattern;

public class JavaProgram extends Program{
    @Override
    void bootUpIDE() {
        System.out.println("Booting up Intellij");
    }

    void writeCode(){
        System.out.println("System.out.println(\"Booting up Intellij\")");
    }
}
