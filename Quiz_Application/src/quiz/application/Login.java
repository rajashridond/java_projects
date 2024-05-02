
package quiz.application;
import javax.swing.* ;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener {
      JButton rules ,back ;
      JTextField tfname ;
    Login()
    {
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,400,400);
        add(image);
        
        JLabel heading =new JLabel("Crazy Minds");
        heading.setBounds(750,60,600,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(Color.RED);
        add(heading);
        
        JLabel name =new JLabel("Enter Your Name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Balti",Font.BOLD,16));
        name.setForeground(Color.BLUE);
        add(name);
        
        tfname =new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,25));
        add(tfname);
        
        rules =new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back =new JButton("Back");
        back.setBounds(915,270,120,25);
        back.setBackground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        
        setSize(1200,400);
        setLocation(200,200);
        
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==rules){
            String name =tfname.getText();
            setVisible(false);
            new Rules(name);
            
        }
        else if (ae.getSource()== back)
        {
            setVisible(false);
        }
    }
    
    public static void main(String args[])
    {
        new Login();
        
    }
    
}
