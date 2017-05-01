

package TheGreedyKnight;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

   public class GreedyKnight extends JFrame implements ActionListener {
    
    JPanel p1,p2,p3,p4,p5,p6,p7,p8,p_r,p_f;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,bb,bn,b_inst,b_cred;
    JTextField f1,f2,f3,f_r;
  
    JLabel l1,l2,l3,l4,l5,l6,l_r,l_f;
    ImageIcon coin=new ImageIcon("mg/coin.png");
    ImageIcon horse=new ImageIcon("mg/brown_horse_running.jpg");
    ImageIcon res=new ImageIcon("mg/tou.gif");
    ImageIcon win=new ImageIcon("mg/tou1.gif");
    ImageIcon ov=new ImageIcon("mg/tou2.gif");
    ImageIcon cr=new ImageIcon("mg/tou3.jpg");
    ImageIcon ins=new ImageIcon("mg/tou4.jpg");
    
    JLabel l[]=new JLabel[50];
    
    int random_row,random_col,row1,col1,p,q,k,lo,j,i;
    
    int [][] colour=new int [100][100];
 
    
    
    int [] row= {-1,1,2,2,1,-1,-2,-2};
    
    int [] col= {2,2,1,-1,-2,-2,-1,1};
    
    
    int current_row=3;
    int current_col=4;
    
    int temp_row=3;
    int temp_col=4;
    
    int  count=0;
    
    int random_c,random_r;
    
    int row_m,col_m;
    
    
    
    int st_position=0;
    int ase_na_ki;
    int paisi=0;
    
    
    GreedyKnight()
    {
        
      
        
        super("Greedy Knight");
        
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         
         
         
         setSize(600,650);
        
         setVisible(true);
        
        
      
        
        p1=new JPanel(new GridLayout(1,4));
        
       
        
        b1=new JButton("1");
        
         
        
        b1.setPreferredSize(new Dimension(60, 60));
        
        b2=new JButton("2");
       
        
        b2.setPreferredSize(new Dimension(60, 60));
        
        b3=new JButton("3");
        b3.setPreferredSize(new Dimension(60, 60));
        
        b4=new JButton("4");
        b4.setPreferredSize(new Dimension(60, 60));
        
          b1.setIcon(coin);
          b2.setIcon(coin); 
          b3.setIcon(coin);
          b4.setIcon(coin);
          
          
          
          b1.setBackground(new java.awt.Color(0, 204, 0));
          b2.setBackground(new java.awt.Color(0, 204, 0));
          b3.setBackground(new java.awt.Color(0, 204, 0));
          b4.setBackground(new java.awt.Color(0, 204, 0));
          
          
        
        
       p2=new JPanel(new GridLayout(1,4));
        
        
        b5=new JButton("5");
        b5.setPreferredSize(new Dimension(60, 60));
        
        b6=new JButton("6");
        b6.setPreferredSize(new Dimension(60, 60));
        
        b7=new JButton("7");
        b7.setPreferredSize(new Dimension(60, 60));
        
        b8=new JButton("8");
        b8.setPreferredSize(new Dimension(60, 60));
        
        
          b5.setIcon(coin);
          b6.setIcon(coin); 
          b7.setIcon(coin);
          b8.setIcon(coin);
          
          
          
           b5.setBackground(new java.awt.Color(0, 204, 0));
           b6.setBackground(new java.awt.Color(0, 204, 0));
           b7.setBackground(new java.awt.Color(0, 204, 0));
           b8.setBackground(new java.awt.Color(0, 204, 0));
          
        
        
        
       p3=new JPanel(new GridLayout(1,4));
        
        b9=new JButton("9");
        b9.setPreferredSize(new Dimension(60, 60));
        
        b10=new JButton("10");
        b10.setPreferredSize(new Dimension(60, 60));
        
        b11=new JButton("11");
        b11.setPreferredSize(new Dimension(60, 60));
        
        b12=new JButton("START");
        b12.setPreferredSize(new Dimension(60, 60));
        
        bb=b12;
        bn=b12;
         
        
        
          b9.setIcon(coin);
          b10.setIcon(coin); 
          b11.setIcon(coin);
          b12.setIcon(horse);
          
          
          
           b9.setBackground(new java.awt.Color(0, 204, 0));
           b10.setBackground(new java.awt.Color(0, 204, 0));
           b11.setBackground(new java.awt.Color(0, 204, 0));
           b12.setBackground(new java.awt.Color(0, 204, 0));
          
        
        
        
        
       p4=new JPanel(new GridLayout(1,4));
        
        l5=new JLabel();
        b14=new JButton("14");
        b14.setPreferredSize(new Dimension(60, 60));
        
        b15=new JButton("15");
        b15.setPreferredSize(new Dimension(60, 60));
        
       l6=new JLabel();
        
       
        
        
         b15.setIcon(coin);
         b14.setIcon(coin);
        
         b14.setBackground(new java.awt.Color(0, 204, 0));
         b15.setBackground(new java.awt.Color(0, 204, 0));
         
         
         
        
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        
        
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        
        
        p3.add(b9);
        p3.add(b10);
        p3.add(b11);
        p3.add(b12);
        
        
        
     
        p4.add(l5);
        p4.add(b14);
        p4.add(b15);
        p4.add(l6);
        
        
        
        p5=new JPanel();
        
        p5.setLayout(new BoxLayout(p5,BoxLayout.PAGE_AXIS));
        
       
        
        p5.add(p1);
        p5.add(p2);
        p5.add(p3);
        p5.add(p4);
           
           for(q=1;q<5;q++)
           {
            
             l[q]=new JLabel("   ");
             p5.add(l[q]);
           }
           
           
           

   
            p8=new JPanel(new GridLayout(1,3));
            
           

//l3=new JLabel("");
            
            
            
            
            
            b18=new JButton("New Game");
            
            b18.setFont(new java.awt.Font("Cambria", 0, 23));
            
           
            
            
            b18.setBackground(new java.awt.Color(204, 255, 204));
        
           // b18.setForeground(new java.awt.Color(255, 0, 204));
            
             b18.setForeground(new java.awt.Color(255, 102, 0));
            
            
            
             p8.add(b18);
            
             for(q=1;q<2;q++)
             {
            
             l[q]=new JLabel("");
             p8.add(l[q]);
             }
             
            
            l4=new JLabel("          Coins  : ");
            
            l4.setFont(new java.awt.Font("Aharoni", 1, 22)); // NOI18N
           l4.setForeground(new java.awt.Color(0, 0, 204));
            
            
            f1=new JTextField(2);
            
            
            f1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); 
            
            f1.setForeground(new java.awt.Color(255, 0, 204));
           
            f1.setEditable(false);
            
            
          
            
            
            
            
           //// l6=new JLabel("");
            
            
            
            
            p8.add(l4);
            
            p8.add(f1);
           // p8.add(l6);
            
            
            p5.add(p8);
            
            
            for(p=1;p<4;p++)
             {
            
             l[p]=new JLabel("");
             p5.add(l[p]);
             }
           
            
     
           p6=new JPanel(new GridLayout(1,2));
           
           
           for(q=1;q<2;q++)
             {
            
             l[q]=new JLabel("");
             p6.add(l[q]);
             }
             
           
           
           p7=new JPanel(new GridLayout(1,3));
           
          
           b_inst=new JButton("Instructions");
           
           
          b_inst.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15));// NOI18N
          b_inst.setForeground(new java.awt.Color(0, 102, 0));
           
           
           
           
           
           
           
            l2=new JLabel("          Result : ");
            
            
           l2.setFont(new java.awt.Font("Aharoni", 1, 22)); // NOI18N
           l2.setForeground(new java.awt.Color(204, 0, 204));
           
           
           

           //l2=new JLabel("                    Total Played : ");
         //  l2.setFont(new java.awt.Font("Aharoni", 1, 20));
         //  l2.setForeground(new java.awt.Color(255, 51, 0));
           
           
           
           
           
           
           f2=new JTextField(2);
           f2.setEditable(false);
           
           
           f2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13));
           f2.setBackground(new java.awt.Color(204, 204, 204));
           f2.setForeground(new java.awt.Color(0, 102, 0));
           
           
          // f2.setEditable(false);
           
           p7.add(b_inst);
           
           
            for(q=1;q<2;q++)
             {
            
             l[q]=new JLabel("");
             p7.add(l[q]);
             }
            
            p7.add(l2);
         
           p7.add(f2);
           
     
           
          p5.add(p6);
          p5.add(p7);
          
            p_f=new JPanel(new GridLayout(1,3));
          
           for(q=1;q<2;q++)
             {
            
             l[q]=new JLabel("");
             p_f.add(l[q]);
             }
          
             p5.add(p_f);
          
          
          
           p_r=new JPanel(new GridLayout(1,3));
           
           
           
            b_cred=new JButton("Credit");
            
            
            b_cred.setForeground(new java.awt.Color(255, 51, 51));
            b_cred.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18));
          
            p_r.add(b_cred);
          
          
            for(q=1;q<4;q++)
            {
           
             l[q]=new JLabel("");
              p_r.add(l[q]);
             }
          
          
            
           
            
           
            
            
            
            
            
            
            //p_r.add(f_r);
            
          
            p5.add(p_r);
           
           
      
         add(p5);
         
      
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b_cred.addActionListener(this);
        b_inst.addActionListener(this);
        b18.addActionListener(this);
        
        
   setVisible(true);         
        
        
    }

    //@Override
    @Override
    
    public void actionPerformed(ActionEvent ae) {
        
      try
      {
          
  
       
        if(ae.getSource()==b1)
        {
            
           
           random_row=1;
           random_col=1;
           compute(random_row,random_col,b1);
            
        }
        
        if(ae.getSource()==b2)
        {
           
            random_row=1;
            random_col=2;
            
              compute(random_row,random_col,b2);
            
        }
        
        if(ae.getSource()==b3)
        {
            
            random_row=1;
            random_col=3;
            
            
            
            
             compute(random_row,random_col,b3);
            
        }
        
        if(ae.getSource()==b4)
        {
            
            random_row=1;
            random_col=4;
            
            
            
             compute(random_row,random_col,b4);
            
        }
        
        if(ae.getSource()==b5)
        {
           
            random_row=2;
            random_col=1;
            
            
              compute(random_row,random_col,b5);
            
        }
        
        if(ae.getSource()==b6)
        {
           
           random_row=2;
            random_col=2;
            
            
            
             compute(random_row,random_col,b6);
            
        }
        
        if(ae.getSource()==b7)
        {
            
            
            random_row=2;
            random_col=3;
            
              compute(random_row,random_col,b7);
            
        }
        
        if(ae.getSource()==b8)
        {
            
            random_row=2;
            random_col=4;
            
            
             compute(random_row,random_col,b8);
            
        }
        
        if(ae.getSource()==b9)
        {
            
           
            random_row=3;
            random_col=1;
            
              compute(random_row,random_col,b9);
            
        }
        
        if(ae.getSource()==b10)
        {
          
            random_row=3;
            random_col=2;
            
            
            compute(random_row,random_col,b10);
            
        }
        
        if(ae.getSource()==b11)
        {
            
           
            random_row=3;
            random_col=3;
            
             compute(random_row,random_col,b11);
            
        }
        
        if(ae.getSource()==b12)
        {
           
            random_row=3;
            random_col=4;
            
            
              compute(random_row,random_col,b12);
            
        }
        
        
        
        if(ae.getSource()==b14)
        {
            
           random_row=4;
           random_col=2;
            
           compute(random_row,random_col,b14);
            
        }
        
        
         if(ae.getSource()==b15)
        {
            
           random_row=4;
           random_col=3;
            
           compute(random_row,random_col,b15);
        }
         
         
          if(ae.getSource()==b_cred)
           {
            
               System.out.println(" asi");

            
              //JOptionPane.showMessageDialog(null,"    (1) Anamul Hasan.\n  Reg: 2012331509\n    (2) Md. Abu Ahammed Babu.\n  Reg: 2012331525","Credit",JOptionPane.PLAIN_MESSAGE,null);
            JOptionPane.showMessageDialog(null,"","Credit",JOptionPane.PLAIN_MESSAGE,cr);
             
           }
         
         
         if(ae.getSource()==b18)
        {
            
          reset();
        }
         
         
         if(ae.getSource()==b_inst)
        {
            JOptionPane.showMessageDialog(null," ","instruction",JOptionPane.PLAIN_MESSAGE,ins);
           
        }  
         
         
         
         
         
         
         
       
        }
        catch(Exception e)
        {
            
        }
      
      
       
        

//To change body of generated methods, choose Tools | Templates.
    }
    
    
   
    
    
    public void compute(int random_,int random_1,JButton b){
        
         
        
        
        colour[4][1]=1;
        colour[4][4]=1;
        
        
        random_row=random_;
        random_col=random_1;
        
      //  System.out.println("row= "+random_row+"col= "+random_col);
        
        
        for( i=0; i<8; i++)
        {
          
            
          
            
            row1=random_row+row[i];

            col1=random_col+col[i];
            
            
            
            
             if(row1<0 || col1<0)
               {
                          
                          continue;
               }
         

            if(colour[random_row][random_col]==0 && current_row == row1 && col1==current_col && (row1>=1 && row1<=4) &&(col1>=1 && col1<=4))
            {

                
                 
                   // b.setBackground(new java.awt.Color(255, 0, 0));
                    
                    b.setBackground(new java.awt.Color(204, 0, 0));
                    
                    b.setIcon(null);
                    b.setIcon(horse);
                    bb.setIcon(null);
                    bb=b;
                    
                    
                    
               if(temp_col==random_col&&temp_row==random_row)
                   
                {

                         st_position=1;
                         colour[random_row][random_col]=1;
                    
                    
                          if(count==13)
                          {
                            //System.out.println("CONGRATULATION !!!!");
                          
                           f2.setText("CONGRATULATION !!");
                           //JOptionPane.showMessageDialog(null,"   Congratulation !!!! You Are Perfect.","Result",JOptionPane.PLAIN_MESSAGE,null);
                           
                            JOptionPane.showMessageDialog(null," ","Result",JOptionPane.PLAIN_MESSAGE,res);
                          
           
                         }

                        else if(count<13)
                         {
                
                         //System.out.println("RT="+st_position);
                         f2.setText("YOU WIN !!");
                         
                         
                         //JOptionPane.showMessageDialog(null,"   You Win !! But Some Of The Coins Are Missing","Result",JOptionPane.PLAIN_MESSAGE,null);
                         
                          JOptionPane.showMessageDialog(null," ","Result",JOptionPane.PLAIN_MESSAGE,win);
                         
                         
                 
                         }
               
               }
                
                

                else
                {
                 
                    
                  
                    current_row=random_row;
                    current_col=random_col;
                    colour[current_row][current_col]=1;
                    
                    count++;
                    
                    
                     String dr2 = String.valueOf(count);
                   
                     f1.setText("    "+dr2);
                     
                     
                  
                     
                 paisi=0;
                    
                   
    
                 for( j=0; j<8; j++)
               
                 {
                        
                       
                      row_m=current_row+row[j]; 

                      col_m=current_col+col[j];
                      
                      
                      if(row_m<0 || col_m<0)
                      {
                          
                          continue;
                      }
        

                     if(colour[row_m][col_m]==0 && (row_m>=1 && row_m<=4) &&(col_m>=1 && col_m<=4))
                         
                      {
            
                        paisi++;
                   
                      }
                    
                 }
                         

                    if(paisi==0)
                    {
                        
                        
                        f2.setText("GAME OVER!!");
                        
                   
                        
                        
                      //JOptionPane.showMessageDialog(null,"  Game Over !! No More Valid Moves. ","Result",JOptionPane.PLAIN_MESSAGE,null);
                        
                        JOptionPane.showMessageDialog(null,"  ","Result",JOptionPane.PLAIN_MESSAGE,ov);
                        
                    }
                    
                    
            }
        }
      
     }
        
        
       
   }
    
    
    
    public void reset()
    {
        
        f2.setText(null);
        f1.setText(null);
     
        GreedyKnight ob1=new GreedyKnight();
        
    }
        
        
  
   
 }
    
    
    

class Greed{
 
public static void main(String args[])
{

GreedyKnight ob=new GreedyKnight();


}

}