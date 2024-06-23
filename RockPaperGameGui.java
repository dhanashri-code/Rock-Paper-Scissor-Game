import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

class RockPaperGameGui extends JFrame{

    JLabel l1 , l2 , l3 ;
    JTextField l4 , l5 , t1;
    JLabel a1 , a2 , a3 , sP , pS ,  sA , aS;
    JButton b1 , b2 , b3 , b4;
    int ch , scP , scA;
    Random r = new Random();
    int ai;
    ImageIcon i1 = new ImageIcon("C:/Users/Sarvadnya/Desktop/java/Pl_Rock.jpg");
    ImageIcon i2 = new ImageIcon("C:/Users/Sarvadnya/Desktop/Java/Pl_paper.jpg");
    ImageIcon i3 = new ImageIcon("C:/Users/Sarvadnya/Desktop/java/Pl_Scissor.jpg");

    ImageIcon ii1 = new ImageIcon("C:/Users/Sarvadnya/Desktop/java/Ai_Rock.jpg");
    ImageIcon ii2 = new ImageIcon("C:/Users/Sarvadnya/Desktop/java/Ai_paper.jpg");
    ImageIcon ii3 = new ImageIcon("C:/Users/Sarvadnya/Desktop/java/Ai_Scissor.jpg");
       
    RockPaperGameGui(String s1){
        super(s1);
    }
    RockPaperGameGui(){
    
    }
    
    void setCompo()
    {
        b1 = new JButton("Rock");
        b2 = new JButton("Paper");
        b3 = new JButton("Scissors");
        b4 = new JButton("Reslut");

        l1 = new JLabel();
        l2 = new JLabel();
        l3 = new JLabel();

        t1 = new JTextField("  Rock Paper Scissors Game ! ");
        l4 = new JTextField(JTextField.CENTER);
        l5 = new JTextField();

        t1.setEditable(false);
        l4.setEditable(false);
        l5.setEditable(false);

        a1 = new JLabel();
        a2 = new JLabel();
        a3 = new JLabel();

        sP = new JLabel("Player Score : ");
        sA = new JLabel("AI Score : ");
        pS = new JLabel();
        aS = new JLabel();
        
        l4.setHorizontalAlignment(JTextField.CENTER);
        l5.setHorizontalAlignment(JTextField.CENTER);

        Cursor c1 = new Cursor(Cursor.WAIT_CURSOR);
        b4.setCursor(c1);

        Cursor c2 = new Cursor(Cursor.HAND_CURSOR);
        b1.setCursor(c2);
        b2.setCursor(c2);
        b3.setCursor(c2);

        Font f1 = new Font("Callibri",Font.BOLD,15);
        sP.setFont(f1);
        pS.setFont(f1);
        sA.setFont(f1);
        aS.setFont(f1);

        sP.setForeground(Color.WHITE);
        pS.setForeground(Color.WHITE);
        sA.setForeground(Color.WHITE);
        aS.setForeground(Color.WHITE);

        Font f2 = new Font("Times New Roman",Font.BOLD,18);
        b1.setFont(f2);
        b2.setFont(f2);
        b3.setFont(f2);
        b4.setFont(f2);

        Font f3 = new Font("Callibri",Font.BOLD,20);
        t1.setFont(f3);
        t1.setBackground(Color.MAGENTA);

        Font f4 = new Font(" SansSerif,",Font.BOLD,15);
        l4.setFont(f4);
        l5.setFont(f4);

        b1.setBackground(Color.PINK);
        b2.setBackground(Color.YELLOW);
        b3.setBackground(Color.CYAN);
        b4.setBackground(Color.LIGHT_GRAY);
        
        add(t1);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);

        add(a1);
        add(a2);
        add(a3);

        add(sP);
        add(sA);
        add(pS);
        add(aS);

        t1.setBounds(70,20,300,50);

        b1.setBounds(40,130,100,50);
        b2.setBounds(160,130,100,50);
        b3.setBounds(280,130,100,50);
        b4.setBounds(160,450,100,50);
      
        sP.setBounds(40,70,120,50);
        pS.setBounds(160,70,100,50);
        sA.setBounds(250,70,100,50);
        aS.setBounds(335,70,100,50);

        l4.setBounds(130,350,150,40);
        l5.setBounds(110,400,200,40);

        b1.addActionListener(new B1());
        b2.addActionListener(new B1());
        b3.addActionListener(new B1());
        b4.addActionListener(new B1());
        
    }
    
    
public static void main(String args[])
{
    RockPaperGameGui rps = new RockPaperGameGui("Rock Paper Scissors Game.");
    rps.setVisible(true);
    rps.setSize(450,570);
    rps.setCompo();
    rps.getContentPane().setBackground(Color.BLACK);
    rps.setLayout(null);
    rps.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    rps.setLocationRelativeTo(null);
}

class B1 implements ActionListener
    {
       
        public void actionPerformed(ActionEvent e1)
        {
            if(e1.getSource() == b1)
            {
                l2.setIcon(null);
                l3.setIcon(null);

                ch=1;

                l1.setBounds(60,170,300,200);
                l1.setIcon(i1);
            }

            else if(e1.getSource() == b2)
            {
                l1.setIcon(null);
                l3.setIcon(null);

                ch=2;

                l2.setBounds(60,170,300,200);
                l2.setIcon(i2);

            }

            else if(e1.getSource() == b3)
            {
                l2.setIcon(null);
                l1.setIcon(null);

                ch=3;

                l3.setBounds(60,170,300,200);
                l3.setIcon(i3);

            }

            else if(e1.getSource() == b4)
            {
                ai = r.nextInt(1,4);
                if(ai == 1)
                {
                    a2.setIcon(null);
                    a3.setIcon(null);

                    a1.setBounds(240,170,300,200);
                    a1.setIcon(ii1);
                }
                else if(ai == 2)
                {
                a3.setIcon(null);
                a1.setIcon(null);
             
                a2.setBounds(240,170,300,200);
                a2.setIcon(ii2);
                }
            
                else if(ai == 3)
                {
                a2.setIcon(null);
                a1.setIcon(null);

                a3.setBounds(240,170,300,200);
                a3.setIcon(ii3);
                }

                switch(ch)
                {
                    case 1:

                    if(ch == ai)
                    {
                        l4.setText(" Tie (Draw)");
                        l4.setBackground(Color.ORANGE);
                        l5.setVisible(false);
                    }
            
                    else if(ch == 1 && ai==2)
                    {
                        l5.setVisible(true);
                        l4.setText(" Computer win ");
                        l5.setText(" Paper covers rock");
                        scA++;
                        l4.setBackground(Color.RED);
                    }

                    else
                    {
                        l5.setVisible(true);
                        l4.setText(" You win ");
                        l5.setText(" rock breaks scissors");
                        l4.setBackground(Color.GREEN);
                        scP++;
                    }
                    break;

                    case 2:
                    
                    if(ch == ai)
                    {
                        l4.setText(" Tie (Draw)");
                        l4.setBackground(Color.ORANGE);
                        l5.setVisible(false);
                    }

                    else if(ch == 2 && ai==1)
                    {
                        l5.setVisible(true);
                        l4.setText("  You win ");
                        l5.setText("  Paper covers rock");
                        l4.setBackground(Color.GREEN);
                        scP++;
                    }

                    else
                    {
                        l5.setVisible(true);
                        l4.setText(" Computer win ");
                        l5.setText(" Scissors cut papers");
                        l4.setBackground(Color.RED);
                        scA++;
                    }
                    break;

                    case 3:
                    
                    if(ch == ai)
                    {
                        l4.setText("Tie (Draw) ");
                        l4.setBackground(Color.ORANGE);
                        l5.setVisible(false);
                    }
            
                    else if(ch == 3 && ai==1)
                    {
                        l5.setVisible(true);
                        l4.setText("  Computer win "); 
                        l5.setText("  rock breaks scissors");  
                        l4.setBackground(Color.RED);
                        scA++;
                    }
                    
                    else
                    {
                        l5.setVisible(true);
                        l4.setText(" You win ");  
                        l5.setText(" Scissors cut papers"); 
                        l4.setBackground(Color.GREEN);
                        scP++;
                    }
                    break;
                    
                    default:
                        l4.setText(" please Enter valid choice. ");
           
                }   
                pS.setText(Integer.toString(scP));
                aS.setText(Integer.toString(scA));
            }
        
        }
    }
}