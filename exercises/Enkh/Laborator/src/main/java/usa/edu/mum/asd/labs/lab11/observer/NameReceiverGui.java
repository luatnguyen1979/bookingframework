package usa.edu.mum.asd.labs.lab11.observer;

import javax.swing.*;
import java.awt.*;

public class NameReceiverGui implements Observer {

    JTextArea textArea;

    public NameReceiverGui(Names names) {
        names.attach(this);
    }

    public void createAndShowGUI() {
        JFrame frame = new JFrame("NameReceiverGui");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea("Go");

        JPanel main = new JPanel();

        GridLayout gridLayoutMain = new GridLayout(1, 1);

        main.setLayout(gridLayoutMain);
        main.add(textArea);

        frame.getContentPane().add(main);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
        frame.setSize(new Dimension(300, 200));
    }

    @Override
    public void setNames(String names) {
        textArea.setText(names);
        System.out.println("Received:" + names);
    }
}
