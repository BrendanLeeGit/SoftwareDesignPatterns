package MVC;

import java.io.IOException;

public class Controller implements ControllerInterface {
    Model model;
    public Controller(Model model){
        this.model = model;
    }

    @Override
    public void plot(String x1, String x2, String increment, String m, String b) {
        model.buildOutputArrayList(Double.parseDouble(x1), Double.parseDouble(x2), Double.parseDouble(increment), Double.parseDouble(m), Double.parseDouble(b));
    }

    @Override
    public void export() throws IOException {
        model.buildFile();
    }

    @Override
    public void clear(){
        model.resetArrayLists();
    }
}
