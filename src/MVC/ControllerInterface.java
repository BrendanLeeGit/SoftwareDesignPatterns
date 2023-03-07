package MVC;

import java.io.IOException;

public interface ControllerInterface {
    public void plot(String x1, String x2, String increment, String m, String b);
    public void export() throws IOException;
    public void clear();

}
