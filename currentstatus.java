import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
class currentstatus implements ActionListener {

    JFrame f;
    JTable t;
    JButton ebutton;
    public String data[][]=new String[3][3];
    currentstatus()
    {
        f=new JFrame("JDBC");

        f.getContentPane().setBackground(Color.GRAY);
        f.setSize(1150,1150);

        f.setLayout(null);
        String Columns[]={"overall_courses","currently_enrolled","quizes_completed"};

        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("OK");
            Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","");
            if(connect !=null)
                System.out.println("Connected");

            Statement st=connect.createStatement();
            ResultSet RS=st.executeQuery("SELECT * FROM user_v");
            int i=1;
            while(RS.next())
            {
                data[i][0]=RS.getString(3);
                data[i][1]=RS.getString(4);
                data[i][2]=RS.getString(5);

                i++;
            }
            data[0][0]="OVERALL COURSES";
            data[0][1]="CURRENTLY ENROLLED";
            data[0][2]="QUIZES COMPLETED";

            t=new JTable(data,Columns);
            t.setBounds(250,100,500,200);

            f.add(t);

            ebutton  = new JButton("BACK");
            ebutton.setBounds(20,100,100,50);
            ebutton.setForeground(Color.WHITE);
            ebutton.setBackground(Color.BLACK);
            ebutton.addActionListener(this);


           // JScrollPane sp=new JScrollPane(t);
            f.add(ebutton);
           // f.add(sp);
            f.setVisible(true);

        }

        catch (Exception e)
        {
            System.out.println(e);
        }


    }
    public static void main(String[] args){
        new currentstatus();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==ebutton)
        {
            f.dispose();
            menubar mn=new menubar();

        }
    }
}