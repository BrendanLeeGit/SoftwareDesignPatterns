package templateDesignPattern;

public class ProgramTester {
    public static void main(String[] args){
        Program j = new JavaProgram();
        Program c = new CPP();
        j.runProgram();
        System.out.println("");
        c.runProgram();
    }
}
