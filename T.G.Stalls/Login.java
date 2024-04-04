import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Login extends JFrame{
    //JFrame Components
    private JLabel username;
    private JTextField textField1;
    private JLabel password;
    private JPasswordField passwordField1;
    private JLabel reenterpassword;
    private JPasswordField passwordField2;
    private JButton regPassowrd;
    public JPanel regPanel;
    private JLabel regCompany;
    private JLabel confpassError;
    private JLabel passError;
    private JLabel userError;
    private JLabel email;
    private JTextField emailfield;
    private JLabel number;
    private JTextField phonefield;
    private JLabel erroremail;
    private JLabel errorphone;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JLabel gender;
    private JToggleButton showPass;

    public  Login(){
        //Creating a Window
    setContentPane(regPanel);
    setTitle("register");
    setBounds(100,100,550,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

    //Register Button
        regPassowrd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = textField1.getText();
                String pass = passwordField1.getText();
                String confaPass = passwordField2.getText();
                String email = emailfield.getText();
                String phone = phonefield.getText();
                String gender;
                String req = "This field is required!!!";

                //Field Logic and Regulations
                if((user.isEmpty() || passwordField1.getPassword().length == 0 )|| passwordField2.getPassword().length == 0||email.isEmpty()||phone.isEmpty()){
                    if((user.isEmpty() && passwordField1.getPassword().length != 0 )&& passwordField2.getPassword().length != 0 && email.length()!= 0&& phone.length()!=0){
                        userError.setText(req);
                        passError.setText("");
                        confpassError.setText("");
                        erroremail.setText("");
                        errorphone.setText("");
                    }
                    else if((passwordField1.getPassword().length == 0 && user.length() != 0 ) && passwordField2.getPassword().length != 0  && email.length()!= 0&& phone.length()!=0){
                        userError.setText("");
                        passError.setText(req);
                        confpassError.setText("");
                        erroremail.setText("");
                        errorphone.setText("");
                    }
                    else if(user.length() != 0  && passwordField1.getPassword().length !=0 && passwordField2.getPassword().length == 0 && email.length()!= 0&& phone.length()!=0){
                        userError.setText("");
                        passError.setText("");
                        confpassError.setText(req);
                        erroremail.setText("");
                        errorphone.setText("");
                    }
                    else if(user.length() !=0  && passwordField1.getPassword().length !=0 && passwordField2.getPassword().length != 0 && email.isEmpty()&& phone.length()!=0){
                        userError.setText("");
                        passError.setText("");
                        confpassError.setText("");
                        erroremail.setText(req);
                        errorphone.setText("");
                    }
                    else if(user.length() !=0  && passwordField1.getPassword().length !=0 && passwordField2.getPassword().length != 0 && email.length()!=0&& phone.isEmpty()){
                        userError.setText("");
                        passError.setText("");
                        confpassError.setText("");
                        erroremail.setText("");
                        errorphone.setText(req);
                    }
                    else if(user.isEmpty() && passwordField1.getPassword().length == 0 && passwordField2.getPassword().length !=0&& email.length()!=0&& phone.length()!=0){
                        userError.setText(req);
                        erroremail.setText("");
                        errorphone.setText("");
                        passError.setText(req);
                        confpassError.setText("");
                    }
                    else if(user.length() == 0 && passwordField1.getPassword().length != 0 && passwordField2.getPassword().length == 0 && email.length()!=0&& phone.length()!=0){
                        userError.setText(req);
                        erroremail.setText("");
                        errorphone.setText("");
                        passError.setText("");
                        confpassError.setText(req);
                    }
                    else if(user.length() !=0 && passwordField1.getPassword().length == 0 && passwordField2.getPassword().length ==0&& email.length()!=0&& phone.length()!=0){
                        userError.setText("");
                        passError.setText(req);
                        confpassError.setText(req);
                        erroremail.setText("");
                        errorphone.setText("");
                    }
                    else if(user.isEmpty()&& passwordField1.getPassword().length != 0 && passwordField2.getPassword().length !=0&& email.isEmpty()&& phone.length()!=0){
                        userError.setText(req);
                        passError.setText("");
                        confpassError.setText("");
                        erroremail.setText(req);
                        errorphone.setText("");
                    }
                    else if(user.isEmpty()&& passwordField1.getPassword().length != 0 && passwordField2.getPassword().length !=0&& email.length()!=0&& phone.isEmpty()){
                        userError.setText(req);
                        passError.setText("");
                        confpassError.setText("");
                        erroremail.setText("");
                        errorphone.setText(req);
                    }
                    else if(user.length()!=0&& passwordField1.getPassword().length == 0 && passwordField2.getPassword().length !=0&& email.length()==0&& phone.length()!=0){
                        userError.setText("");
                        passError.setText(req);
                        confpassError.setText("");
                        erroremail.setText(req);
                        errorphone.setText("");
                    }
                    else if(user.length()!=0&& passwordField1.getPassword().length == 0 && passwordField2.getPassword().length !=0&& email.length()!=0&& phone.isEmpty()){
                        userError.setText("");
                        passError.setText(req);
                        confpassError.setText("");
                        erroremail.setText("");
                        errorphone.setText(req);
                    }
                    else if(user.length()!=0&& passwordField1.getPassword().length != 0 && passwordField2.getPassword().length ==0&& email.isEmpty()&& phone.length()!=0){
                        userError.setText("");
                        passError.setText("");
                        confpassError.setText(req);
                        erroremail.setText(req);
                        errorphone.setText("");
                    }
                    else if(user.length()!=0&& passwordField1.getPassword().length != 0 && passwordField2.getPassword().length ==0&& email.length() !=0&& phone.length()==0){
                        userError.setText("");
                        passError.setText("");
                        confpassError.setText(req);
                        erroremail.setText("");
                        errorphone.setText(req);
                    }
                    else if(user.length()!=0&& passwordField1.getPassword().length != 0 && passwordField2.getPassword().length !=0&& email.isEmpty()&& phone.length()==0){
                        userError.setText("");
                        passError.setText("");
                        confpassError.setText("");
                        erroremail.setText(req);
                        errorphone.setText(req);
                    }
                    else if(passwordField1.getPassword().length == 0 && user.length() == 0 && passwordField2.getPassword().length == 0 && email.length() !=0&& phone.length()!=0) {
                        userError.setText(req);
                        erroremail.setText("");
                        errorphone.setText("");
                        passError.setText(req);
                        confpassError.setText(req);

                    }
                    else if((passwordField1.getPassword().length == 0 && user.length() == 0) && passwordField2.getPassword().length != 0&& email.isEmpty()&& phone.length()!=0) {
                        userError.setText(req);
                        erroremail.setText(req);
                        errorphone.setText("");
                        passError.setText(req);
                        confpassError.setText("");

                    }
                    else if((passwordField1.getPassword().length == 0 && user.length() == 0) && passwordField2.getPassword().length != 0 && email.length()!=0&& phone.isEmpty()) {
                        userError.setText(req);
                        erroremail.setText("");
                        errorphone.setText(req);
                        passError.setText(req);
                        confpassError.setText("");

                    }
                    else if((passwordField1.getPassword().length != 0 && user.length() == 0) && passwordField2.getPassword().length == 0&& email.isEmpty()&& phone.length()!=0) {
                        userError.setText(req);
                        erroremail.setText(req);
                        errorphone.setText("");
                        passError.setText("");
                        confpassError.setText(req);

                    }
                    else if((passwordField1.getPassword().length != 0 && user.length() == 0) && passwordField2.getPassword().length == 0&& email.length()!=0&& phone.isEmpty()) {
                        userError.setText(req);
                        erroremail.setText("");
                        errorphone.setText(req);
                        passError.setText("");
                        confpassError.setText(req);

                    }
                    else if((passwordField1.getPassword().length != 0 && user.length() == 0) && passwordField2.getPassword().length != 0&& email.length()==0&& phone.length()==0) {
                        userError.setText(req);
                        erroremail.setText(req);
                        errorphone.setText(req);
                        passError.setText("");
                        confpassError.setText("");

                    }
                    else if((passwordField1.getPassword().length == 0 && user.length() != 0) && passwordField2.getPassword().length == 0&& email.length()==0&& phone.length()!=0 ){
                        userError.setText("");
                        passError.setText(req);
                        confpassError.setText(req);
                        erroremail.setText(req);
                        errorphone.setText("");

                    }
                    else if((passwordField1.getPassword().length == 0 && user.length() != 0) && passwordField2.getPassword().length == 0&& email.length()!=0&& phone.isEmpty()) {
                        userError.setText("");
                        passError.setText(req);
                        confpassError.setText(req);
                        erroremail.setText("");
                        errorphone.setText(req);

                    }
                    else if((passwordField1.getPassword().length == 0 && user.length() != 0) && passwordField2.getPassword().length != 0&& email.length()==0&& phone.isEmpty()) {
                        userError.setText("");
                        passError.setText(req);
                        confpassError.setText("");
                        erroremail.setText(req);
                        errorphone.setText(req);

                    }
                    else if((passwordField1.getPassword().length != 0 && user.length() != 0) && passwordField2.getPassword().length == 0&& email.length()==0&& phone.isEmpty()) {
                        userError.setText("");
                        passError.setText("");
                        confpassError.setText(req);
                        erroremail.setText(req);
                        errorphone.setText(req);

                    }

                    else if((passwordField1.getPassword().length == 0 && user.length() == 0) && passwordField2.getPassword().length == 0 && email.isEmpty()&& phone.length()!=0) {
                        userError.setText(req);
                        passError.setText(req);
                        confpassError.setText(req);
                        erroremail.setText(req);
                        errorphone.setText("");

                    }
                    //ppp
                    else if((passwordField1.getPassword().length == 0 && user.length() == 0) && passwordField2.getPassword().length == 0 && email.length()!=0&& phone.isEmpty()) {
                        userError.setText(req);
                        passError.setText(req);
                        confpassError.setText(req);
                        erroremail.setText("");
                        errorphone.setText(req);

                    }
                    //ppp
                    else if((passwordField1.getPassword().length == 0 && user.length() == 0) && passwordField2.getPassword().length != 0&& email.isEmpty()&& phone.isEmpty()) {
                        userError.setText(req);
                        passError.setText(req);
                        confpassError.setText("");
                        erroremail.setText(req);
                        errorphone.setText(req);

                    }

                    else if(passwordField1.getPassword().length != 0 && user.isEmpty() && passwordField2.getPassword().length == 0&& email.isEmpty()&& phone.isEmpty()) {
                        userError.setText(req);
                        erroremail.setText(req);
                        errorphone.setText(req);
                        passError.setText("");
                        confpassError.setText(req);

                    }

                    else if(passwordField1.getPassword().length == 0 && user.length() != 0 && passwordField2.getPassword().length == 0&& email.isEmpty()&& phone.isEmpty()) {
                        userError.setText("");
                        erroremail.setText(req);
                        errorphone.setText(req);
                        passError.setText(req);
                        confpassError.setText(req);

                    }
                    //ppp
                    else if((passwordField1.getPassword().length == 0 && user.isEmpty()) && passwordField2.getPassword().length == 0&& email.isEmpty()&& phone.isEmpty()) {
                        userError.setText(req);
                        erroremail.setText(req);
                        errorphone.setText(req);
                        passError.setText(req);
                        confpassError.setText(req);

                    }

                }

                else {
                    //Password matching
                    if(pass.equals(confaPass)){
                        //Connecting to the Database
                        try{
                            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "@D3nnoz3");

                            String register = "insert into details values (?,?,?,?,?)";
                            PreparedStatement prep = connection.prepareStatement(register);

                            prep.setString(1, user);
                            prep.setString(2, confaPass);
                            prep.setString(3, email);
                            prep.setString(4, phone);
                            //Gender radioButton toggling
                            if(maleRadioButton.isSelected()){
                                gender = "Male";
                                prep.setString(5, gender);
                            }
                            else if(femaleRadioButton.isSelected()){
                                gender = "Female";
                                prep.setString(5, gender);
                            }

                            int reg = prep.executeUpdate();

                            if(reg>0) {
                                JOptionPane.showMessageDialog(regPassowrd, "Registration successful");
                                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "@D3nnoz3");

                                Statement sta = con.createStatement();
                                ResultSet res = sta.executeQuery("select *from details where username='"+user+"'");
                                while (res.next()){
                                    String ge = res.getString("username");
                                    new Home(ge);
                                }

                                //Setting fields to Null
                                textField1.setText("");
                                passwordField1.setText("");
                                passwordField2.setText("");
                                emailfield.setText("");
                                phonefield.setText("");
                                maleRadioButton.setSelected(false);
                                femaleRadioButton.setSelected(false);
                                confpassError.setText("");
                                passError.setText("");
                                userError.setText("");
                                errorphone.setText("");
                                erroremail.setText("");
                            }
                            else {
                                JOptionPane.showMessageDialog(regPassowrd, "Registration Failed!!!", "Error", JOptionPane.OK_CANCEL_OPTION);
                            }
                        }
                        catch (Exception exception){
                            exception.printStackTrace();
                        }
                    }
                    else {
                        confpassError.setText("Password Mismatch!!!");
                    }
                    }
            }
        });

        //Toggle password
        showPass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon close = new ImageIcon("src\\images\\close39.png");
                ImageIcon open = new ImageIcon("src\\images\\open39.png");

                Color back = new Color(249,153,28);
                if(showPass.isSelected()){
                    passwordField2.setEchoChar((char) 0);
                    passwordField1.setEchoChar((char) 0);
                    showPass.setIcon(open);
                    showPass.setBackground(back);
                    showPass.setBorderPainted(false);
                }
                else {
                    passwordField2.setEchoChar('\u2022');
                    passwordField1.setEchoChar('\u2022');
                    showPass.setIcon(close);
                    showPass.setBackground(back);
                    showPass.setBorderPainted(false);

                }
            }
        });

        //Male RadioButton
        maleRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(maleRadioButton.isSelected()){
                    maleRadioButton.setSelected(true);
                    femaleRadioButton.setSelected(false);
                }
            }
        });

        //Female RadioButton
        femaleRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(femaleRadioButton.isSelected()){
                    maleRadioButton.setSelected(false);
                    femaleRadioButton.setSelected(true);
                }
            }
        });
    }

    //Main method
    public static void main(String[] args) {
        Login log = new Login();
    }
}
