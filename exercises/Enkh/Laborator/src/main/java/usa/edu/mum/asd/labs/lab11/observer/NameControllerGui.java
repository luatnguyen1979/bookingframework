package usa.edu.mum.asd.labs.lab11.observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NameControllerGui {

    public Names names = new Names();
    private JTextField jTextField1 = new JTextField(100);
    private JButton btnAdd = new JButton("Add");
    private JButton btnRemove = new JButton("Remove");

    public void createAndShowGUI() {
        JFrame frame = new JFrame("NameControllerGui");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel main = new JPanel();
        JPanel top = new JPanel();
        JPanel bottom = new JPanel();

        GridLayout gridLayoutMain = new GridLayout(2, 1);
        GridLayout gridLayoutTop = new GridLayout(1, 1);
        GridLayout gridLayoutBottom = new GridLayout(1, 2);

        top.setLayout(gridLayoutTop);
        top.add(jTextField1);

        bottom.setLayout(gridLayoutBottom);
        bottom.add(btnAdd);
        bottom.add(btnRemove);

        main.setLayout(gridLayoutMain);
        main.add(top);
        main.add(bottom);

        frame.getContentPane().add(main);

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                names.addName(jTextField1.getText());
                jTextField1.setText("");
            }
        });
        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                names.removeName(jTextField1.getText());
                jTextField1.setText("");
            }
        });

        //Display the window.
        frame.pack();
        frame.setVisible(true);
        frame.setSize(new Dimension(450, 300));
        frame.setLocation(550, 10);
    }

    public static void main(String[] args) {
        try {
            NameControllerGui nameControllerGui = new NameControllerGui();
            nameControllerGui.createAndShowGUI();
            NameReceiverGui nameReceiverGui = new NameReceiverGui(nameControllerGui.names);
            nameReceiverGui.createAndShowGUI();
            NameReceiverGui nameReceiverGui1 = new NameReceiverGui(nameControllerGui.names);
            nameReceiverGui1.createAndShowGUI();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
