import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Home extends JFrame {
    private JPanel homepanel;
    private JLayeredPane layer;
    private JScrollPane hometab;
    private JScrollPane accTab;
    private JScrollPane helpTab;
    private JButton changeDetailsButton;
    private JButton homeButton;
    private JButton accountButton;
    private JLabel searchIcon;
    private JTextField searchField;
    private JPanel homePane;
    private JButton menuIcon;
    private JLabel fashion;
    private JLabel superma;
    private JLabel comp;
    private JLabel game;
    private JLabel baby;
    private JLabel title;
    private JButton jonny;
    private JButton shoe;
    private JButton jacketWhite;
    private JLabel jon;
    private JLabel blueShoe;
    private JButton ps3;
    private JScrollPane JonnyTab;
    private JPanel JonnyPane;
    private JLabel JonnyFullLabel;
    private JButton bear;
    private JLabel WhiteJacket;
    private JLabel bearBrown;
    private JButton watch;
    private JLabel watchLabel;
    private JLabel ps3Label;
    private JToggleButton menuTog;
    private JButton darling;
    private JButton fridge;
    private JLabel electric;
    private JButton chev;
    private JButton cartIcon;
    private JLabel enter;
    private JScrollPane fashionTab;
    private JPanel fashionPane;
    private JLabel fashionTitle;
    private JScrollPane marketTab;
    private JPanel marketPane;
    private JButton rice1;
    private JButton coffee1;
    private JButton milk1;
    private JButton battery1;
    private JButton pop1;
    private JButton watch1;
    private JButton braid1;
    private JButton loafer1;
    private JButton jacket1;
    private JButton bear1;
    private JPanel FashionPane;
    private JScrollPane gameTab;
    private JPanel gamePane;
    private JLabel gameTitle;
    private JLabel marketTitle;
    private JButton ps3control1;
    private JButton game1;
    private JButton nintendo1;
    private JButton bag;
    private JButton fifa1;
    private JButton rice;
    private JLabel darlingLabel;
    private JButton milk;
    private JLabel riceLabel;
    private JButton coffee;
    private JButton sweet;
    private JButton soda;
    private JButton tea;
    private JButton crisps;
    private JButton cocoa;
    private JScrollPane watchTab;
    private JPanel watchPane;
    private JButton watchF;
    private JScrollPane sweetTab;
    private JButton sweetF;
    private JScrollPane sodaTab;
    private JButton fanta;
    private JScrollPane ps3Tab;
    private JButton button2;
    private JLabel myInfo;
    private JLabel change;
    private JLabel out;
    private JLabel close;
    private JLabel check;
    private JLayeredPane infolayer;
    private JPanel updatedetails;
    private JPanel showinfo;
    private JPanel closeacc;
    private JLabel showname;
    private JLabel showemail;
    private JLabel showgender;
    private JLabel showphone;
    private JLabel accName;
    private JLabel accEmail;
    private JLabel accGender;
    private JLabel accPhone;
    private JLabel upEmail;
    private JLabel upphone;
    private JLabel upGender;
    private JPasswordField oldPassField;
    private JTextField emailField;
    private JTextField phoneField;
    private JRadioButton upMale;
    private JRadioButton upFemale;
    private JLabel newpass;
    private JLabel confpass;
    private JPasswordField newPassField;
    private JPanel changelogin;
    private JLabel pass;
    private JPasswordField logPassField;
    private JButton passbutton;
    private JButton updatebutton;
    private JButton cancelButton;
    private JToggleButton upPass;
    private JLabel oldPass;
    private JTextField oldPassFIeld;
    private JPasswordField confPassField;
    private JButton helpButton;
    private JScrollPane terms;
    private JLabel titleTerms;
    private JCheckBox iAgreeAndWillCheckBox;
    private JLabel instr;
    private JTextArea asYouAreGoingTextArea;
    private JPanel outLogin;
    private JPasswordField passwordField1;
    private JButton OKButton;
    private JButton CONTINUEButton;
    private JLabel instruct;
    private JScrollPane cartTab;
    private JButton addToCartButton;
    private JLabel cartic;
    private JPanel cartPane;
    private JLabel pop;
    private JButton watb;
    private JLabel wat1;
    private JLabel wat2;
    private JLabel wat3;
    private JLabel jonb;
    private JLabel jon1;
    private JLabel jon2;
    private JLabel jon3;
    private JButton padb;
    private JLabel pad1;
    private JLabel pad2;
    private JLabel pad3;
    private JButton joncart;
    private JButton padcart;
    private JLabel padpop;
    private JLabel jonpop;
    private JScrollPane searchTab;
    private JPanel searchPane;
    private JButton sb2;
    private JLabel sl2;
    private JButton sb1;
    private JLabel sl1;
    private JButton sb3;
    private JButton sb4;
    private JLabel sl4;
    private JButton sb5;
    private JButton sb6;
    private JLabel sl5;
    private JLabel sl6;
    private JLabel sl3;
    private JButton removeAllButton;
    private JButton watremove;
    private JButton jonremove;
    private JButton padremove;
    private JScrollPane login;
    private JPanel updateTab;
    private JButton picture1;
    private JPanel pic1tab;
    String user;

    Home(String se) {
        String str = check.getText();
        my_update(str);
    }
        public void my_update(String str) {

            setContentPane(homepanel);
            setTitle("Home");
            setSize(1760, 720);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);

            helpButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    layer.removeAll();
                    layer.add(helpTab);
                    layer.revalidate();
                    layer.repaint();
                }
            });

        removeAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                padpop.setText("Products removed successfully!!");
                padremove.setVisible(false);
                jonremove.setVisible(false);
                watremove.setVisible(false);

                padb.setVisible(false);
                pad1.setVisible(false);
                pad2.setVisible(false);
                pad3.setVisible(false);

                jonb.setVisible(false);
                jon1.setVisible(false);
                jon2.setVisible(false);
                jon3.setVisible(false);

                watb.setVisible(false);
                wat1.setVisible(false);
                wat2.setVisible(false);
                wat3.setVisible(false);
            }
        });
        watremove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                padpop.setText("Product removed successfully!!");
                watremove.setVisible(false);
                watb.setVisible(false);
                wat1.setVisible(false);
                wat2.setVisible(false);
                wat3.setVisible(false);
            }
        });
        jonremove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                padpop.setText("Product removed successfully!!");
                jonremove.setVisible(false);

                jonb.setVisible(false);
                jon1.setVisible(false);
                jon2.setVisible(false);
                jon3.setVisible(false);
            }
        });
        padremove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                padpop.setText("Product removed successfully!!");
                padremove.setVisible(false);

                padb.setVisible(false);
                pad1.setVisible(false);
                pad2.setVisible(false);
                pad3.setVisible(false);
            }
        });

        padcart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                padpop.setText("Product added successfully!!");
                padremove.setVisible(true);
                padb.setVisible(true);
                pad1.setVisible(true);
                pad2.setVisible(true);
                pad3.setVisible(true);
            }
        });

        joncart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jonpop.setText("Product added successfully!!");
                jonremove.setVisible(true);
                jonb.setVisible(true);
                jon1.setVisible(true);
                jon2.setVisible(true);
                jon3.setVisible(true);
            }
        });

        addToCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pop.setText("Product added successfully!!");
                watremove.setVisible(true);
                watb.setVisible(true);
                wat1.setVisible(true);
                wat2.setVisible(true);
                wat3.setVisible(true);
            }
        });

        searchIcon.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String geti = searchField.getText();
                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "@D3nnoz3");

                    Statement stat = connection.createStatement();

                    String query = "select *from search where name like '%"+geti+"%'";
//                    String query = "select * from search where name like '%'"+geti+"'%'";
//                    String query = "select * from search where name like '%'"+geti+"'%'";

                    ResultSet res = stat.executeQuery(query);
                    while(res.next()){
                        ImageIcon walk = new ImageIcon("C:\\Users\\hp\\IdeaProjects\\ShoppingApp\\src\\Images\\150\\supermarket\\drinks\\beer and drinls\\johnie walker whiskey 1 litre 1900.jpg");
                        ImageIcon pad = new ImageIcon("C:\\Users\\hp\\IdeaProjects\\ShoppingApp\\src\\Images\\150\\gaming\\play station\\playstation 3\\ps3150.jpg");

                            sb1.setIcon(walk);
                            sl1.setText(jon.getText());
                        sb2.setIcon(pad);
                        sl2.setText(ps3Label.getText());
//
                        layer.removeAll();
                        layer.add(searchTab);
                        layer.revalidate();
                        layer.repaint();
                    }
                }catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        CONTINUEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "@D3nnoz3");

                    String out = "delete from details where username='"+str+"'";

                    PreparedStatement prep = connection.prepareStatement(out);

                    int no = prep.executeUpdate();

                    if(no>0){
                        JOptionPane.showMessageDialog(CONTINUEButton, "Account deleted successfully");
                    }
                }catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });


        iAgreeAndWillCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(iAgreeAndWillCheckBox.isSelected()){
                    CONTINUEButton.setEnabled(true);
                }
                else{
                    CONTINUEButton.setEnabled(false);
                }
            }
        });




        close.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
//JLabel instruct=new JLabel("<html>i was just i met you i drink and that's an issue<br/>its nice </html>", SwingConstants.CENTER );
//homepanel.add(instruct);
                infolayer.removeAll();
                infolayer.add(terms);
                infolayer.revalidate();
                infolayer.repaint();
            }
        });


        upFemale.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                upMale.setSelected(false);
            }
        });

        upMale.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                upFemale.setSelected(false);
            }
        });

        upPass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(upPass.isSelected()){
                    oldPass.setText("Old Password");
                    newpass.setText("New Password");
                    confpass.setText("Confirm Password");
                    oldPassFIeld.setVisible(true);
                    newPassField.setVisible(true);
                    confPassField.setVisible(true);
                }
                else{
                    oldPass.setText("");
                    newpass.setText("");
                    confpass.setText("");
                    oldPassFIeld.setVisible(false);
                    newPassField.setVisible(false);
                    confPassField.setVisible(false);
                }
            }
        });

        updatebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//
                String gEmail = emailField.getText();
                String gPhone = phoneField.getText();
                String gPass = confPassField.getText();
                String old = oldPassField.getText();
                String gGender;
//
                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "@D3nnoz3");

                    if (upMale.isSelected()) {
                        gGender = "Male";
                        String upPass = "update details set gender='" + gGender + "' where username = '" + str + "' ";
                        PreparedStatement prep = connection.prepareStatement(upPass);
                        prep.executeUpdate();

                    } else if (upFemale.isSelected()) {
                        gGender = "Female";
                        String upPass = "update details set gender='" + gGender + "' where username = '" + str + "' ";
                        PreparedStatement prep = connection.prepareStatement(upPass);
                        prep.executeUpdate();
                    }

                        if(gPass.isEmpty()){
gPass=old;
                            String upPass = "update details set password='" + gPass + "', email='" + gEmail + "', phone='" + gPhone + "' where username = '" + str + "' ";
                            PreparedStatement prep = connection.prepareStatement(upPass);
                            prep.executeUpdate();
                        }
//                            String upPass = "update details set email='"+gEmail+"' where username=\"migwi\"";
//                            String upPhone = "update details set phone='"+gPhone+"' where username=\"migwi\"";
//                            String uppas = "update details set password='"+gPass+"' where username=\"migwi\"";
                    String upPass = "update details set password='" + gPass + "', email='" + gEmail + "', phone='" + gPhone + "' where username = '" + str + "' ";
                    PreparedStatement prep = connection.prepareStatement(upPass);
//                            PreparedStatement phonw = connection.prepareStatement(upPhone);
//                            PreparedStatement pass = connection.prepareStatement(uppas);
                    prep.executeUpdate();
//                            pass.executeUpdate();
//                            phonw.executeUpdate();
                    JOptionPane.showMessageDialog(updatebutton, "Ok");
//                }
//                        else{
//                            String upPass = "update details set password='" + gPass +"', email='"+gEmail+"', phone='"+gPhone+"', gender='"+gGender+"' where username = '" + str + "' ";
//                            String upPass = "update details set email=\"blabla\" where username=\"migwi\"";
//                            PreparedStatement prep = connection.prepareStatement(upPass);
//                            prep.executeUpdate();
//                            JOptionPane.showMessageDialog(updatebutton, "Ok");
//                        }
//                    }
//                    else{
//                        gGender="Female";
//                        if(gPass.isEmpty()){
//                            String upPass = "update details set password='" +gPass+"', email='"+gEmail+"', phone='"+gPhone+"', gender='"+gGender+"' where username = '" + str + "' ";
//                            String upPass = "update details set email=\"blabla\" where username=\"migwi\"";
//                            PreparedStatement prep = connection.prepareStatement(upPass);
//                            prep.executeUpdate();
//                            JOptionPane.showMessageDialog(updatebutton, "Ok");
//                        }
//                        else{
//                            String upPass = "update details set password='" + gPass +"', email='"+gEmail+"', phone='"+gPhone+"', gender='"+gGender+"' where username = '" + str + "' ";
//                            String upPass = "update details set email=\"blabla\" where username=\"migwi\"";
//                            PreparedStatement prep = connection.prepareStatement(upPass);
//                            prep.executeUpdate();
//                            JOptionPane.showMessageDialog(updatebutton, "Ok");
//                        }
//                    }

            }catch (Exception ex) {
                    ex.printStackTrace();
                }
//                JOptionPane.showMessageDialog(updatebutton, "jkadfjklsdjklfl");
            }
        });

        cancelButton.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent e) {
               try {
                   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "@D3nnoz3");

                   Statement statement = connection.createStatement();

                   String login = "select *from details where username = '" + str + "'";

                   ResultSet resultSet = statement.executeQuery(login);

                   while (resultSet.next()) {
                       String pEmail = resultSet.getString("email");
                       String pPhone = resultSet.getString("phone");
                       String pGender = resultSet.getString("gender");
                       String pPass = resultSet.getString("password");

                       if(pGender.equals("Male")){
                           upMale.setSelected(true);
                       }
                       else if(pGender.equals("Female")){
                           upFemale.setSelected(true);
                       }
                       emailField.setText(pEmail);
                       phoneField.setText(pPhone);
                       oldPassField.setText(pPass);

                       infolayer.removeAll();
                       infolayer.add(updatedetails);
                       infolayer.revalidate();
                       infolayer.repaint();
                   }

               } catch (Exception ex) {
                   ex.printStackTrace();
               }

           }
       });

            passbutton.addActionListener(new

            ActionListener() {

                @Override
                public void actionPerformed (ActionEvent e){
                    String password = logPassField.getText();
                    try {
                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "@D3nnoz3");

                        Statement statement = connection.createStatement();

                        String login = "select *from details where username = '" + str + "'and password = '" + password + "'";

                        ResultSet resultSet = statement.executeQuery(login);

                        while (resultSet.next()) {
                            String pEmail = resultSet.getString("email");
                            String pPhone = resultSet.getString("phone");
//                            String ps = resultSet.getString("password");
                            String pGender = resultSet.getString("gender");

                            if(pGender.equals("Male")){
                                upMale.setSelected(true);
                            }
                            else if(pGender.equals("Female")){
                                upFemale.setSelected(true);
                            }
                            emailField.setText(pEmail);
                            phoneField.setText(pPhone);
//                            oldPassField.setText(ps);

                            infolayer.removeAll();
                            infolayer.add(updatedetails);
                            infolayer.revalidate();
                            infolayer.repaint();
                        }

                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });

            check.setText(str);

            change.addMouseListener(new

            MouseAdapter() {
                @Override
                public void mouseClicked (MouseEvent e){
                    super.mouseClicked(e);

                    logPassField.setText("");
                    infolayer.removeAll();
                    infolayer.add(changelogin);
                    infolayer.revalidate();
                    infolayer.repaint();
                }
            });

            homeButton.addActionListener(new

            ActionListener() {
                @Override
                public void actionPerformed (ActionEvent e){
                    padpop.setText("");
                    pop.setText("");
                    jonpop.setText("");
                    layer.removeAll();
                    layer.add(hometab);
                    layer.repaint();
                    layer.revalidate();
                }
            });

            jonny.addActionListener(new

            ActionListener() {
                @Override
                public void actionPerformed (ActionEvent e){
                    layer.removeAll();
                    layer.add(JonnyTab);
                    layer.revalidate();
                    layer.repaint();
                }
            });
            menuTog.addActionListener(new

            ActionListener() {
                @Override
                public void actionPerformed (ActionEvent e){
                    if (menuTog.isSelected()) {
                        fashion.setText("Fashion");
                        comp.setText("Computing");
                        game.setText("Gaming");
                        superma.setText("Supermarket");
                        baby.setText("Baby Products");
                    } else {
                        fashion.setText("");
                        comp.setText("");
                        game.setText("");
                        superma.setText("");
                        baby.setText("");
                    }
                }
            });

            cartIcon.addActionListener(new

            ActionListener() {
                @Override
                public void actionPerformed (ActionEvent e){
                    layer.removeAll();
                    layer.add(cartTab);
                    layer.revalidate();
                    layer.repaint();
                }
            });

            homePane.addMouseListener(new

            MouseAdapter() {
                @Override
                public void mouseClicked (MouseEvent e){
                    super.mouseClicked(e);
                    if (searchField.getText().isEmpty()) {
                        enter.setText("Enter your search");
                    } else {
                        enter.setText("");
                        homepanel.repaint();
                    }
                }
            });
            fashion.addMouseListener(new

            MouseAdapter() {
                @Override
                public void mouseClicked (MouseEvent e){
                    super.mouseClicked(e);
                    layer.removeAll();
                    layer.add(fashionTab);
                    layer.revalidate();
                    layer.repaint();
                }
            });
            superma.addMouseListener(new

            MouseAdapter() {
                @Override
                public void mouseClicked (MouseEvent e){
                    super.mouseClicked(e);
                    layer.removeAll();
                    layer.add(marketTab);
                    layer.revalidate();
                    layer.repaint();
                }
            });
            game.addMouseListener(new

            MouseAdapter() {
                @Override
                public void mouseClicked (MouseEvent e){
                    super.mouseClicked(e);
                    layer.removeAll();
                    layer.add(gameTab);
                    layer.revalidate();
                    layer.repaint();
                }
            });
            watch.addActionListener(new

            ActionListener() {
                @Override
                public void actionPerformed (ActionEvent e){
                    layer.removeAll();
                    layer.add(watchTab);
                    layer.revalidate();
                    layer.repaint();
                }
            });
            sweet.addActionListener(new

            ActionListener() {
                @Override
                public void actionPerformed (ActionEvent e){
                    layer.removeAll();
                    layer.add(sweetTab);
                    layer.revalidate();
                    layer.repaint();
                }
            });
            soda.addActionListener(new

            ActionListener() {
                @Override
                public void actionPerformed (ActionEvent e){
                    layer.removeAll();
                    layer.add(sodaTab);
                    layer.revalidate();
                    layer.repaint();
                }
            });
            ps3.addActionListener(new

            ActionListener() {
                @Override
                public void actionPerformed (ActionEvent e){
                    layer.removeAll();
                    layer.add(ps3Tab);
                    layer.revalidate();
                    layer.repaint();
                }
            });
            ps3control1.addActionListener(new

            ActionListener() {
                @Override
                public void actionPerformed (ActionEvent e){
                    layer.removeAll();
                    layer.add(ps3Tab);
                    layer.revalidate();
                    layer.repaint();
                }
            });
            accountButton.addActionListener(new

            ActionListener() {
                @Override
                public void actionPerformed (ActionEvent e){
                    layer.removeAll();
                    layer.add(accTab);
                    layer.revalidate();
                    layer.repaint();
                }
            });

            myInfo.addMouseListener(new

            MouseAdapter() {
                @Override
                public void mouseClicked (MouseEvent e){
                    super.mouseClicked(e);

                    try {
                        //  JOptionPane.showMessageDialog(submitButton, "proceed");
                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "@D3nnoz3");

                        Statement statement = connection.createStatement();

//                String login = "select *from details where username = \"emilio\"";
                        String login = "select *from details where username = '" + str + "'";

                        ResultSet resultSet = statement.executeQuery(login);
                        while (resultSet.next()) {
                            String name = resultSet.getString("username");
                            String gender = resultSet.getString("gender");
                            String phone = resultSet.getString("phone");
                            String email = resultSet.getString("email");
                            //  System.out.println(name+gender+email+phone);
                            accName.setText(name);
                            accEmail.setText(email);
                            accGender.setText(gender);
                            accPhone.setText(phone);

                            showname.setText("Username");
                            showemail.setText("Email");
                            showgender.setText("Gender");
                            showphone.setText("Phone number");


                            infolayer.removeAll();
                            infolayer.add(showinfo);
                            infolayer.revalidate();
                            infolayer.repaint();
                        }

                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }

                }
            });
        }

   }
