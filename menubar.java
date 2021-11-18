

import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

class menubar extends JFrame implements ActionListener {

    JButton button1;
    JButton button2;
    JButton button3;
    menubar()
    {
        this.setLayout(new GridLayout());
        this.setSize(2150,700);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);


        ImageIcon img1 = new ImageIcon("th (2).jpg");

        JLabel label4 = new JLabel();
        label4.setText(" I-T-C CENTRE ");
        label4.setFont(new Font("MV Boli",Font.BOLD,60));
        label4.setBounds(150,100,500,500);
        label4.setIcon(img1);
        label4.setHorizontalTextPosition(JLabel.CENTER);
        label4.setVerticalTextPosition(JLabel.BOTTOM);
        label4.setForeground(Color.BLACK);
        label4.setIconTextGap(25);
        label4.setBackground(Color.BLACK);
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.GRAY);
        panel2.setLayout(null);
        panel2.add(label4);


        button1 = new JButton("COURSES");
        button1.setBounds(850,200,300,90);
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        button1.addActionListener(this);

        button2 = new JButton("CURRENT STATUS");
        button2.setBounds(850,400,300,90);
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        button2.addActionListener(this);

        button3 = new JButton("LOG OUT");
        button3.setBounds(1250,600,100,50);
        button3.setBackground(Color.WHITE);
        button3.setForeground(Color.BLACK);
        button3.addActionListener(this);


        JLabel label5 = new JLabel();
        label5.setFont(new Font("Times New Roman",Font.BOLD,20));
        label5.setText("Contact us: 03109017609");
        label5.setForeground(Color.black);
        label5.setBounds(10,600,250,80);

        JLabel label6 = new JLabel("Email: itccentre@gmail.com");
        label6.setFont(new Font("Times New Roman",Font.BOLD,20));
        label6.setBounds(980,600,350,80);
        label6.setForeground(Color.black);

        //panel1.setLayout(null);

        panel2.add(label5);
        panel2.add(label6);
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);

        //JPanel panelfull = new JPanel();

        //panelfull.setSize(1150,700);
        //panelfull.add(panel1);
        //panelfull.add(panel2);



        this.add(panel2);
         this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1)
        {
            dispose();
           CourseSelection cs=new CourseSelection();
        }
        else if(e.getSource()==button2)
        {
            dispose();
            currentstatus cs = new currentstatus();
           // System.out.println("current status");
        }
        else if(e.getSource()==button3)
        {
            dispose();
            login fd = new login();
        }
    }

    public static void main(String[] args) {
        menubar mn = new menubar();
    }


}