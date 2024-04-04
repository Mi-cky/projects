import javax.swing.*;

public class ShopIn extends JFrame{

    private JPanel panel;
    private JLabel load;

    ShopIn(){
        setContentPane(panel);
        setSize(getMaximumSize());
        setTitle("Welcome");
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon loader = new ImageIcon("C:\\Users\\hp\\IdeaProjects\\ShoppingApp\\src\\Images\\200.gif");
        load.setIcon(loader);
        for(int a=0;a<1000000;a++) {
            revalidate();
            repaint();
            System.out.println("cooked");
        }
//        JOptionPane.showMessageDialog(this, "delay");
        dispose();
String de = "ksdfjs";
        new Home(de);
    }
}
