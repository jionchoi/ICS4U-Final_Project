import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private JPanel mainPane;
    private JTextField inputuser;
    private JPasswordField inputpass;
    private JButton loginButton;
    private JLabel wrongtxt;
    private JButton signUpButton;
    private SubFrame subF;
    private SignUp signUP;

    public MainFrame(){
        setContentPane(mainPane);
        setTitle("Wrestling Management");
        setSize(400, 450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        wrongtxt.setVisible(false);
        setVisible(true);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username =  inputuser.getText();
                String password = String.valueOf(inputpass.getPassword());
                System.out.println("Username: " + username + " Password: " + password);
                if(matches(username, password)){
                    setVisible(false);
                    SubFrame subF = new SubFrame();
                }
                else{
                    wrongtxt.setVisible(true);
                }
            }
        });
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                signUP = new SignUp();
                setVisible(false);
            }
        });
    }
    public boolean matches(String username, String password){

        return true;
    }
    public static void main(String[] args){
        MainFrame frame = new MainFrame();
    }

}
