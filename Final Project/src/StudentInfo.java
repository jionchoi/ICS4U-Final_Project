import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentInfo extends JFrame implements ActionListener {
    public MainFrame mainFrame;
    public addPlayer addPlayer;
    public searchPlayer searchPlayer;
    public StudentInfo(){
        super("Student Information");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel pane = new JPanel();
        pane.setSize(400,400);
        pane.setLayout(new BorderLayout());
        pane.setOpaque(false);
        setContentPane(pane);

        //Add Labelled input fields to display
        JPanel inFieldPane = new JPanel();
        inFieldPane.setLayout(new FlowLayout());
        inFieldPane.add(new JLabel("Welcome to Ball Bricks Game!"));
        pane.add(inFieldPane,BorderLayout.NORTH);

        //Add submission button
        JPanel submitPane = new JPanel();
        submitPane.setLayout(new FlowLayout());
        JButton submitButton = new JButton("Add Student");
        JButton tuto = new JButton("Search Student");
        JButton back = new JButton("Back");

        //This statement tells java to listen to the button
        submitButton.addActionListener(this);
        tuto.addActionListener(this);
        submitPane.add(submitButton);
        submitPane.add(tuto);
        submitPane.add(back);
        pane.add(submitPane,BorderLayout.CENTER);

        //Display the final product
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Add student")){
            addPlayer = new addPlayer();
            this.setVisible(false);
        }
        else if(e.getActionCommand().equals("Search Student")){
            searchPlayer = new searchPlayer();
            this.setVisible(false);
        }
        else if(e.getActionCommand().equals("Back")){
            mainFrame = new MainFrame();
            this.setVisible(false);
        }
    }
}
