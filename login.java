import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class login extends JFrame implements ActionListener {
    JLabel userLabel, passLabel, imagelabel;
    static JTextField textField1;
    String se,sp;

    static JPasswordField textField2;
    JButton b1, b2;
    JPanel  panel1,panel2;

    login() {

        this.setSize(1250, 1250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.setLayout(null);
       // this.setResizable(false);
        this.setVisible(true);


        ImageIcon img = new ImageIcon("th (2).jpg");


        JLabel label = new JLabel();
        ///login field
        label.setIcon(img);
        label.setText(" I-T-C CENTRE ");
        label.setFont(new Font("MV Boli", Font.BOLD, 40));
        label.setBounds(200, 100, 500, 500);

        JLabel llb = new JLabel("WELCOME");
        llb.setFont(new Font("MV Boli",Font.BOLD,60));
        llb.setBounds(770,10,500,500);


        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setForeground(Color.white);
        label.setIconTextGap(25);
        label.setBackground(Color.BLACK);

        panel1 = new JPanel();
        panel1.setBackground(Color.gray);
        panel1.setLayout(null);
        panel1.add(llb);
        panel1.add(label);
        panel1.setBounds(0,0,1500,1500);

//        imagelabel = new JLabel();
//        imagelabel.setBounds(800, 20, 250, 250);


        userLabel = new JLabel();
        userLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
        userLabel.setText("Username");
        userLabel.setForeground(Color.white);
        userLabel.setBounds(770, 340, 300, 40);
        textField1 = new JTextField(15);
        textField1.setBounds(770, 380, 300, 30);


        passLabel = new JLabel();
        passLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
        passLabel.setBounds(770, 440, 300, 40);
        passLabel.setText("Password");
        passLabel.setForeground(Color.white);
        textField2 = new JPasswordField(15);
        textField2.setBounds(770, 480, 300, 30);


        b1 = new JButton("LOGIN");
        b1.setBounds(1000, 550, 80, 40);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        b2 = new JButton("RESET");
        b2.setBounds(950, 550, 80, 40);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);

        panel1.add(label);
        panel1.add(userLabel);
        panel1.add(textField1);
        panel1.add(passLabel);
        panel1.add(textField2);
        panel1.add(b1);
  //      panel1.add(b2);
        this.add(panel1);
        panel1.setVisible(true);






    }

    public static void main(String[] args) {
        login l=new login();


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b1)
        {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "");

                Statement st = connect.createStatement();
                ResultSet RS = st.executeQuery("select * from user_v");
                int i = 0;
                while (RS.next()) {
                    se = RS.getString(1);
                    sp = RS.getString(2);
                    if(se.equals(textField1.getText()) )
                    {
                        if(sp.equals(textField2.getText()))
                        {}
                    }
                    break;
                }

            } catch (Exception ee) {
                System.out.println(ee);
            }


            if(se.equals(textField1.getText()) ){
                if(sp.equals(textField2.getText())) {
                    System.out.println("login successfully");
                  dispose();
                  menubar mn=new menubar();
                }
            }
            else {
                JOptionPane.showMessageDialog(panel1,"error");

            }


        }

    }}
