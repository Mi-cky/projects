import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShopMain extends JFrame{
    private JLabel label;
    private JLabel username;
    private JTextField textFieldUser;
    private JLabel password;
    private JButton submitButton;
    private JPanel panel;
    private JPasswordField passwordField1;
    private JButton createAccount;
    private JLabel userError;
    private JLabel passError;
    private JLabel dont;
    private JLabel userIcon;
    private JLabel passIcon;
    private JToggleButton showPass;
    private JLabel dataLoad;

    public ShopMain() {

        setContentPane(panel);
        setTitle("Shopping");
        setBounds(100, 100, 550, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Submit Button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String user = textFieldUser.getText();

                if (user.isEmpty() || passwordField1.getPassword().length == 0) {
                    if (user.isEmpty() && passwordField1.getPassword().length != 0) {
                        userError.setText("This field is required!!!");
                        passError.setText("");
                    } else if (passwordField1.getPassword().length == 0 && user.length() != 0) {
                        passError.setText("This field is required!!!");
                        userError.setText("");
                    } else if (passwordField1.getPassword().length == 0 && user.length() == 0) {
                        userError.setText("This field is required!!!");
                        passError.setText("This field is required!!!");
                    }
                } else {

                    try {
                      //  JOptionPane.showMessageDialog(submitButton, "proceed");
                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "@D3nnoz3");

                            Statement statement = connection.createStatement();

                            String name = textFieldUser.getText();
                            String pass = passwordField1.getText();

                            String login = "select *from details where username = '" + name + "' and password='" + pass + "'";

                            ResultSet resultSet = statement.executeQuery(login);

                            if (resultSet.next()) {
                                if (resultSet.getString("password").equals(pass)) {

                                    String dw="aksdjflsd";

                                    Home hom = new Home(dw);
                                    hom.my_update(name);

                                    hom.setVisible(true);
                                    //      dispose();
                                    dispose();
                                 //   new Home();
                                } else {
                                    passError.setText("Incorrect Credentials!!!");
                                }
                                connection.close();
                            } else {
                                JOptionPane.showMessageDialog(submitButton, "Couldn't Log in", "Error", JOptionPane.ERROR_MESSAGE);
                            }



                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }

        });

        //Create Account
        createAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
                new Login();
            }
        });

//        //Password Toggling
        showPass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (showPass.isSelected()) {
                    passwordField1.setEchoChar((char) 0);
                    showPass.setText("HIDE");
                } else {
                    passwordField1.setEchoChar('\u2022');
                    showPass.setText("SHOW");
                }
            }
        });
    }


//    /*Main method
//    Program execution*/

    public static void main(String[] args) throws Exception{
        ShopMain shopper = new ShopMain();
    }
}

