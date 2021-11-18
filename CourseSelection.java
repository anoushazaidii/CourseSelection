import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class CourseSelection extends JFrame implements ActionListener {
    static JFrame frame;
    static JPanel panel13;
    JLabel l, l1, l2, l3, l4, l5, l6, name;
    static JRadioButton r1, r2, r3, r4, r5, r6, r7, r8;
    ButtonGroup bg;
    JButton b1, b2, b3;
    static JTextField namefield, t1, t2, t3, t4;
    static String t11,  q1,s1,  p1;


    private final JLabel maintitle;

    CourseSelection() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1500, 1000);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.lightGray);
        this.setTitle("IT WEB SERVICESS");
          this.setResizable(false);
        panel13 = new JPanel();
        panel13.setBounds(0, 0, 1500, 1500);
        panel13.setBackground(Color.GRAY);


        panel13.setLayout(null);
        panel13.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        maintitle = new JLabel("COURSE SELECTION");
        maintitle.setFont(new Font("ComicSans", Font.BOLD, 50));
        maintitle.setForeground(Color.white);
        maintitle.setBounds(400, 30, 900, 50);
        panel13.add(maintitle);

        l = new JLabel("THE AVAILABLE COURSES ARE");
        l.setBounds(40, 90, 900, 70);
        l.setFont(new Font("Verdana", Font.PLAIN, 40));

        r1 = new JRadioButton("Data Science");
        r2 = new JRadioButton("Cloud Computing");
        r3 = new JRadioButton("Cyber Security");
        r4 = new JRadioButton("Blockchain");
        r5 = new JRadioButton("Data Visualization");
        r6 = new JRadioButton("IoT (Internet of Things)");
        r7 = new JRadioButton("Artificial Intelligence");
        r8 = new JRadioButton("Machine Learning");

        r1.setBounds(40, 160, 400, 50);
        r2.setBounds(40, 200, 400, 50);
        r3.setBounds(40, 240, 400, 50);
        r4.setBounds(40, 280, 400, 50);
        r5.setBounds(40, 320, 400, 50);
        r6.setBounds(40, 360, 400, 50);
        r7.setBounds(40, 400, 400, 50);
        r8.setBounds(40, 440, 400, 50);
       r1.addActionListener(this);

        r1.setFont(new Font("Verdana", Font.PLAIN, 30));
        r2.setFont(new Font("Verdana", Font.PLAIN, 30));
        r3.setFont(new Font("Verdana", Font.PLAIN, 30));
        r4.setFont(new Font("Verdana", Font.PLAIN, 30));
        r5.setFont(new Font("Verdana", Font.PLAIN, 30));
        r6.setFont(new Font("Verdana", Font.PLAIN, 30));
        r7.setFont(new Font("Verdana", Font.PLAIN, 30));
        r8.setFont(new Font("Verdana", Font.PLAIN, 30));


        l1 = new JLabel("NOTE:You can only select on course at a time");
        l1.setBounds(40, 500, 900, 40);
        l1.setFont(new Font("Verdana", Font.PLAIN, 30));

        l2 = new JLabel("");
        l2.setBounds(40, 600, 900, 40);
        l2.setFont(new Font("Verdana", Font.PLAIN, 30));

        b1 = new JButton("SELECT");
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setBounds(40, 560, 90, 30);
        b1.addActionListener(this);

        b2 = new JButton("CLEAR");
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setBounds(140, 560, 90, 30);
         b2.addActionListener(this);

        b3 = new JButton("ENTER");
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.setBounds(1000, 600, 100, 40);
        b3.addActionListener(this);

        l6 = new JLabel("Name");
        l6.setBounds(750, 140, 140, 40);
        l6.setFont(new Font("Verdana", Font.PLAIN, 30));

        namefield = new JTextField("");
        namefield.setBounds(950, 100, 400, 40);
        namefield.setFont(new Font("Verdana", Font.PLAIN, 30));

        //ImageIcon image= new ImageIcon(".idea/click.jpg");

        // = new JButton("Search",image);
        // search.setBounds(1250,140 , 160, 60);

        name = new JLabel("NAME");
        name.setBounds(800, 100, 900, 40);
        name.setFont(new Font("Verdana", Font.PLAIN, 30));


        l3 = new JLabel("Price");
        l3.setBounds(800, 200, 900, 40);
        l3.setFont(new Font("Verdana", Font.PLAIN, 30));

        t1 = new JTextField("");
        t1.setBounds(950, 200, 200, 40);

        t2 = new JTextField("");
        t2.setBounds(1000, 300, 200, 40);

        t3 = new JTextField("");
        t3.setBounds(950, 400, 200, 40);

        t4 = new JTextField("");
        t4.setBounds(950, 500, 200, 40);


        l4 = new JLabel("Credit Hours");
        l4.setBounds(800, 300, 900, 40);
        l4.setFont(new Font("Verdana", Font.PLAIN, 30));

        l5 = new JLabel("Quizs");
        l5.setBounds(800, 400, 900, 40);
        l5.setFont(new Font("Verdana", Font.PLAIN, 30));

        l6 = new JLabel("Details");
        l6.setBounds(800, 500, 900, 40);
        l6.setFont(new Font("Verdana", Font.PLAIN, 30));

        bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);
        bg.add(r5);
        bg.add(r6);
        bg.add(r7);
        bg.add(r8);

        this.setVisible(true);
        this.setResizable(true);

        panel13.add(l);
        panel13.add(r1);
        panel13.add(r2);
        panel13.add(r3);
        panel13.add(r4);
        panel13.add(r5);
        panel13.add(r6);
        panel13.add(r7);
        panel13.add(r8);
        panel13.add(l1);
        panel13.add(b1);
        panel13.add(b2);
        panel13.add(l2);

        panel13.add(l3);
        panel13.add(l4);
        panel13.add(l5);
        panel13.add(l6);
        panel13.add(name);
        panel13.add(namefield);
        panel13.add(t1);
        panel13.add(t2);
        panel13.add(t3);
        panel13.add(t4);
        panel13.add(b3);

        this.add(panel13);

    }

    public static void main(String[] args) {

        CourseSelection cs = new CourseSelection();

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            if (r1.isSelected() || r2.isSelected() || r3.isSelected() || r4.isSelected()
                    || r5.isSelected() || r6.isSelected() || r7.isSelected() || r8.isSelected()) {
                l2.setText("YOU HAVE SELECTED THIS COURSE SUCCESSFULLY");
                if(r1.isSelected()) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        System.out.println("OK");
                        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/courseselection", "root", "");
                        if (connect != null)
                            System.out.println("Connected");

                        Statement st = connect.createStatement();
                        ResultSet RS = st.executeQuery("SELECT price,time_duration,quizs,scope from info_of_courses where name_of_course='Data Science'");
                        while (RS.next()) {
                            p1 = RS.getString(1);
                            t11 = RS.getString(2);
                            q1 = RS.getString(3);
                            s1 = RS.getString(4);

                        }

                    } catch (Exception ee) {
                        System.out.println(ee);
                    }
                namefield.setText(r1.getText());
                t1.setText(p1);
                t2.setText(t11);
                t3.setText(q1);
                t4.setText(s1);
                }
                else if(r2.isSelected()) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        System.out.println("OK");
                        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/courseselection", "root", "");
                        if (connect != null)
                            System.out.println("Connected");

                        Statement st = connect.createStatement();
                        ResultSet RS = st.executeQuery("SELECT price,time_duration,quizs,scope from info_of_courses where name_of_course='Cloud Computing'");
                        while (RS.next()) {
                            p1 = RS.getString(1);
                            t11 = RS.getString(2);
                            q1 = RS.getString(3);
                            s1 = RS.getString(4);

                        }

                    } catch (Exception ee) {
                        System.out.println(ee);
                    }
                    namefield.setText(r2.getText());
                    t1.setText(p1);
                    t2.setText(t11);
                    t3.setText(q1);
                    t4.setText(s1);
            }
                else if(r3.isSelected()) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        System.out.println("OK");
                        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/courseselection", "root", "");
                        if (connect != null)
                            System.out.println("Connected");

                        Statement st = connect.createStatement();
                        ResultSet RS = st.executeQuery("SELECT price,time_duration,quizs,scope from info_of_courses where name_of_course='Cyber Security'");
                        while (RS.next()) {
                            p1 = RS.getString(1);
                            t11= RS.getString(2);
                            q1 = RS.getString(3);
                            s1 = RS.getString(4);

                        }


                    } catch (Exception ee) {
                        System.out.println(ee);
                    }
                    namefield.setText(r3.getText());
                    t1.setText(p1);
                    t2.setText(t11);
                    t3.setText(q1);
                    t4.setText(s1);
                }
                else if(r4.isSelected()) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        System.out.println("OK");
                        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/courseselection", "root", "");
                        if (connect != null)
                            System.out.println("Connected");

                        Statement st = connect.createStatement();
                        ResultSet RS = st.executeQuery("SELECT price,time_duration,quizs,scope from info_of_courses where name_of_course='Blockchain'");
                        while (RS.next()) {
                            p1 = RS.getString(1);
                            t11 = RS.getString(2);
                            q1 = RS.getString(3);
                            s1 = RS.getString(4);

                        }

                    } catch (Exception e3) {
                        System.out.println(e3);
                    }
                    namefield.setText(r4.getText());
                    t1.setText(p1);
                    t2.setText(t11);
                    t3.setText(q1);
                    t4.setText(s1);
                }
                else if(r5.isSelected()) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        System.out.println("OK");
                        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/courseselection", "root", "");
                        if (connect != null)
                            System.out.println("Connected");

                        Statement st = connect.createStatement();
                        ResultSet RS = st.executeQuery("SELECT price,time_duration,quizs,scope from info_of_courses where name_of_course='Data Visualization'");
                        while (RS.next()) {
                            p1 = RS.getString(1);
                            t11 = RS.getString(2);
                            q1 = RS.getString(3);
                            s1 = RS.getString(4);

                        }

                    } catch (Exception ee) {
                        System.out.println(ee);
                    }
                    namefield.setText(r5.getText());
                    t1.setText(p1);
                    t2.setText(t11);
                    t3.setText(q1);
                    t4.setText(s1);
                }
                else if(r6.isSelected()) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        System.out.println("OK");
                        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/courseselection", "root", "");
                        if (connect != null)
                            System.out.println("Connected");

                        Statement st = connect.createStatement();
                        ResultSet RS = st.executeQuery("SELECT price,time_duration,quizs,scope from info_of_courses where name_of_course='IoT (Internet of Things)'");
                        while (RS.next()) {
                            p1 = RS.getString(1);
                            t11 = RS.getString(2);
                            q1 = RS.getString(3);
                            s1 = RS.getString(4);

                        }

                    } catch (Exception ee) {
                        System.out.println(ee);
                    }
                    namefield.setText(r6.getText());
                    t1.setText(p1);
                    t2.setText(t11);
                    t3.setText(q1);
                    t4.setText(s1);
                }
                else if(r7.isSelected()) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        System.out.println("OK");
                        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/courseselection", "root", "");
                        if (connect != null)
                            System.out.println("Connected");

                        Statement st = connect.createStatement();
                        ResultSet RS = st.executeQuery("SELECT price,time_duration,quizs,scope from info_of_courses where name_of_course='Artificial Intelligence'");
                        while (RS.next()) {
                            p1 = RS.getString(1);
                            t11 = RS.getString(2);
                            q1 = RS.getString(3);
                            s1 = RS.getString(4);

                        }

                    } catch (Exception ee) {
                        System.out.println(ee);
                    }
                    namefield.setText(r7.getText());
                    t1.setText(p1);
                    t2.setText(t11);
                    t3.setText(q1);
                    t4.setText(s1);
                }
                else if(r8.isSelected()) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        System.out.println("OK");
                        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/courseselection", "root", "");
                        if (connect != null)
                            System.out.println("Connected");

                        Statement st = connect.createStatement();
                        ResultSet RS = st.executeQuery("SELECT price,time_duration,quizs,scope from info_of_courses where name_of_course='Machine Learning'");
                        while (RS.next()) {
                            p1 = RS.getString(1);
                            t11 = RS.getString(2);
                            q1 = RS.getString(3);
                            s1 = RS.getString(4);

                        }

                    } catch (Exception ee) {
                        System.out.println(ee);
                    }
                    namefield.setText(r8.getText());
                    t1.setText(p1);
                    t2.setText(t11);
                    t3.setText(q1);
                    t4.setText(s1);
                }
        }

                 else
                    l2.setText("YOU HAVE NOT SELECTED ANY COURSE YET");

            }
   else if (e.getSource() == b2) {

                if (r1.isSelected() || r2.isSelected() || r3.isSelected() || r4.isSelected()
                        || r5.isSelected() || r6.isSelected() || r7.isSelected() || r8.isSelected()) {
                    bg.clearSelection();
                    l2.setText("YOUR SELECTION IS CLEARED");
                    namefield.setText("");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");

                } else
                    l2.setText("YOU HAVE NOT SELECTED ANYTHINHG TO CLEAR");


            }
         else if(e.getSource()==b3)
        {

            try {
                int record=0;
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("OK");
                Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "");
                if (connect != null) {
                    System.out.println("Connected");
                    if (r1.isSelected()) {
                        PreparedStatement stmt = connect.prepareStatement("UPDATE user_v SET currently_enrolled='Data Science' Where pass=\"hello\"");
                        stmt.executeUpdate();
                    }
                   else if (r2.isSelected()) {
                        PreparedStatement stmt = connect.prepareStatement("UPDATE user_v SET currently_enrolled='Cloud Computing' Where pass=\"hello\"");
                        stmt.executeUpdate();
                    }
                    else if (r3.isSelected()) {
                        PreparedStatement stmt = connect.prepareStatement("UPDATE user_v SET currently_enrolled='Cyber Security' Where pass=\"hello\"");
                        stmt.executeUpdate();
                    }
                    else if (r4.isSelected()) {
                        PreparedStatement stmt = connect.prepareStatement("UPDATE user_v SET currently_enrolled='Block chain' Where pass=\"hello\"");
                        stmt.executeUpdate();
                    }
                    else if (r5.isSelected()) {
                        PreparedStatement stmt = connect.prepareStatement("UPDATE user_v SET currently_enrolled='Data Visuilization' Where pass=\"hello\"");
                        stmt.executeUpdate();
                    }
                    else if (r6.isSelected()) {
                        PreparedStatement stmt = connect.prepareStatement("UPDATE user_v SET currently_enrolled='IOT' Where pass=\"hello\"");
                        stmt.executeUpdate();
                    }
                    else if (r7.isSelected()) {
                        PreparedStatement stmt = connect.prepareStatement("UPDATE user_v SET currently_enrolled='Artificial Intelligence' Where pass=\"hello\"");
                        stmt.executeUpdate();
                    }
                    else if (r8.isSelected()) {
                        PreparedStatement stmt = connect.prepareStatement("UPDATE user_v SET currently_enrolled='Machine Learning' Where pass=\"hello\"");
                        stmt.executeUpdate();
                    }

                    dispose();
                    menubar mn = new menubar();
                    // System.out.println(record);
                    // stmt.setString(1,"New Assigmed Name");
                    //   stmt.setString(2,"20SWO12");
                }   //   record=stmt.executeUpdate();
            }
            catch(Exception ae)
            {
                System.out.println(ae);
            }
        }

    }}






   