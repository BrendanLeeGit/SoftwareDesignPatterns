package TemplateDesignPattern;

public abstract class Program {
    void runProgram(){
        bootUpIDE();
        writeCode();
        output();
    }

    abstract void bootUpIDE();
    abstract void writeCode();

    void output(){
        System.out.println("Printing out code!");
    }


}
