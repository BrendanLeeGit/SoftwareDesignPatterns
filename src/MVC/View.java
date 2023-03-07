package MVC;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class View implements ActionListener, Observer {
    private ControllerInterface controller;
    private Model model;

    private JFrame f;
    private JButton clearB;
    private JButton exportB;
    private JButton plotB;
    private JTextArea textBox;
    private JLabel x1Label, x2Label, incrementLabel, mLabel, bLabel;
    private JTextField x1, x2, increment, m, b;

    public View(ControllerInterface controller, Model model) {
        f = new JFrame();//creating instance of JFrame
        clearB = new JButton("Clear");
        exportB = new JButton("Export");
        plotB = new JButton("Plot");
        textBox = new JTextArea("(Inputs, Output):");
        x1 = new JTextField("",1);
        x2 = new JTextField("",1);
        increment = new JTextField("",1);
        m = new JTextField("",1);
        b = new JTextField("",1);
        x1Label = new JLabel("x1");
        x2Label = new JLabel("x2");
        incrementLabel = new JLabel("increment");
        mLabel = new JLabel("m");
        bLabel = new JLabel("b");

        this.controller = controller;
        this.model = model;
    }

    public void updateTextArea(){
        textBox.setText(model.getOutput());
    }

    public void run(){
        setBounds();
        addComponents();
        makeVisible();
        addListeners();
        addLineWrap();
    }

    private void addLineWrap(){
        textBox.setLineWrap(true);
        textBox.setWrapStyleWord(true);
    }

    private void addListeners(){
        clearB.addActionListener(this);
        exportB.addActionListener(this);
        plotB.addActionListener(this);
    }

    private void setBounds(){
        clearB.setBounds(50,10,100, 40);
        exportB.setBounds(150,10,100, 40);
        plotB.setBounds(250,10,100, 40);
        textBox.setBounds(50, 100, 300, 300);

        x1.setBounds(50,60,30,20);
        x2.setBounds(80,60,30,20);
        increment.setBounds(110,60,30,20);
        m.setBounds(140,60,30,20);
        b.setBounds(170,60,30,20);

        x1Label.setBounds(50,80,30,20);
        x2Label.setBounds(80,80,30,20);
        incrementLabel.setBounds(110,80,30,20);
        mLabel.setBounds(140,80,30,20);
        bLabel.setBounds(170,80,30,20);

        f.setSize(400,500);
    }

    private void addComponents(){
        f.add(clearB);
        f.add(exportB);
        f.add(plotB);
        f.add(textBox);

        f.add(x1);
        f.add(x2);
        f.add(increment);
        f.add(m);
        f.add(b);

        f.add(x1Label);
        f.add(x2Label);
        f.add(incrementLabel);
        f.add(mLabel);
        f.add(bLabel);
    }

    private void makeVisible(){
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == clearB) {
            controller.clear();
        } else if(event.getSource() == plotB){
            controller.plot(x1.getText(), x2.getText(), increment.getText(), m.getText(), b.getText());
        } else if(event.getSource() == exportB){
            try {
                controller.export();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void update(String text) {
        textBox.setText(model.getOutput());
    }
}
