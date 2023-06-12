import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Objects;

public class AddPlayer extends JFrame{
    private JComboBox gender;
    private JComboBox grade;
    private JTextField weight;
    private JComboBox school;
    private JButton registerButton;
    private JButton uploadExcelFileButton;
    private JButton backButton;
    private JPanel addPlayer;
    private JTextField playername;
    private SubFrame sub;

    public AddPlayer() {
        setContentPane(addPlayer);
        setTitle("Wrestling Management");
        setSize(450, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = playername.getText();
                String sch = String.valueOf(school.getSelectedItem());
                String gen = String.valueOf(gender.getSelectedItem());
                String grad = String.valueOf(grade.getSelectedItem());
                int wei = Integer.parseInt(weight.getText());
                System.out.println(name + sch + gen + grad + wei);
                setVisible(false);
                sub = new SubFrame();
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                sub = new SubFrame();
            }
        });
        uploadExcelFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser file_upload = new JFileChooser();

                int res = file_upload.showSaveDialog(null);
                if(res == JFileChooser.APPROVE_OPTION){
                    File file_path = new File(file_upload.getSelectedFile().getAbsolutePath());
                    System.out.println(file_path);
                }
            }
        });
    }
}
