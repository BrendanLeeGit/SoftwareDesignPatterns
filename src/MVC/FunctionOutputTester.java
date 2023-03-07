package MVC;
import java.io.IOException;

public class FunctionOutputTester {
    public static void main(String[] args) throws IOException {
        FunctionOutput functionOutput = new FunctionOutput();
        functionOutput.run(1, 6, 1, 5, 6);

        View v = new View();
        v.run();
    }
}
