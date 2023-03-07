package MVC;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View implements ActionListener {
    private JFrame f;
    private JButton clearB;
    private JButton exportB;
    private JButton plotB;
    private JTextArea textBox;

    public View() {
        f = new JFrame();//creating instance of JFrame
        clearB = new JButton("Clear");
        exportB = new JButton("Export");
        plotB = new JButton("Plot");
        textBox = new JTextArea();
    }

    public void run(){
        setBounds();
        addComponents();
        makeVisible();
    }

    private void setBounds(){
        clearB.setBounds(50,10,100, 40);
        exportB.setBounds(150,10,100, 40);
        plotB.setBounds(250,10,100, 40);
        textBox.setBounds(50, 100, 300, 300);
        f.setSize(400,500);
    }

    private void addComponents(){
        f.add(clearB);
        f.add(exportB);
        f.add(plotB);
        f.add(textBox);
    }

    private void makeVisible(){
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
