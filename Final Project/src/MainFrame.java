import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {
    public int width = 400;
    public int height = 400;
    public static StudentInfo info;
    /** Method Name: MainFrame
     * @Author NAME: Jion Choi
     * @Modified: May 18th 2023
     * @Description: This is the first screen that pop-ups when user starts the application
     * @Parameters: N/A
     * @Returns: N/A
     * Dependencies: N/A
     * Throws/Exceptions: N/A
     */
    public MainFrame()
    {
        //Get a image(Broncos main image)
        ImageIcon image = new ImageIcon("banting.png");

        //Setting the background
        JLabel background = new JLabel(image);
        background.setBounds(0, 0, width, height);
        getLayeredPane().add(background, Integer.MAX_VALUE);

        //Organize content pane
        JPanel pane = new JPanel();
        pane.setSize(width,height);
        pane.setLayout(new BorderLayout());
        pane.add(background);
        pane.setOpaque(false);
        setContentPane( pane );

        //Add Labelled input fields to display
        JPanel inFieldPane = new JPanel();
        inFieldPane.setLayout(new GridLayout(2,1));
        inFieldPane.add(new JLabel("Welcome to Ball Bricks Game!"));
        pane.add(inFieldPane,BorderLayout.NORTH);

        //Add submission button
        JPanel submitPane = new JPanel();
        submitPane.setLayout(new FlowLayout());
        JButton submitButton = new JButton("Student information");
        JButton tuto = new JButton("Tournament");

        //This statement tells java to listen to the button
        submitButton.addActionListener(this);
        tuto.addActionListener(this);
        submitPane.add(submitButton);
        submitPane.add(tuto);
        pane.add(submitPane,BorderLayout.CENTER);

        //Display the final product
        pack();
        setVisible(true);
        //
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        info = new StudentInfo();
    }
}

