package serialization;

import java.io.Serializable;

public class Virus implements Serializable {
    private String name;
    private String filePath;

    public Virus(String name){
        this.name = name;
    }

    public void error(){
        for (int i = 0; i < 10; i++){
            System.out.println("Your system is hacked by the " + name + " virus!!!");
        }
    }

    public String getName(){
        return name;
    }

    public void testNoParameterMethod(){
        System.out.println("DOOOOOOOOM!");
    }

    public void testParameterMethod(int i){
        System.out.println(i);
    }
}
