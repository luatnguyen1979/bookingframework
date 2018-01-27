package usa.edu.mum.asd.labs.lab11.observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NameControllerGui {

    public Names names = new Names();

    public void createAndShowGUI() {
        JFrame frame = new JFrame("NameControllerGui");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField jTextField = new JTextField();
        JButton btnAdd = new JButton("Add");
        JButton btnRemove = new JButton("Remove");

        JPanel main = new JPanel();
        JPanel top = new JPanel();
        JPanel bottom = new JPanel();

        GridLayout gridLayoutMain = new GridLayout(2, 1);
        GridLayout gridLayoutTop = new GridLayout(1, 1);
        GridLayout gridLayoutBottom = new GridLayout(1, 2);

        top.setLayout(gridLayoutTop);
        top.add(jTextField);

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
                names.addName(jTextField.getText());
                jTextField.setText("");
                System.out.println(names.size());
            }
        });
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                names.removeName(jTextField.getText());
                jTextField.setText("");
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
