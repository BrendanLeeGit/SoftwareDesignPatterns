package MVC;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Model implements Subject{
    //Using equation slope y = mx + b
    ArrayList<Double> outputs;
    ArrayList<Double> inputs;
    FileWriter fileWriter;
    //only have one observer so not gonna bother making an arraylist
    Observer observer;

    public Model(){
        outputs = new ArrayList<>();
        inputs = new ArrayList<>();
    }

    /**
     * Takes in a range of inputs and adds the outputs to the outputs ArrayList.
     *
     * @param x1        Lower bound of input values
     * @param x2        Upper bound of input values
     * @param increment How much you want your x to increase by for each run
     * @param m         Slope
     * @param b         Starting Y-axis
     */
    public void buildOutputArrayList(double x1, double x2, double increment, double m, double b){
        double result = 1;
        //
        while (Double.compare(x1, x2) <= 0){
            result = x1 * m + b;
            outputs.add(result);
            inputs.add(x1);
            x1 += increment;
        }
        //let view know that model changed
        notifyObservers();
    }

    public void resetArrayLists(){
        outputs.clear();
        inputs.clear();
        notifyObservers();
    }

    /**
     * Uses FileWriter to generate the .csv file with the proper outputs.
     *
     * @throws IOException
     */
    public void buildFile() throws IOException {
        //Create FileWriter object that creates an output csv file
        fileWriter = new FileWriter("output.csv");
        fileWriter.write("x,y\n");
        //Write the entire outputs ArrayList on the file
        for (int i = 0; i < outputs.size(); i++){
            fileWriter.write(inputs.get(i) + "," + outputs.get(i) + "\n");
        }
        //Close the file to avoid issues.
        fileWriter.close();
    }

    /**
     * Returns the output as a string for the view.
     * @return  the outputs ArrayList as a string
     */
    public String getOutput(){
        String result = "(Inputs, Output):\n";
        for (int i = 0; i < inputs.size(); i++){
            result += "(" + inputs.get(i) + ", " + outputs.get(i) + ")\n";
        }
        return result;
    }

    @Override
    public void registerObserver(Observer o) {
        observer = o;
    }

    @Override
    public void removeObserver(Observer o) {
        observer = null;
    }

    @Override
    public void notifyObservers() {
        observer.update(getOutput());
    }
}
