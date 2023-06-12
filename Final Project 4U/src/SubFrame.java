import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubFrame extends JFrame{
    private JPanel SubPane;
    private JButton searchPlayerButton;
    private JButton viewMatchesButton;
    private JButton addPlayerButton;
    private AddPlayer addP;
    private SearchPlayer searchP;
    private ViewMatches viewM;
    public SubFrame(){
        setContentPane(SubPane);
        setTitle("Wrestling Management");
        setSize(680, 545);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        addPlayerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                addP = new AddPlayer();
            }
        });
        searchPlayerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        viewMatchesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
