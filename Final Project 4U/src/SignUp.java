import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JFrame{
    private JTextField userName;
    private JPasswordField passWord;
    private JPasswordField confirmedPass;
    private JButton signUpButton;
    private JTextField firstName;
    private JTextField lastName;
    private JPanel SignUp;
    private JLabel incorrectPass;
    private JButton backButton;
    private MainFrame main;
    public SignUp(){
        setContentPane(SignUp);
        setTitle("Wrestling Management");
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        incorrectPass.setVisible(false);
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstname = firstName.getText();
                String lastname = lastName.getText();
                String username = userName.getText();
                String pass = String.valueOf(passWord.getPassword());
                String Cpass = String.valueOf(confirmedPass.getPassword());
                if(matches(pass, Cpass)){
                    main = new MainFrame();
                    setVisible(false);
                }
                else{
                    incorrectPass.setVisible(true);
                }
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                main = new MainFrame();
                setVisible(false);
            }
        });
    }
    public boolean matches(String pass, String Cpass){
        if(pass.equals(Cpass)){
            return true;
        }
        return false;
    }
}
