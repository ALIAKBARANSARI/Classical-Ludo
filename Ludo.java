import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import static java.lang.Thread.sleep;

public class button extends JFrame
{
	private Container contents;
	
	private Color colorblack=Color.WHITE;
	private ImageIcon rball1=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\rbal1.jpg");
	private ImageIcon rball2=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\rbal2.jpg");
	private ImageIcon rball3=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\rbal3.jpg");
	private ImageIcon rball4=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\rbal4.jpg");
	private ImageIcon bball1=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\bbal1.jpg");
	private ImageIcon bball2=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\bbal2.jpg");
	private ImageIcon bball3=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\bbal3.jpg");
	private ImageIcon bball4=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\bbal4.jpg");
	private ImageIcon gball1=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\gbal1.jpg");
	private ImageIcon gball2=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\gbal2.jpg");
	private ImageIcon gball3=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\gbal3.jpg");
	private ImageIcon gball4=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\gbal4.jpg");
	private ImageIcon yball1=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\ybal1.jpg");
	private ImageIcon yball2=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\ybal2.jpg");
	private ImageIcon yball3=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\ybal3.jpg");
	private ImageIcon yball4=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\ybal4.jpg");
	
	private ImageIcon centre=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\centre.jpg");
	private ImageIcon rstar=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\redstar.jpg");
	private ImageIcon bstar=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\bluestar.jpg");
	private ImageIcon gstar=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\greenstar.jpg");
	private ImageIcon ystar=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\yellowstar.jpg");
	private ImageIcon one=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\one4.jpg");
	private ImageIcon two=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\two4.jpg");
	private ImageIcon three=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\three4.jpg");
	private ImageIcon four=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\four4.jpg");
	private ImageIcon five=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\five4.jpg");
	private ImageIcon six=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\six4.jpg");
	private ImageIcon diceImag=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\dice3.jpg");
	private ImageIcon on1=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\one1.jpg");
	private ImageIcon to1=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\two1.jpg");
	private ImageIcon th1=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\three1.jpg");
	private ImageIcon fo1=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\four1.jpg");
	private ImageIcon fi1=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\five1.jpg");
	private ImageIcon si1=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\six1.jpg");
	private ImageIcon rball=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\rbal.jpg");
	private ImageIcon bball=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\bbal.jpg");
	private ImageIcon gball=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\gbal.jpg");
	private ImageIcon yball=new javax.swing.ImageIcon("C:\\Users\\Ali Akbar\\Desktop\\javapro\\ybal.jpg");
	
	
	
	
	private JButton[] squares=new JButton[52];
	
	private JButton[] rgoal=new JButton[5];
	private JButton[] bgoal=new JButton[5];
	private JButton[] ggoal=new JButton[5];
	private JButton[] ygoal=new JButton[5];
	
	
	private JButton centr;
	private javax.swing.JPanel red;
	private javax.swing.JPanel yellow;
	private javax.swing.JPanel blue;
	private javax.swing.JPanel green;
	private javax.swing.JPanel green11;
	
	private JButton redcou;
	private JButton bluecou;
	private JButton greencou;
	private JButton yellowcou;
	
	private JButton show;
	
	private JButton redpan;
	private JButton bluepan;
	private JButton greenpan;
	private JButton yellowpan;
	
	private JButton[] r1=new JButton[3];
	private JButton[] b1=new JButton[3];
	private JButton[] g1=new JButton[3];
	private JButton[] y1=new JButton[3];
	
	
	
	
	private JButton dice;
	private JButton pasa;
	private JButton next;
	private JButton red1;
	private JButton red2;
	private JButton red3;
	private JButton red4;
	private JButton blue1;
	private JButton blue2;
	private JButton blue3;
	private JButton blue4;
	private JButton green1;
	private JButton green2;
	private JButton green3;
	private JButton green4;
	private JButton yellow1;
	private JButton yellow2;
	private JButton yellow3;
	private JButton yellow4;
	
	
	private JButton r1path;
	private JButton r2path;
	private JButton r3path;
	private JButton r4path;
	private JButton b1path;
	private JButton b2path;
	private JButton b3path;
	private JButton b4path;
	private JButton g1path;
	private JButton g2path;
	private JButton g3path;
	private JButton g4path;
	private JButton y1path;
	private JButton y2path;
	private JButton y3path;
	private JButton y4path;
	
	
	
	
	public JButton xxx;
	int [] onestamp=new int[4];
	int [] twostamp=new int[4];
	int [] threestamp=new int[4];
	int [] fourstamp=new int[4];
	int [] fivestamp=new int[4];
	int [] sixstamp=new int [4];
	int [] sevenstamp=new int [4];
	int [] eightstamp=new int [4];
	
	int [] red1travel=new int[58];
	int [] red2travel=new int[58];
	int [] red3travel=new int[58];
	int [] red4travel=new int[58];
	int [] blue1travel=new int[58];
	int [] blue2travel=new int[58];
	int [] blue3travel=new int[58];
	int [] blue4travel=new int[58];
	int [] green1travel=new int[58];
	int [] green2travel=new int[58];
	int [] green3travel=new int[58];
	int [] green4travel=new int[58];
	int [] yellow1travel=new int[58];
	int [] yellow2travel=new int[58];
	int [] yellow3travel=new int[58];
	int [] yellow4travel=new int[58];
	
	
	
	int cour1;
	int cour2;
	int cour3;
	int cour4;
	int coub1;
	int coub2;
	int coub3;
	int coub4;
	int coug1;
	int coug2;
	int coug3;
	int coug4;
	int couy1;
	int couy2;
	int couy3;
	int couy4;
	
	
		
		
		
		
		
	


	
	public void setcomponent()
	{
	
		
		
		red=new javax.swing.JPanel();
		setLayout(null);
		red.setBounds(0,0,300,300);
		add(red);
		red.setBackground(Color.RED);
		
		
		
		blue=new javax.swing.JPanel();
		setLayout(null);
		blue.setBounds(0,450,300,300);
		add(blue);
		blue.setBackground(Color.BLUE);
		
		
		yellow=new javax.swing.JPanel();
		setLayout(null);
		yellow.setBounds(450,0,300,300);
		add(yellow);
		yellow.setBackground(Color.YELLOW);
		
		green=new javax.swing.JPanel();
		setLayout(null);
		green.setBounds(450,450,300,300);
		add(green);
		green.setBackground(Color.GREEN);
		
		
		for(int i=0;i<6;i++)
		{
			
		         squares[i]=new JButton();
		          setLayout(null);
		           squares[i].setBounds(50*i,300,50,50);
	              add(squares[i]);
				  squares[i].setBackground(colorblack);
		         //squares[i][j].setBounds(100,100,50,50);
			
		}
		for(int i=6;i<12;i++)
		{
			  int k=i-6;
		         squares[i]=new JButton();
		          setLayout(null);
		           squares[i].setBounds(300,250-50*k,50,50);
	              add(squares[i]);
				  squares[i].setBackground(colorblack);
		        
			
		}
		
		          squares[12]=new JButton();
		          setLayout(null);
		           squares[12].setBounds(350,0,50,50);
	              add(squares[12]);
				  squares[12].setBackground(colorblack);
		
		
		
		for(int i=13;i<19;i++)
		{
			  int k=i-13;
		         squares[i]=new JButton();
		          setLayout(null);
		           squares[i].setBounds(400,50*k,50,50);
	              add(squares[i]);
				  squares[i].setBackground(colorblack);
		     
		}
		
		
		for(int i=19;i<25;i++)
		{
			  int k=i-19;
		         squares[i]=new JButton();
		          setLayout(null);
		           squares[i].setBounds(450+50*k,300,50,50);
	              add(squares[i]);
				  squares[i].setBackground(colorblack);
		     
		}
		
		          squares[25]=new JButton();
		          setLayout(null);
		           squares[25].setBounds(700,350,50,50);
	              add(squares[25]);
				  squares[25].setBackground(colorblack);
		
		
		for(int i=26;i<32;i++)
		{
			  int k=i-26;
		         squares[i]=new JButton();
		          setLayout(null);
		           squares[i].setBounds(700-50*k,400,50,50);
	              add(squares[i]);
				  squares[i].setBackground(colorblack);
		     
		}
		
		for(int i=32;i<38;i++)
		{
			  int k=i-32;
		         squares[i]=new JButton();
		          setLayout(null);
		           squares[i].setBounds(400,450+50*k,50,50);
	              add(squares[i]);
				  squares[i].setBackground(colorblack);
		     
		}
		
		squares[38]=new JButton();
		          setLayout(null);
		           squares[38].setBounds(350,700,50,50);
	              add(squares[38]);
				  squares[38].setBackground(colorblack);
		
		
		for(int i=39;i<45;i++)
		{
			  int k=i-39;
		         squares[i]=new JButton();
		          setLayout(null);
		           squares[i].setBounds(300,700-50*k,50,50);
	              add(squares[i]);
				  squares[i].setBackground(colorblack);
		     
		}
		
				for(int i=45;i<51;i++)
		{
			  int k=i-45;
		         squares[i]=new JButton();
		          setLayout(null);
		           squares[i].setBounds(250-50*k,400,50,50);
	              add(squares[i]);
				  squares[i].setBackground(colorblack);
		     
		}
		
		squares[51]=new JButton();
		          setLayout(null);
		           squares[51].setBounds(0,350,50,50);
	              add(squares[51]);
				  squares[51].setBackground(colorblack);
				  
				  
				   
				 centr=new JButton();
                 setLayout(null);		 
	             centr.setBounds(300,300,150,150);
				 add(centr);
				 centr.setIcon(centre);
				 centr.setBorderPainted(false);
		
		squares[1].setBackground(Color.RED);
		squares[9].setBackground(Color.YELLOW);
		squares[14].setBackground(Color.YELLOW);
		squares[22].setBackground(Color.GREEN);
		squares[27].setBackground(Color.GREEN);
		squares[35].setBackground(Color.BLUE);
		squares[40].setBackground(Color.BLUE);
		squares[48].setBackground(Color.RED);
		
		
		
		
		
		
		for(int i=0;i<5;i++)
		{
			rgoal[i]=new JButton();
			setLayout(null);
			rgoal[i].setBounds(50+50*i,350,50,50);
			add(rgoal[i]);
			rgoal[i].setBackground(Color.RED);
		}
		
		for(int i=0;i<5;i++)
		{
			bgoal[i]=new JButton();
			setLayout(null);
			bgoal[i].setBounds(350,650-50*i,50,50);
			add(bgoal[i]);
			bgoal[i].setBackground(Color.BLUE);
		}
		
		for(int i=0;i<5;i++)
		{
			ygoal[i]=new JButton();
			setLayout(null);
			ygoal[i].setBounds(350,50+50*i,50,50);
			add(ygoal[i]);
			ygoal[i].setBackground(Color.YELLOW);
		}
		
		for(int i=0;i<5;i++)
		{
			ggoal[i]=new JButton();
			setLayout(null);
			ggoal[i].setBounds(650-50*i,350,50,50);
			add(ggoal[i]);
			ggoal[i].setBackground(Color.GREEN);
		}
		
		
	    pasa=new JButton("ThrowDice");
		setLayout(null);
		pasa.setBounds(800,460,120,30);
		add(pasa);
		pasa.setBackground(Color.RED);
		pasa.addActionListener(new Handler1());
		
		next=new JButton("NEXT");
		setLayout(null);
		next.setBounds(950,460,70,30);
		add(next);
		next.addActionListener(new Handler2());
		
		
		dice=new JButton();
		setLayout(null);
		dice.setBounds(810,350,100,100);
		add(dice);
		dice.setIcon(diceImag);
		
		
		redcou=new JButton("RED");
		setLayout(null);
		redcou.setBounds(920,55,80,20);
		add(redcou);
		redcou.setBackground(Color.RED);
		
		
		bluecou=new JButton("BLUE");
		setLayout(null);
		bluecou.setBounds(920,105,80,20);
		add(bluecou);
		//bluecou.setBackground(Color.GRAY);
		
		greencou=new JButton("GREEN");
		setLayout(null);
		greencou.setBounds(920,155,80,20);
		add(greencou);
		//greencou.setBackground(Color.GRAY);
		
		yellowcou=new JButton("YELLOW");
		setLayout(null);
		yellowcou.setBounds(920,205,80,20);
		add(yellowcou);
		//yellowcou.setBackground(Color.GRAY);

		
		for(int i=0;i<3;i++)
		{
			r1[i]=new JButton();
			setLayout(null);
			r1[i].setBounds(815+30*i,55,30,20);
			add(r1[i]);
			
		}
			
		for(int i=0;i<3;i++)
		{
			b1[i]=new JButton();
			setLayout(null);
			b1[i].setBounds(815+30*i,105,30,20);
			add(b1[i]);
		}
		for(int i=0;i<3;i++)
		{
			g1[i]=new JButton();
			setLayout(null);
			g1[i].setBounds(815+30*i,155,30,20);
			add(g1[i]);
		}
		for(int i=0;i<3;i++)
		{
			y1[i]=new JButton();
			setLayout(null);
			y1[i].setBounds(815+30*i,205,30,20);
			add(y1[i]);
		}
	//internal of red home
	red1=new JButton();
	red1.setBounds(80,80,50,50);
	add(red1);
	red1.setIcon(rball1);
	//red1.addActionListener(new Handlerhomer1());
	red2=new JButton();
	red2.setBounds(80,170,50,50);
	add(red2);
	red2.setIcon(rball2);
	//red2.addActionListener(new Handlerhomer2());
	red3=new JButton();
	red3.setBounds(170,170,50,50);
	add(red3);
	red3.setIcon(rball3);
	//red3.addActionListener(new Handlerhomer3());
	red4=new JButton();
	red4.setBounds(170,80,50,50);
	add(red4);
	red4.setIcon(rball4);
	//red4.addActionListener(new Handlerhomer4());
	
    //internal of blue home
	blue1=new JButton();
	blue1.setBounds(80,530,50,50);
	add(blue1);
	blue1.setIcon(bball1);
	//blue1.addActionListener(new Handlerhomeb1());
	blue2=new JButton();
	blue2.setBounds(80,620,50,50);
	add(blue2);
	blue2.setIcon(bball2);
	//blue2.addActionListener(new Handlerhomeb2());
	blue3=new JButton();
	blue3.setBounds(170,620,50,50);
	add(blue3);
	blue3.setIcon(bball3);
	//blue3.addActionListener(new Handlerhomeb3());
	blue4=new JButton();
	blue4.setBounds(170,530,50,50);
	add(blue4);
	blue4.setIcon(bball4);
	//blue4.addActionListener(new Handlerhomeb4());
	
	//internal of green home
	green1=new JButton();
	green1.setBounds(530,530,50,50);
	add(green1);
	green1.setIcon(gball1);
	//green1.addActionListener(new Handlerhomeg1());
	green2=new JButton();
	green2.setBounds(530,620,50,50);
	add(green2);
	green2.setIcon(gball2);
	//green2.addActionListener(new Handlerhomeg2());
	green3=new JButton();
	green3.setBounds(620,620,50,50);
	add(green3);
	green3.setIcon(gball3);
	//green3.addActionListener(new Handlerhomeg3());
	green4=new JButton();
	green4.setBounds(620,530,50,50);
	add(green4);
	green4.setIcon(gball4);
	//green4.addActionListener(new Handlerhomeg4());
	//internal of yellow home
	yellow1=new JButton();
	yellow1.setBounds(530,80,50,50);
	add(yellow1);
	yellow1.setIcon(yball1);
	//yellow1.addActionListener(new Handlerhomey1());
	yellow2=new JButton();
	yellow2.setBounds(530,170,50,50);
	add(yellow2);
	yellow2.setIcon(yball2);
	//yellow2.addActionListener(new Handlerhomey2());
	yellow3=new JButton();
	yellow3.setBounds(620,170,50,50);
	add(yellow3);
	yellow3.setIcon(yball3);
	//yellow3.addActionListener(new Handlerhomey3());
	yellow4=new JButton();
	yellow4.setBounds(620,80,50,50);
	add(yellow4);
	yellow4.setIcon(yball4);
	//yellow4.addActionListener(new Handlerhomey4());
	
	
	r1path=new JButton("1");
	r1path.setBounds(1050,55,50,20);
	add(r1path);
	r1path.addActionListener(new Handlerhomer1());
	r1path.setBackground(Color.RED);
	r2path=new JButton("2");
	r2path.setBounds(1100,55,50,20);
	add(r2path);
	r2path.addActionListener(new Handlerhomer2());
	r2path.setBackground(Color.RED);
	r3path=new JButton("3");
	r3path.setBounds(1150,55,50,20);
	add(r3path);
	r3path.addActionListener(new Handlerhomer3());
	r3path.setBackground(Color.RED);
	r4path=new JButton("4");
	r4path.setBounds(1200,55,50,20);
	add(r4path);
	r4path.addActionListener(new Handlerhomer4());
	r4path.setBackground(Color.RED);
	
	
	
	
	b1path=new JButton("1");
	b1path.setBounds(1050,105,50,20);
	add(b1path);
	b1path.addActionListener(new Handlerhomeb1());
	b1path.setBackground(Color.BLUE);
	b2path=new JButton("2");
	b2path.setBounds(1100,105,50,20);
	add(b2path);
	b2path.addActionListener(new Handlerhomeb2());
	b2path.setBackground(Color.BLUE);
	b3path=new JButton("3");
	b3path.setBounds(1150,105,50,20);
	add(b3path);
	b3path.addActionListener(new Handlerhomeb3());
	b3path.setBackground(Color.BLUE);
	b4path=new JButton("4");
	b4path.setBounds(1200,105,50,20);
	add(b4path);
	b4path.addActionListener(new Handlerhomeb4());
	b4path.setBackground(Color.BLUE);
	
	
	
	
	g1path=new JButton("1");
	g1path.setBounds(1050,155,50,20);
	add(g1path);
	g1path.addActionListener(new Handlerhomeg1());
	g1path.setBackground(Color.GREEN);
	g2path=new JButton("2");
	g2path.setBounds(1100,155,50,20);
	add(g2path);
	g2path.addActionListener(new Handlerhomeg2());
	g2path.setBackground(Color.GREEN);
	g3path=new JButton("3");
	g3path.setBounds(1150,155,50,20);
	add(g3path);
	g3path.addActionListener(new Handlerhomeg3());
	g3path.setBackground(Color.GREEN);
	g4path=new JButton("4");
	g4path.setBounds(1200,155,50,20);
	add(g4path);
	g4path.addActionListener(new Handlerhomeg4());
	g4path.setBackground(Color.GREEN);
	
	
	
	y1path=new JButton("1");
	y1path.setBounds(1050,205,50,20);
	add(y1path);
	y1path.addActionListener(new Handlerhomey1());
	y1path.setBackground(Color.YELLOW);
	y2path=new JButton("2");
	y2path.setBounds(1100,205,50,20);
	add(y2path);
	y2path.addActionListener(new Handlerhomey2());
	y2path.setBackground(Color.YELLOW);
	y3path=new JButton("3");
	y3path.setBounds(1150,205,50,20);
	add(y3path);
	y3path.addActionListener(new Handlerhomey3());
	y3path.setBackground(Color.YELLOW);
	y4path=new JButton("4");
	y4path.setBounds(1200,205,50,20);
	add(y4path);
	y4path.addActionListener(new Handlerhomey4());
	y4path.setBackground(Color.YELLOW);
	
	
	
	

     /*
	squares[1].addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                mice1(evt);
            }
			public void mouseExited(MouseEvent evt){
				miceout1(evt);
			}
        });
		*/

	}
	
	
	// HANDLER START.................
	// HANDLER START.................
	// HANDLER START.................
	
	int cou=0;
	int num=7;
	int[] rque=new int[3];
	int[] bque=new int[3];
	int[] gque=new int[3];
	int[] yque=new int[3];
	
	
	
	
	
	
	
	
	
//mice stamp 1



/*
        
        private void miceout1(java.awt.event.MouseEvent evt)
		{
			show.setIcon(null);
		}
		
		
        private void mice1(java.awt.event.MouseEvent evt)
		{
			
				if(onestamp[0]>0)
				{show.setIcon(rball);
				}
				Thread t2;
              t2=Thread.currentThread();
             try
                {
                         t2.sleep(100);
                   }
               catch(InterruptedException e2){}
				if(onestamp[1]>0)
				{show.setIcon(bball);
				}
				Thread t3;
          t3=Thread.currentThread();
        try
        {
            t3.sleep(100);
        }
        catch(InterruptedException e3){}
				if(onestamp[2]>0)
				{show.setIcon(gball);
				}
				Thread t4;
          t4=Thread.currentThread();
        try
        {
            t4.sleep(100);
        }
        catch(InterruptedException e4){}
				if(onestamp[3]>0)
				{show.setIcon(yball);
				}
			
		}
	

	*/

	
	//next button
	class Handler2 implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			k=0;
			x=0;
			       if(cou%4==0)
					{
						for(int i=0;i<3;i++)
						{r1[i].setIcon(null);
					     rque[i]=0;
					    }
						
						if(coub1==cour1||coub1==cour2||coub1==cour3||coub1==cour4)
						{
							if(coub1!=-1&&coub1!=1&&coub1!=9&&coub1!=14&&coub1!=22&&coub1!=27&&coub1!=35&&coub1!=40&&coub1!=48&&coub1!=52&&coub1!=53&&coub1!=54&&coub1!=55&&coub1!=56&&coub1!=57)
							{
								blue1travel[coub1]=0;
								coub1=-1;
								blue1.setIcon(bball1);
							}
						}
						if(coub2==cour1||coub2==cour2||coub2==cour3||coub2==cour4)
						{
							if(coub2!=-1&&coub2!=1&&coub2!=9&&coub2!=14&&coub2!=22&&coub2!=27&&coub2!=35&&coub2!=40&&coub2!=48&&coub2!=52&&coub2!=53&&coub2!=54&&coub2!=55&&coub2!=56&&coub2!=57)
							{
								blue2travel[coub2]=0;
								coub2=-1;
								blue2.setIcon(bball2);
							}
						}
						if(coub3==cour1||coub3==cour2||coub3==cour3||coub3==cour4)
						{
							if(coub3!=-1&&coub3!=1&&coub3!=9&&coub3!=14&&coub3!=22&&coub3!=27&&coub3!=35&&coub3!=40&&coub3!=48&&coub3!=52&&coub3!=53&&coub3!=54&&coub3!=55&&coub3!=56&&coub3!=57)
							{
								blue3travel[coub3]=0;
								coub3=-1;
								blue3.setIcon(bball3);
							}
						}
						if(coub4==cour1||coub4==cour2||coub4==cour3||coub4==cour4)
						{
							if(coub4!=-1&&coub4!=1&&coub4!=9&&coub4!=14&&coub4!=22&&coub4!=27&&coub4!=35&&coub4!=40&&coub4!=48&&coub4!=52&&coub4!=53&&coub4!=54&&coub4!=55&&coub4!=56&&coub4!=57)
							{
								blue4travel[coub4]=0;
								coub4=-1;
								blue4.setIcon(bball4);
							}
						}
						
						
						if(coug1==cour1||coug1==cour2||coug1==cour3||coug1==cour4)
						{
							if(coug1!=-1&&coug1!=1&&coug1!=9&&coug1!=14&&coug1!=22&&coug1!=27&&coug1!=35&&coug1!=40&&coug1!=48&&coug1!=52&&coug1!=53&&coug1!=54&&coug1!=55&&coug1!=56&&coug1!=57)
							{
								green1travel[coug1]=0;
								coug1=-1;
								green1.setIcon(gball1);
							}
						}
						if(coug2==cour1||coug2==cour2||coug2==cour3||coug2==cour4)
						{
							if(coug2!=-1&&coug2!=1&&coug2!=9&&coug2!=14&&coug2!=22&&coug2!=27&&coug2!=35&&coug2!=40&&coug2!=48&&coug2!=52&&coug2!=53&&coug2!=54&&coug2!=55&&coug2!=56&&coug2!=57)
							{
								green2travel[coug2]=0;
								coug2=-1;
								green2.setIcon(gball2);
							}
						}if(coug3==cour1||coug3==cour2||coug3==cour3||coug3==cour4)
						{
							if(coug3!=-1&&coug3!=1&&coug3!=9&&coug3!=14&&coug3!=22&&coug3!=27&&coug3!=35&&coug3!=40&&coug3!=48&&coug3!=52&&coug3!=53&&coug3!=54&&coug3!=55&&coug3!=56&&coug3!=57)
							{
								green3travel[coug3]=0;
								coug3=-1;
								green3.setIcon(gball3);
							}
						}if(coug4==cour1||coug4==cour2||coug4==cour3||coug4==cour4)
						{
							if(coug4!=-1&&coug4!=1&&coug4!=9&&coug4!=14&&coug4!=22&&coug4!=27&&coug4!=35&&coug4!=40&&coug4!=48&&coug4!=52&&coug4!=53&&coug4!=54&&coug4!=55&&coug4!=56&&coug4!=57)
							{
								green4travel[coug4]=0;
								coug4=-1;
								green4.setIcon(gball4);
							}
						}
						
						
						if(couy1==cour1||couy1==cour2||couy1==cour3||couy1==cour4)
						{
							if(couy1!=-1&&couy1!=1&&couy1!=9&&couy1!=14&&couy1!=22&&couy1!=27&&couy1!=35&&couy1!=40&&couy1!=48&&couy1!=52&&couy1!=53&&couy1!=54&&couy1!=55&&couy1!=56&&couy1!=57)
							{
								yellow1travel[couy1]=0;
								couy1=-1;
								yellow1.setIcon(gball1);
							}
						}
						if(couy2==cour1||couy2==cour2||couy2==cour3||couy2==cour4)
						{
							if(couy2!=-1&&couy2!=1&&couy2!=9&&couy2!=14&&couy2!=22&&couy2!=27&&couy2!=35&&couy2!=40&&couy2!=48&&couy2!=52&&couy2!=53&&couy2!=54&&couy2!=55&&couy2!=56&&couy2!=57)
							{
								yellow2travel[couy2]=0;
								couy2=-1;
								yellow2.setIcon(gball2);
							}
						}
						if(couy3==cour1||couy3==cour2||couy3==cour3||couy3==cour4)
						{
							if(couy3!=-1&&couy3!=1&&couy3!=9&&couy3!=14&&couy3!=22&&couy3!=27&&couy3!=35&&couy3!=40&&couy3!=48&&couy3!=52&&couy3!=53&&couy3!=54&&couy3!=55&&couy3!=56&&couy3!=57)
							{
								yellow3travel[coub3]=0;
								coub3=-1;
								yellow3.setIcon(gball3);
							}
						}
						if(couy4==cour1||couy4==cour2||couy4==cour3||couy4==cour4)
						{
							if(couy4!=-1&&couy4!=1&&couy4!=9&&couy4!=14&&couy4!=22&&couy4!=27&&couy4!=35&&couy4!=40&&couy4!=48&&couy4!=52&&couy4!=53&&couy4!=54&&couy4!=55&&couy4!=56&&couy4!=57)
							{
								yellow4travel[couy4]=0;
								couy4=-1;
								yellow4.setIcon(gball4);
							}
						}
						
						
						
					}
					if(cou%4==1)
					{
						for(int i=0;i<3;i++)
						{b1[i].setIcon(null);
					     bque[i]=0;
						}
						
						
						
						if(cour1==coub1||cour1==coub2||cour1==coub3||cour1==coub4)
						{
							if(cour1!=-1&&cour1!=1&&cour1!=9&&cour1!=14&&cour1!=22&&cour1!=27&&cour1!=35&&cour1!=40&&cour1!=48&&cour1!=52&&cour1!=53&&cour1!=54&&cour1!=55&&cour1!=56&&cour1!=57)
							{
								red1travel[cour1]=0;
								cour1=-1;
								red1.setIcon(rball1);
							}
						}
						if(cour2==coub1||cour2==coub2||cour2==coub3||cour2==coub4)
						{
							if(cour2!=-1&&cour2!=1&&cour2!=9&&cour2!=14&&cour2!=22&&cour2!=27&&cour2!=35&&cour2!=40&&cour2!=48&&cour2!=52&&cour2!=53&&cour2!=54&&cour2!=55&&cour2!=56&&cour2!=57)
							{
								red2travel[cour2]=0;
								cour2=-1;
								red2.setIcon(rball2);
							}
						}
						if(cour3==coub1||cour3==coub2||cour3==coub3||cour3==coub4)
						{
							if(cour3!=-1&&cour3!=1&&cour3!=9&&cour3!=14&&cour3!=22&&cour3!=27&&cour3!=35&&cour3!=40&&cour3!=48&&cour3!=52&&cour3!=53&&cour3!=54&&cour3!=55&&cour3!=56&&cour3!=57)
							{
								red3travel[cour3]=0;
								cour3=-1;
								red3.setIcon(rball3);
							}
						}
						if(cour4==coub1||cour4==coub2||cour4==coub3||cour4==coub4)
						{
							if(cour4!=-1&&cour4!=1&&cour4!=9&&cour4!=14&&cour4!=22&&cour4!=27&&cour4!=35&&cour4!=40&&cour4!=48&&cour4!=52&&cour4!=53&&cour4!=54&&cour4!=55&&cour4!=56&&cour4!=57)
							{
								red4travel[cour4]=0;
								cour4=-1;
								red4.setIcon(rball4);
							}
						}
						
						
						if(coug1==coub1||coug1==coub2||coug1==coub3||coug1==coub4)
						{
							if(coug1!=-1&&coug1!=1&&coug1!=9&&coug1!=14&&coug1!=22&&coug1!=27&&coug1!=35&&coug1!=40&&coug1!=48&&coug1!=52&&coug1!=53&&coug1!=54&&coug1!=55&&coug1!=56&&coug1!=57)
							{
								green1travel[coug1]=0;
								coug1=-1;
								green1.setIcon(gball1);
							}
						}
						if(coug2==coub1||coug2==coub2||coug2==coub3||coug2==coub4)
						{
							if(coug2!=-1&&coug2!=1&&coug2!=9&&coug2!=14&&coug2!=22&&coug2!=27&&coug2!=35&&coug2!=40&&coug2!=48&&coug2!=52&&coug2!=53&&coug2!=54&&coug2!=55&&coug2!=56&&coug2!=57)
							{
								green2travel[coug2]=0;
								coug2=-1;
								green2.setIcon(gball2);
							}
						}if(coug3==coub1||coug3==coub2||coug3==coub3||coug3==coub4)
						{
							if(coug3!=-1&&coug3!=1&&coug3!=9&&coug3!=14&&coug3!=22&&coug3!=27&&coug3!=35&&coug3!=40&&coug3!=48&&coug3!=52&&coug3!=53&&coug3!=54&&coug3!=55&&coug3!=56&&coug3!=57)
							{
								green3travel[coug3]=0;
								coug3=-1;
								green3.setIcon(gball3);
							}
						}if(coug4==coub1||coug4==coub2||coug4==coub3||coug4==coub4)
						{
							if(coug4!=-1&&coug4!=1&&coug4!=9&&coug4!=14&&coug4!=22&&coug4!=27&&coug4!=35&&coug4!=40&&coug4!=48&&coug4!=52&&coug4!=53&&coug4!=54&&coug4!=55&&coug4!=56&&coug4!=57)
							{
								green4travel[coug4]=0;
								coug4=-1;
								green4.setIcon(gball4);
							}
						}
						
						
						if(couy1==coub1||couy1==coub2||couy1==coub3||couy1==coub4)
						{
							if(couy1!=-1&&couy1!=1&&couy1!=9&&couy1!=14&&couy1!=22&&couy1!=27&&couy1!=35&&couy1!=40&&couy1!=48&&couy1!=52&&couy1!=53&&couy1!=54&&couy1!=55&&couy1!=56&&couy1!=57)
							{
								yellow1travel[couy1]=0;
								couy1=-1;
								yellow1.setIcon(gball1);
							}
						}
						if(couy2==coub1||couy2==coub2||couy2==coub3||couy2==coub4)
						{
							if(couy2!=-1&&couy2!=1&&couy2!=9&&couy2!=14&&couy2!=22&&couy2!=27&&couy2!=35&&couy2!=40&&couy2!=48&&couy2!=52&&couy2!=53&&couy2!=54&&couy2!=55&&couy2!=56&&couy2!=57)
							{
								yellow2travel[couy2]=0;
								couy2=-1;
								yellow2.setIcon(gball2);
							}
						}
						if(couy3==coub1||couy3==coub2||couy3==coub3||couy3==coub4)
						{
							if(couy3!=-1&&couy3!=1&&couy3!=9&&couy3!=14&&couy3!=22&&couy3!=27&&couy3!=35&&couy3!=40&&couy3!=48&&couy3!=52&&couy3!=53&&couy3!=54&&couy3!=55&&couy3!=56&&couy3!=57)
							{
								yellow3travel[coub3]=0;
								coub3=-1;
								yellow3.setIcon(gball3);
							}
						}
						if(couy4==coub1||couy4==coub2||couy4==coub3||couy4==coub4)
						{
							if(couy4!=-1&&couy4!=1&&couy4!=9&&couy4!=14&&couy4!=22&&couy4!=27&&couy4!=35&&couy4!=40&&couy4!=48&&couy4!=52&&couy4!=53&&couy4!=54&&couy4!=55&&couy4!=56&&couy4!=57)
							{
								yellow4travel[couy4]=0;
								couy4=-1;
								yellow4.setIcon(gball4);
							}
						}
						
						
						
						
						
						
						
						
					}
					if(cou%4==2)
					{
						for(int i=0;i<3;i++)
						{g1[i].setIcon(null);
					     gque[i]=0;
						}
						
						
						
						if(cour1==coug1||cour1==coug2||cour1==coug3||cour1==coug4)
						{
							if(cour1!=-1&&cour1!=1&&cour1!=9&&cour1!=14&&cour1!=22&&cour1!=27&&cour1!=35&&cour1!=40&&cour1!=48&&cour1!=52&&cour1!=53&&cour1!=54&&cour1!=55&&cour1!=56&&cour1!=57)
							{
								red1travel[cour1]=0;
								cour1=-1;
								red1.setIcon(rball1);
							}
						}
						if(cour2==coug1||cour2==coug2||cour2==coug3||cour2==coug4)
						{
							if(cour2!=-1&&cour2!=1&&cour2!=9&&cour2!=14&&cour2!=22&&cour2!=27&&cour2!=35&&cour2!=40&&cour2!=48&&cour2!=52&&cour2!=53&&cour2!=54&&cour2!=55&&cour2!=56&&cour2!=57)
							{
								red2travel[cour2]=0;
								cour2=-1;
								red2.setIcon(rball2);
							}
						}
						if(cour3==coug1||cour3==coug2||cour3==coug3||cour3==coug4)
						{
							if(cour3!=-1&&cour3!=1&&cour3!=9&&cour3!=14&&cour3!=22&&cour3!=27&&cour3!=35&&cour3!=40&&cour3!=48&&cour3!=52&&cour3!=53&&cour3!=54&&cour3!=55&&cour3!=56&&cour3!=57)
							{
								red3travel[cour3]=0;
								cour3=-1;
								red3.setIcon(rball3);
							}
						}
						if(cour4==coug1||cour4==coug2||cour4==coug3||cour4==coug4)
						{
							if(cour4!=-1&&cour4!=1&&cour4!=9&&cour4!=14&&cour4!=22&&cour4!=27&&cour4!=35&&cour4!=40&&cour4!=48&&cour4!=52&&cour4!=53&&cour4!=54&&cour4!=55&&cour4!=56&&cour4!=57)
							{
								red4travel[cour4]=0;
								cour4=-1;
								red4.setIcon(rball4);
							}
						}
						
						
						if(coub1==coug1||coub1==coug2||coub1==coug3||coub1==coug4)
						{
							if(coub1!=-1&&coub1!=1&&coub1!=9&&coub1!=14&&coub1!=22&&coub1!=27&&coub1!=35&&coub1!=40&&coub1!=48&&coub1!=52&&coub1!=53&&coub1!=54&&coub1!=55&&coub1!=56&&coub1!=57)
							{
								blue1travel[coub1]=0;
								coub1=-1;
								blue1.setIcon(bball1);
							}
						}
						if(coub2==coug1||coub2==coug2||coub2==coug3||coub2==coug4)
						{
							if(coub2!=-1&&coub2!=1&&coub2!=9&&coub2!=14&&coub2!=22&&coub2!=27&&coub2!=35&&coub2!=40&&coub2!=48&&coub2!=52&&coub2!=53&&coub2!=54&&coub2!=55&&coub2!=56&&coub2!=57)
							{
								blue2travel[coub2]=0;
								coub2=-1;
								blue2.setIcon(bball2);
							}
						}if(coub3==coug1||coub3==coug2||coub3==coug3||coub3==coug4)
						{
							if(coub3!=-1&&coub3!=1&&coub3!=9&&coub3!=14&&coub3!=22&&coub3!=27&&coub3!=35&&coub3!=40&&coub3!=48&&coub3!=52&&coub3!=53&&coub3!=54&&coub3!=55&&coub3!=56&&coub3!=57)
							{
								blue3travel[coub3]=0;
								coub3=-1;
								blue3.setIcon(bball3);
							}
						}if(coub4==coug1||coub4==coug2||coub4==coug3||coub4==coug4)
						{
							if(coub4!=-1&&coub4!=1&&coub4!=9&&coub4!=14&&coub4!=22&&coub4!=27&&coub4!=35&&coub4!=40&&coub4!=48&&coub4!=52&&coub4!=53&&coub4!=54&&coub4!=55&&coub4!=56&&coub4!=57)
							{
								blue4travel[coub4]=0;
								coub4=-1;
								blue4.setIcon(bball4);
							}
						}
						
						
						
						if(couy1==coug1||couy1==coug2||couy1==coug3||couy1==coug4)
						{
							if(couy1!=-1&&couy1!=1&&couy1!=9&&couy1!=14&&couy1!=22&&couy1!=27&&couy1!=35&&couy1!=40&&couy1!=48&&couy1!=52&&couy1!=53&&couy1!=54&&couy1!=55&&couy1!=56&&couy1!=57)
							{
								yellow1travel[couy1]=0;
								couy1=-1;
								yellow1.setIcon(yball1);
							}
						}
						if(couy2==coug1||couy2==coug2||couy2==coug3||couy2==coug4)
						{
							if(couy2!=-1&&couy2!=1&&couy2!=9&&couy2!=14&&couy2!=22&&couy2!=27&&couy2!=35&&couy2!=40&&couy2!=48&&couy2!=52&&couy2!=53&&couy2!=54&&couy2!=55&&couy2!=56&&couy2!=57)
							{
								yellow2travel[couy2]=0;
								couy2=-1;
								yellow2.setIcon(yball2);
							}
						}
						if(couy3==coug1||couy3==coug2||couy3==coug3||couy3==coug4)
						{
							if(couy3!=-1&&couy3!=1&&couy3!=9&&couy3!=14&&couy3!=22&&couy3!=27&&couy3!=35&&couy3!=40&&couy3!=48&&couy3!=52&&couy3!=53&&couy3!=54&&couy3!=55&&couy3!=56&&couy3!=57)
							{
								yellow3travel[couy3]=0;
								couy3=-1;
								yellow3.setIcon(yball3);
							}
						}
						if(couy4==coug1||couy4==coug2||couy4==coug3||couy4==coug4)
						{
							if(couy4!=-1&&couy4!=1&&couy4!=9&&couy4!=14&&couy4!=22&&couy4!=27&&couy4!=35&&couy4!=40&&couy4!=48&&couy4!=52&&couy4!=53&&couy4!=54&&couy4!=55&&couy4!=56&&couy4!=57)
							{
								yellow4travel[couy4]=0;
								couy4=-1;
								yellow4.setIcon(yball4);
							}
						}
						
						
						
						
					}
					if(cou%4==3)
					{
						for(int i=0;i<3;i++)
						{y1[i].setIcon(null);
					     yque[i]=0;
						}
						
						
						
						if(cour1==couy1||cour1==couy2||cour1==couy3||cour1==couy4)
						{
							if(cour1!=-1&&cour1!=1&&cour1!=9&&cour1!=14&&cour1!=22&&cour1!=27&&cour1!=35&&cour1!=40&&cour1!=48&&cour1!=52&&cour1!=53&&cour1!=54&&cour1!=55&&cour1!=56&&cour1!=57)
							{
								red1travel[cour1]=0;
								cour1=-1;
								red1.setIcon(rball1);
							}
						}
						if(cour2==couy1||cour2==couy2||cour2==couy3||cour2==couy4)
						{
							if(cour2!=-1&&cour2!=1&&cour2!=9&&cour2!=14&&cour2!=22&&cour2!=27&&cour2!=35&&cour2!=40&&cour2!=48&&cour2!=52&&cour2!=53&&cour2!=54&&cour2!=55&&cour2!=56&&cour2!=57)
							{
								red2travel[cour2]=0;
								cour2=-1;
								red2.setIcon(rball2);
							}
						}
						if(cour3==couy1||cour3==couy2||cour3==couy3||cour3==couy4)
						{
							if(cour3!=-1&&cour3!=1&&cour3!=9&&cour3!=14&&cour3!=22&&cour3!=27&&cour3!=35&&cour3!=40&&cour3!=48&&cour3!=52&&cour3!=53&&cour3!=54&&cour3!=55&&cour3!=56&&cour3!=57)
							{
								red3travel[cour3]=0;
								cour3=-1;
								red3.setIcon(rball3);
							}
						}
						if(cour4==couy1||cour4==couy2||cour4==couy3||cour4==couy4)
						{
							if(cour4!=-1&&cour4!=1&&cour4!=9&&cour4!=14&&cour4!=22&&cour4!=27&&cour4!=35&&cour4!=40&&cour4!=48&&cour4!=52&&cour4!=53&&cour4!=54&&cour4!=55&&cour4!=56&&cour4!=57)
							{
								red4travel[cour4]=0;
								cour4=-1;
								red4.setIcon(rball4);
							}
						}
						
						
						if(coug1==couy1||coug1==couy2||coug1==couy3||coug1==couy4)
						{
							if(coug1!=-1&&coug1!=1&&coug1!=9&&coug1!=14&&coug1!=22&&coug1!=27&&coug1!=35&&coug1!=40&&coug1!=48&&coug1!=52&&coug1!=53&&coug1!=54&&coug1!=55&&coug1!=56&&coug1!=57)
							{
								green1travel[coug1]=0;
								coug1=-1;
								green1.setIcon(gball1);
							}
						}
						if(coug2==couy1||coug2==couy2||coug2==couy3||coug2==couy4)
						{
							if(coug2!=-1&&coug2!=1&&coug2!=9&&coug2!=14&&coug2!=22&&coug2!=27&&coug2!=35&&coug2!=40&&coug2!=48&&coug2!=52&&coug2!=53&&coug2!=54&&coug2!=55&&coug2!=56&&coug2!=57)
							{
								green2travel[coug2]=0;
								coug2=-1;
								green2.setIcon(gball2);
							}
						}if(coug3==couy1||coug3==couy2||coug3==couy3||coug3==couy4)
						{
							if(coug3!=-1&&coug3!=1&&coug3!=9&&coug3!=14&&coug3!=22&&coug3!=27&&coug3!=35&&coug3!=40&&coug3!=48&&coug3!=52&&coug3!=53&&coug3!=54&&coug3!=55&&coug3!=56&&coug3!=57)
							{
								green3travel[coug3]=0;
								coug3=-1;
								green3.setIcon(gball3);
							}
						}if(coug4==couy1||coug4==couy2||coug4==couy3||coug4==couy4)
						{
							if(coug4!=-1&&coug4!=1&&coug4!=9&&coug4!=14&&coug4!=22&&coug4!=27&&coug4!=35&&coug4!=40&&coug4!=48&&coug4!=52&&coug4!=53&&coug4!=54&&coug4!=55&&coug4!=56&&coug4!=57)
							{
								green4travel[coug4]=0;
								coug4=-1;
								green4.setIcon(gball4);
							}
						}
						
						
						if(coub1==couy1||coub1==couy2||coub1==couy3||coub1==couy4)
						{
							if(coub1!=-1&&coub1!=1&&coub1!=9&&coub1!=14&&coub1!=22&&coub1!=27&&coub1!=35&&coub1!=40&&coub1!=48&&coub1!=52&&coub1!=53&&coub1!=54&&coub1!=55&&coub1!=56&&coub1!=57)
							{
								blue1travel[coub1]=0;
								coub1=-1;
								blue1.setIcon(bball1);
							}
						}
						if(coub2==couy1||coub2==couy2||coub2==couy3||coub2==couy4)
						{
							if(coub2!=-1&&coub2!=1&&coub2!=9&&coub2!=14&&coub2!=22&&coub2!=27&&coub2!=35&&coub2!=40&&coub2!=48&&coub2!=52&&coub2!=53&&coub2!=54&&coub2!=55&&coub2!=56&&coub2!=57)
							{
								blue2travel[coub2]=0;
								coub2=-1;
								blue2.setIcon(bball2);
							}
						}
						if(coub3==couy1||coub3==couy2||coub3==couy3||coub3==couy4)
						{
							if(coub3!=-1&&coub3!=1&&coub3!=9&&coub3!=14&&coub3!=22&&coub3!=27&&coub3!=35&&coub3!=40&&coub3!=48&&coub3!=52&&coub3!=53&&coub3!=54&&coub3!=55&&coub3!=56&&coub3!=57)
							{
								blue3travel[coub3]=0;
								coub3=-1;
								blue3.setIcon(bball3);
							}
						}
						if(coub4==couy1||coub4==couy2||coub4==couy3||coub4==couy4)
						{
							if(coub4!=-1&&coub4!=1&&coub4!=9&&coub4!=14&&coub4!=22&&coub4!=27&&coub4!=35&&coub4!=40&&coub4!=48&&coub4!=52&&coub4!=53&&coub4!=54&&coub4!=55&&coub4!=56&&coub4!=57)
							{
								blue4travel[coub4]=0;
								coub4=-1;
								blue4.setIcon(bball4);
							}
						}
						
						
						
						
						
						
						
						
					}
			cou++;
			num=7;
			dice.setIcon(diceImag);
			
			    if(cou%4==0)
				{cou=0;
					pasa.setBackground(Color.RED);
					redcou.setBackground(Color.RED);
					bluecou.setBackground(null);
					greencou.setBackground(null);
					yellowcou.setBackground(null);
				    
			    }
				if(cou%4==1)
				{pasa.setBackground(Color.BLUE);
			     redcou.setBackground(null);
				 bluecou.setBackground(Color.BLUE);
				 greencou.setBackground(null);
				 yellowcou.setBackground(null);
				 
				}
				if(cou%4==2)
				{pasa.setBackground(Color.GREEN);
			     redcou.setBackground(null);
				 bluecou.setBackground(null);
				 greencou.setBackground(Color.GREEN);
				 yellowcou.setBackground(null);
				 
				}
				if(cou%4==3)
				{pasa.setBackground(Color.YELLOW);
			     redcou.setBackground(null);
				 bluecou.setBackground(null);
				 greencou.setBackground(null);
				 yellowcou.setBackground(Color.YELLOW);
				 
				}
		}
	}
	
	
	
	int k=0;
	
	//throw dice 
	class Handler1 implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			Thread t1;
          t1=Thread.currentThread();
        try
        {
            t1.sleep(500);
        }
        catch(InterruptedException e1){}
			
			if(num>=6){
			Random dic=new Random();
			num=1+dic.nextInt(10);
			if(num==1)
			{dice.setIcon(one);
		
		      if(cou%4==0)
			  {r1[k].setIcon(on1);
		       rque[k]=num;
			  }
			  if(cou%4==1)
			  {b1[k].setIcon(on1);
		        bque[k]=num;
			    }
			  if(cou%4==2)
			  {g1[k].setIcon(on1);
		        gque[k]=num;
			  }
			  if(cou%4==3)
			  {y1[k].setIcon(on1);
		        yque[k]=num;
			  }
			}
			if(num==2)
			{dice.setIcon(two);
		     if(cou%4==0)
			 {r1[k].setIcon(to1);
		      rque[k]=num;
			 }
			  if(cou%4==1)
			  {  b1[k].setIcon(to1);
		          bque[k]=num;
		      }
			  if(cou%4==2)
			  { g1[k].setIcon(to1);
		        gque[k]=num;
		      }
			  if(cou%4==3)
			  { y1[k].setIcon(to1);
		         yque[k]=num;
		      }
			}
			if(num==3)
			{dice.setIcon(three);
		     if(cou%4==0)
			 {r1[k].setIcon(th1);
		       rque[k]=num;
		     }
			  if(cou%4==1)
			  {b1[k].setIcon(th1);
		        bque[k]=num;
		      }
			  if(cou%4==2)
			  {g1[k].setIcon(th1);
		          gque[k]=num;
		      }
			  if(cou%4==3)
			  {y1[k].setIcon(th1);
		       yque[k]=num;
		      }
			}
			if(num==4)
			{	dice.setIcon(four);
		     if(cou%4==0)
			 {r1[k].setIcon(fo1);
		       rque[k]=num;
		      }
			  if(cou%4==1)
			  { b1[k].setIcon(fo1);
		        bque[k]=num;
		       }
			  if(cou%4==2)
			  {g1[k].setIcon(fo1);
				gque[k]=num;
		       }
			  if(cou%4==3)
			  { y1[k].setIcon(fo1);
		        yque[k]=num;
		       }
			}
			if(num==5)
			{	dice.setIcon(five);
		     if(cou%4==0)
			 {r1[k].setIcon(fi1);
				rque[k]=num;
		      }
			  if(cou%4==1)
			  { b1[k].setIcon(fi1);
		          bque[k]=num;
		       }
			  if(cou%4==2)
			  { g1[k].setIcon(fi1);
		         gque[k]=num;
		       }
			  if(cou%4==3)
			  {y1[k].setIcon(fi1);
		        yque[k]=num;
		       }
			}
			if(num>=6)
			{	dice.setIcon(six);
		      if(cou%4==0)
			  {r1[k].setIcon(si1);
				rque[k]=6;
		       }
			  if(cou%4==1)
			  { b1[k].setIcon(si1);
		        bque[k]=6;
		      }
			  if(cou%4==2)
			  {g1[k].setIcon(si1);
		        gque[k]=6;
		       }
			  if(cou%4==3)
			  { y1[k].setIcon(si1);
		        yque[k]=6;
		       }
			}
			
			k++;
			if(k==3)
			{
				k=0;
				if(num>=6)
				{
					if(cou%4==0)
					{
						for(int i=0;i<3;i++)
						{r1[i].setIcon(null);
					       rque[i]=0;
						}
					}
					if(cou%4==1)
					{
						for(int i=0;i<3;i++)
						{b1[i].setIcon(null);
							bque[i]=0;
						}
					}
					if(cou%4==2)
					{
						for(int i=0;i<3;i++)
						{g1[i].setIcon(null);
							gque[i]=0;
						}
					}
					if(cou%4==3)
					{
						for(int i=0;i<3;i++)
						{y1[i].setIcon(null);
							yque[i]=0;
						}
					}
				}
			}
		}
			
			
		}
		
	}
	int x=0;
	
	class Handlerhomer1 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(rque[x]==6)
			{   if(cour1==-1)
				{
					red1.setIcon(null);
					cour1=1;
					red1travel[cour1]=1;
					squares[cour1].setIcon(rball1);
					x++;
				}
				
				else
				{
					if(cour1+6<=57)
					{
					red1travel[cour1]=0;
					squares[cour1].setIcon(null);
					cour1=cour1+6;
					red1travel[cour1]=1;
					if(cour1>51)
					{
						if(cour1!=57)
						rgoal[cour1-52].setIcon(rball1);
					}
					else
					{
					squares[cour1].setIcon(rball1);
					}
					x++;
					}
				}
			}
			else
			{
				if(cour1!=-1&&cour1+rque[x]<=57)
				{
					red1travel[cour1]=0;
					if(cour1>51)
					rgoal[cour1-52].setIcon(null);
					else
					squares[cour1].setIcon(null);
				
				
					cour1=cour1+rque[x];
					red1travel[cour1]=1;
					if(cour1>51)
					{
						   if(cour1!=57)
							rgoal[cour1-52].setIcon(rball1);
					}
					else
					{
					squares[cour1].setIcon(rball1);
					}
					x++;
				}
				
			}
			
		}
			
		}
		
		
		class Handlerhomer2 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(rque[x]==6)
			{   if(cour2==-1)
				{
					red2.setIcon(null);
					cour2=1;
					red2travel[cour2]=1;
					squares[cour2].setIcon(rball2);
					x++;
				}
				
				else
				{
					if(cour2+6<=57)
					{
					red2travel[cour2]=0;
					squares[cour2].setIcon(null);
					cour2=cour2+6;
					red2travel[cour2]=1;
					if(cour2>51)
					{
						if(cour2!=57)
						rgoal[cour2-52].setIcon(rball2);
					}
					else
					{
					squares[cour2].setIcon(rball2);
					}
					x++;
					}
				}
			}
			else
			{
				if(cour2!=-1&&cour2+rque[x]<=57)
				{
					red2travel[cour2]=0;
					if(cour2>51)
					rgoal[cour2-52].setIcon(null);
					else
					squares[cour2].setIcon(null);
				
				
					cour2=cour2+rque[x];
					red2travel[cour2]=1;
					if(cour2>51)
					{
						   if(cour2!=57)
							rgoal[cour2-52].setIcon(rball2);
					}
					else
					{
					squares[cour2].setIcon(rball2);
					}
					x++;
				}
				
			}
			
		}
			
		}
		
		
		class Handlerhomer3 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(rque[x]==6)
			{   if(cour3==-1)
				{
					red3.setIcon(null);
					cour3=1;
					red3travel[cour3]=1;
					squares[cour3].setIcon(rball3);
					x++;
				}
				
				else
				{
					if(cour3+6<=57)
					{
					red3travel[cour3]=0;
					squares[cour3].setIcon(null);
					cour3=cour3+6;
					red3travel[cour3]=1;
					if(cour3>51)
					{
						if(cour3!=57)
						rgoal[cour3-52].setIcon(rball3);
					}
					else
					{
					squares[cour3].setIcon(rball3);
					}
					x++;
					}
				}
			}
			else
			{
				if(cour3!=-1&&cour3+rque[x]<=57)
				{
					red3travel[cour3]=0;
					if(cour3>51)
					rgoal[cour3-52].setIcon(null);
					else
					squares[cour3].setIcon(null);
				
				
					cour3=cour3+rque[x];
					red3travel[cour3]=1;
					if(cour3>51)
					{
						   if(cour3!=57)
							rgoal[cour3-52].setIcon(rball3);
					}
					else
					{
					squares[cour3].setIcon(rball3);
					}
					x++;
				}
				
			}
			
		}
			
		}
		
		
		
		class Handlerhomer4 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(rque[x]==6)
			{   if(cour4==-1)
				{
					red4.setIcon(null);
					cour4=1;
					red4travel[cour4]=1;
					squares[cour4].setIcon(rball4);
					x++;
				}
				
				else
				{
					if(cour4+6<=57)
					{
					red4travel[cour4]=0;
					squares[cour4].setIcon(null);
					cour4=cour4+6;
					red4travel[cour4]=1;
					if(cour4>51)
					{
						if(cour4!=57)
						rgoal[cour4-52].setIcon(rball4);
					}
					else
					{
					squares[cour4].setIcon(rball4);
					}
					x++;
					}
				}
			}
			else
			{
				if(cour4!=-1&&cour4+rque[x]<=57)
				{
					red4travel[cour4]=0;
					if(cour4>51)
					rgoal[cour4-52].setIcon(null);
					else
					squares[cour4].setIcon(null);
				
				
					cour4=cour4+rque[x];
					red4travel[cour4]=1;
					if(cour4>51)
					{
						   if(cour4!=57)
							rgoal[cour4-52].setIcon(rball4);
					}
					else
					{
					squares[cour4].setIcon(rball4);
					}
					x++;
				}
				
			}
			
		}
			
		}
	
	
	
	
	
	
	
	class Handlerhomeb1 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(bque[x]==6)
			{   if(coub1==-1)
				{
					blue1.setIcon(null);
					coub1=40;
					blue1travel[coub1]=1;
					squares[coub1].setIcon(bball1);
					x++;
				}
				
				else
				{
					if(coub1>=40&&coub1<52)
					{
					blue1travel[coub1]=0;
					squares[coub1].setIcon(null);
					coub1=(coub1+6)%52;
					blue1travel[coub1]=1;
					squares[coub1].setIcon(bball1);
					
					x++;
					}
					else
					{
						if(coub1<=38)
						{
							squares[coub1].setIcon(null);
							blue1travel[coub1]=0;
							coub1=coub1+6;
							if(coub1>38)
								coub1=coub1+13;
							
							blue1travel[coub1]=1;
							
							if(coub1>51)
							{
								if(coub1!=57)
									bgoal[coub1-52].setIcon(bball1);
							}
							else
							{
								squares[coub1].setIcon(bball1);
							}
							x++;
							
						}
					}
				}
			}
			else
			{
				if(coub1!=-1&&coub1!=57)
				{
					if(coub1>=40)
					{
						if(coub1>=52)
						{
							if(coub1+bque[x]<=57)
							{
								bgoal[coub1-52].setIcon(null);
								blue1travel[coub1]=0;
								coub1=coub1+bque[x];
								blue1travel[coub1]=1;
								if(coub1<57)
									bgoal[coub1-52].setIcon(bball1);
								
								x++;
							}
						}
						else{
						squares[coub1].setIcon(null);
						blue1travel[coub1]=0;
						coub1=(coub1+bque[x])%52;
						squares[coub1].setIcon(bball1);
						blue1travel[coub1]=1;
						x++;}
					}
					else
					{
						if(coub1<=38)
						{
							squares[coub1].setIcon(null);
							blue1travel[coub1]=0;
							coub1=coub1+bque[x];
							if(coub1>38)
								coub1=coub1+13;
							
							blue1travel[coub1]=1;
							
							if(coub1>51)
							{
								if(coub1!=57)
									bgoal[coub1-52].setIcon(bball1);
							}
							else
							{
								squares[coub1].setIcon(bball1);
							}
							x++;
						}
					}
						
					
				}
				
			}
			
		}
			
		}
		
		
		class Handlerhomeb2 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(bque[x]==6)
			{   if(coub2==-1)
				{
					blue2.setIcon(null);
					coub2=40;
					blue2travel[coub2]=1;
					squares[coub2].setIcon(bball2);
					x++;
				}
				
				else
				{
					if(coub2>=40&&coub2<52)
					{
					blue2travel[coub2]=0;
					squares[coub2].setIcon(null);
					coub2=(coub2+6)%52;
					blue2travel[coub2]=1;
					squares[coub2].setIcon(bball2);
					
					x++;
					}
					else
					{
						if(coub2<=38)
						{
							squares[coub2].setIcon(null);
							blue2travel[coub2]=0;
							coub2=coub2+6;
							if(coub2>38)
								coub2=coub2+13;
							
							blue2travel[coub2]=1;
							
							if(coub2>51)
							{
								if(coub2!=57)
									bgoal[coub2-52].setIcon(bball2);
							}
							else
							{
								squares[coub2].setIcon(bball2);
							}
							x++;
							
						}
					}
				}
			}
			else
			{
				if(coub2!=-1&&coub2!=57)
				{
					if(coub2>=40)
					{
						if(coub2>=52)
						{
							if(coub2+bque[x]<=57)
							{
								bgoal[coub2-52].setIcon(null);
								blue2travel[coub2]=0;
								coub2=coub2+bque[x];
								blue2travel[coub2]=1;
								if(coub2<57)
									bgoal[coub2-52].setIcon(bball2);
								
								x++;
							}
						}
						else{
						squares[coub2].setIcon(null);
						blue2travel[coub2]=0;
						coub2=(coub2+bque[x])%52;
						squares[coub2].setIcon(bball2);
						blue2travel[coub2]=1;
						x++;}
					}
					else
					{
						if(coub2<=38)
						{
							squares[coub2].setIcon(null);
							blue2travel[coub2]=0;
							coub2=coub2+bque[x];
							if(coub2>38)
								coub2=coub2+13;
							
							blue2travel[coub2]=1;
							
							if(coub2>51)
							{
								if(coub2!=57)
									bgoal[coub2-52].setIcon(bball2);
							}
							else
							{
								squares[coub2].setIcon(bball2);
							}
							x++;
						}
					}
						
					
				}
				
			}
			
		}
			
		}
		
		
		
		class Handlerhomeb3 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(bque[x]==6)
			{   if(coub3==-1)
				{
					blue3.setIcon(null);
					coub3=40;
					blue3travel[coub3]=1;
					squares[coub3].setIcon(bball3);
					x++;
				}
				
				else
				{
					if(coub3>=40&&coub3<52)
					{
					blue3travel[coub3]=0;
					squares[coub3].setIcon(null);
					coub3=(coub3+6)%52;
					blue3travel[coub3]=1;
					squares[coub3].setIcon(bball3);
					
					x++;
					}
					else
					{
						if(coub3<=38)
						{
							squares[coub3].setIcon(null);
							blue3travel[coub3]=0;
							coub3=coub3+6;
							if(coub3>38)
								coub3=coub3+13;
							
							blue3travel[coub3]=1;
							
							if(coub3>51)
							{
								if(coub2!=57)
									bgoal[coub3-52].setIcon(bball3);
							}
							else
							{
								squares[coub3].setIcon(bball3);
							}
							x++;
							
						}
					}
				}
			}
			else
			{
				if(coub3!=-1&&coub3!=57)
				{
					if(coub3>=40)
					{
						if(coub3>=52)
						{
							if(coub3+bque[x]<=57)
							{
								bgoal[coub3-52].setIcon(null);
								blue3travel[coub3]=0;
								coub3=coub3+bque[x];
								blue3travel[coub3]=1;
								if(coub3<57)
									bgoal[coub3-52].setIcon(bball3);
								
								x++;
							}
						}
						else{
						squares[coub3].setIcon(null);
						blue3travel[coub3]=0;
						coub3=(coub3+bque[x])%52;
						squares[coub3].setIcon(bball3);
						blue3travel[coub3]=1;
						x++;}
					}
					else
					{
						if(coub3<=38)
						{
							squares[coub3].setIcon(null);
							blue3travel[coub3]=0;
							coub3=coub3+bque[x];
							if(coub3>38)
								coub3=coub3+13;
							
							blue3travel[coub3]=1;
							
							if(coub3>51)
							{
								if(coub3!=57)
									bgoal[coub3-52].setIcon(bball3);
							}
							else
							{
								squares[coub3].setIcon(bball3);
							}
							x++;
						}
					}
						
					
				}
				
			}
			
		}
			
		}
		
		
		
		class Handlerhomeb4 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(bque[x]==6)
			{   if(coub4==-1)
				{
					blue4.setIcon(null);
					coub4=40;
					blue4travel[coub4]=1;
					squares[coub4].setIcon(bball4);
					x++;
				}
				
				else
				{
					if(coub4>=40&&coub4<52)
					{
					blue4travel[coub4]=0;
					squares[coub4].setIcon(null);
					coub4=(coub4+6)%52;
					blue4travel[coub4]=1;
					squares[coub4].setIcon(bball4);
					
					x++;
					}
					else
					{
						if(coub4<=38)
						{
							squares[coub4].setIcon(null);
							blue4travel[coub4]=0;
							coub4=coub4+6;
							if(coub4>38)
								coub4=coub4+13;
							
							blue4travel[coub4]=1;
							
							if(coub4>51)
							{
								if(coub4!=57)
									bgoal[coub4-52].setIcon(bball4);
							}
							else
							{
								squares[coub4].setIcon(bball4);
							}
							x++;
							
						}
					}
				}
			}
			else
			{
				if(coub4!=-1&&coub4!=57)
				{
					if(coub4>=40)
					{
						if(coub4>=52)
						{
							if(coub4+bque[x]<=57)
							{
								bgoal[coub4-52].setIcon(null);
								blue4travel[coub4]=0;
								coub4=coub4+bque[x];
								blue4travel[coub4]=1;
								if(coub4<57)
									bgoal[coub4-52].setIcon(bball4);
								
								x++;
							}
						}
						else{
						squares[coub4].setIcon(null);
						blue4travel[coub4]=0;
						coub4=(coub4+bque[x])%52;
						squares[coub4].setIcon(bball4);
						blue4travel[coub4]=1;
						x++;}
					}
					else
					{
						if(coub4<=38)
						{
							squares[coub4].setIcon(null);
							blue4travel[coub4]=0;
							coub4=coub4+bque[x];
							if(coub4>38)
								coub4=coub4+13;
							
							blue4travel[coub4]=1;
							
							if(coub4>51)
							{
								if(coub4!=57)
									bgoal[coub4-52].setIcon(bball4);
							}
							else
							{
								squares[coub4].setIcon(bball4);
							}
							x++;
						}
					}
						
					
				}
				
			}
			
		}
			
		}
	
	
	
	class Handlerhomeg1 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(gque[x]==6)
			{   if(coug1==-1)
				{
					green1.setIcon(null);
					coug1=27;
					green1travel[coug1]=1;
					squares[coug1].setIcon(gball1);
					x++;
				}
				
				else
				{
					if(coug1>=27&&coug1<52)
					{
					green1travel[coug1]=0;
					squares[coug1].setIcon(null);
					coug1=(coug1+6)%52;
					green1travel[coug1]=1;
					squares[coug1].setIcon(gball1);
					
					x++;
					}
					else
					{
						if(coug1<=25)
						{
							squares[coug1].setIcon(null);
							green1travel[coug1]=0;
							coug1=coug1+6;
							if(coug1>25)
								coug1=coug1+26;
							
							green1travel[coug1]=1;
							
							if(coug1>51)
							{
								if(coug1!=57)
									ggoal[coug1-52].setIcon(gball1);
							}
							else
							{
								squares[coug1].setIcon(gball1);
							}
							x++;
							
						}
					}
				}
			}
			else
			{
				if(coug1!=-1&&coug1!=57)
				{
					if(coug1>=27)
					{
						if(coug1>=52)
						{
							if(coug1+gque[x]<=57)
							{
								ggoal[coug1-52].setIcon(null);
								green1travel[coug1]=0;
								coug1=coug1+gque[x];
								green1travel[coug1]=1;
								if(coug1<57)
									ggoal[coug1-52].setIcon(gball1);
								
								x++;
							}
						}
						else{
						squares[coug1].setIcon(null);
						green1travel[coug1]=0;
						coug1=(coug1+gque[x])%52;
						squares[coug1].setIcon(gball1);
						green1travel[coug1]=1;
						x++;}
					}
					else
					{
						if(coug1<=25)
						{
							squares[coug1].setIcon(null);
							green1travel[coug1]=0;
							coug1=coug1+gque[x];
							if(coug1>25)
								coug1=coug1+26;
							
							green1travel[coug1]=1;
							
							if(coug1>51)
							{
								if(coug1!=57)
									ggoal[coug1-52].setIcon(gball1);
							}
							else
							{
								squares[coug1].setIcon(gball1);
							}
							x++;
						}
					}
						
					
				}
				
			}
			
		}
			
		}
	
	
	class Handlerhomeg2 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(gque[x]==6)
			{   if(coug2==-1)
				{
					green2.setIcon(null);
					coug2=27;
					green2travel[coug2]=1;
					squares[coug2].setIcon(gball2);
					x++;
				}
				
				else
				{
					if(coug2>=27&&coug2<52)
					{
					green1travel[coug2]=0;
					squares[coug2].setIcon(null);
					coug2=(coug2+6)%52;
					green2travel[coug2]=1;
					squares[coug2].setIcon(gball2);
					
					x++;
					}
					else
					{
						if(coug2<=25)
						{
							squares[coug2].setIcon(null);
							green2travel[coug2]=0;
							coug2=coug2+6;
							if(coug2>25)
								coug2=coug2+26;
							
							green2travel[coug2]=1;
							
							if(coug2>51)
							{
								if(coug2!=57)
									ggoal[coug2-52].setIcon(gball2);
							}
							else
							{
								squares[coug2].setIcon(gball2);
							}
							x++;
							
						}
					}
				}
			}
			else
			{
				if(coug2!=-1&&coug2!=57)
				{
					if(coug2>=27)
					{
						if(coug2>=52)
						{
							if(coug2+gque[x]<=57)
							{
								ggoal[coug2-52].setIcon(null);
								green2travel[coug2]=0;
								coug2=coug2+gque[x];
								green2travel[coug2]=1;
								if(coug2<57)
									ggoal[coug2-52].setIcon(gball2);
								
								x++;
							}
						}
						else{
						squares[coug2].setIcon(null);
						green2travel[coug2]=0;
						coug2=(coug2+gque[x])%52;
						squares[coug2].setIcon(gball2);
						green2travel[coug2]=1;
						x++;}
					}
					else
					{
						if(coug2<=25)
						{
							squares[coug2].setIcon(null);
							green2travel[coug2]=0;
							coug2=coug2+gque[x];
							if(coug2>25)
								coug2=coug2+26;
							
							green2travel[coug2]=1;
							
							if(coug2>51)
							{
								if(coug2!=57)
									ggoal[coug2-52].setIcon(gball2);
							}
							else
							{
								squares[coug2].setIcon(gball2);
							}
							x++;
						}
					}
						
					
				}
				
			}
			
		}
			
		}
	
	
	
	
	
		
		class Handlerhomeg3 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(gque[x]==6)
			{   if(coug3==-1)
				{
					green3.setIcon(null);
					coug3=1;
					green3travel[coug3]=1;
					squares[coug3].setIcon(gball3);
					x++;
				}
				
				else
				{
					if(coug3+6<=57)
					{
					green3travel[coug3]=0;
					squares[coug3].setIcon(null);
					coug3=coug3+6;
					green3travel[coug3]=1;
					if(coug3>51)
					{
						if(coug3!=57)
						ggoal[coug3-52].setIcon(gball3);
					}
					else
					{
					squares[coug3].setIcon(gball3);
					}
					x++;
					}
				}
			}
			else
			{
				if(coug3!=-1&&coug3+gque[x]<=57)
				{
					green3travel[coug3]=0;
					if(coug3>51)
					ggoal[coug3-52].setIcon(null);
					else
					squares[coug3].setIcon(null);
				
				
					coug3=coug3+gque[x];
					green3travel[coug3]=1;
					if(coug3>51)
					{
						   if(coug3!=57)
							ggoal[coug3-52].setIcon(gball3);
					}
					else
					{
					squares[coug3].setIcon(gball3);
					}
					x++;
				}
				
			}
			
		}
			
		}
		
		
		class Handlerhomeg4 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(gque[x]==6)
			{   if(coug4==-1)
				{
					green4.setIcon(null);
					coug4=1;
					green4travel[coug4]=1;
					squares[coug4].setIcon(gball4);
					x++;
				}
				
				else
				{
					if(coug4+6<=57)
					{
					green4travel[coug4]=0;
					squares[coug4].setIcon(null);
					coug4=coug4+6;
					green4travel[coug4]=1;
					if(coug4>51)
					{
						if(coug4!=57)
						ggoal[coug4-52].setIcon(gball4);
					}
					else
					{
					squares[coug4].setIcon(gball4);
					}
					x++;
					}
				}
			}
			else
			{
				if(coug4!=-1&&coug4+gque[x]<=57)
				{
					green4travel[coug4]=0;
					if(coug4>51)
					ggoal[coug4-52].setIcon(null);
					else
					squares[coug4].setIcon(null);
				
				
					coug4=coug4+gque[x];
					green4travel[coug4]=1;
					if(coug4>51)
					{
						   if(coug4!=57)
							ggoal[coug4-52].setIcon(gball4);
					}
					else
					{
					squares[coug4].setIcon(gball4);
					}
					x++;
				}
				
			}
			
		}
			
		}
		
		
		
		class Handlerhomey1 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(yque[x]==6)
			{   if(couy1==-1)
				{
					yellow1.setIcon(null);
					couy1=1;
					yellow1travel[couy1]=1;
					squares[couy1].setIcon(yball1);
					x++;
				}
				
				else
				{
					if(coug1+6<=57)
					{
					yellow1travel[couy1]=0;
					squares[couy1].setIcon(null);
					couy1=couy1+6;
					yellow1travel[coug1]=1;
					if(couy1>51)
					{
						if(couy1!=57)
						ygoal[couy1-52].setIcon(yball1);
					}
					else
					{
					squares[couy1].setIcon(yball1);
					}
					x++;
					}
				}
			}
			else
			{
				if(couy1!=-1&&couy1+yque[x]<=57)
				{
					yellow1travel[couy1]=0;
					if(couy1>51)
					ygoal[couy1-52].setIcon(null);
					else
					squares[couy1].setIcon(null);
				
				
					couy1=couy1+yque[x];
					yellow1travel[couy1]=1;
					if(couy1>51)
					{
						   if(couy1!=57)
							ygoal[couy1-52].setIcon(yball1);
					}
					else
					{
					squares[couy1].setIcon(yball1);
					}
					x++;
				}
				
			}
			
		}
			
		}
		
		class Handlerhomey2 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(yque[x]==6)
			{   if(couy2==-1)
				{
					yellow2.setIcon(null);
					couy2=1;
					yellow2travel[couy2]=1;
					squares[couy2].setIcon(yball2);
					x++;
				}
				
				else
				{
					if(coug2+6<=57)
					{
					yellow2travel[couy2]=0;
					squares[couy2].setIcon(null);
					couy2=couy2+6;
					yellow2travel[coug2]=1;
					if(couy2>51)
					{
						if(couy2!=57)
						ygoal[couy2-52].setIcon(yball2);
					}
					else
					{
					squares[couy2].setIcon(yball2);
					}
					x++;
					}
				}
			}
			else
			{
				if(couy2!=-1&&couy2+yque[x]<=57)
				{
					yellow2travel[couy2]=0;
					if(couy2>51)
					ygoal[couy2-52].setIcon(null);
					else
					squares[couy2].setIcon(null);
				
				
					couy2=couy2+yque[x];
					yellow2travel[couy2]=1;
					if(couy2>51)
					{
						   if(couy2!=57)
							ygoal[couy2-52].setIcon(yball2);
					}
					else
					{
					squares[couy2].setIcon(yball2);
					}
					x++;
				}
				
			}
			
		}
			
		}
		
		
		class Handlerhomey3 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(yque[x]==6)
			{   if(couy3==-1)
				{
					yellow3.setIcon(null);
					couy3=1;
					yellow3travel[couy3]=1;
					squares[couy3].setIcon(yball1);
					x++;
				}
				
				else
				{
					if(coug3+6<=57)
					{
					yellow3travel[couy3]=0;
					squares[couy3].setIcon(null);
					couy3=couy3+6;
					yellow3travel[coug3]=1;
					if(couy3>51)
					{
						if(couy3!=57)
						ygoal[couy3-52].setIcon(yball3);
					}
					else
					{
					squares[couy3].setIcon(yball3);
					}
					x++;
					}
				}
			}
			else
			{
				if(couy3!=-1&&couy3+yque[x]<=57)
				{
					yellow3travel[couy3]=0;
					if(couy3>51)
					ygoal[couy3-52].setIcon(null);
					else
					squares[couy3].setIcon(null);
				
				
					couy3=couy3+yque[x];
					yellow3travel[couy3]=1;
					if(couy3>51)
					{
						   if(couy3!=57)
							ygoal[couy3-52].setIcon(yball3);
					}
					else
					{
					squares[couy3].setIcon(yball3);
					}
					x++;
				}
				
			}
			
		}
			
		}
		
		
		class Handlerhomey4 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(yque[x]==6)
			{   if(couy4==-1)
				{
					yellow4.setIcon(null);
					couy4=1;
					yellow4travel[couy4]=1;
					squares[couy4].setIcon(yball4);
					x++;
				}
				
				else
				{
					if(coug4+6<=57)
					{
					yellow4travel[couy4]=0;
					squares[couy4].setIcon(null);
					couy4=couy4+6;
					yellow4travel[coug4]=1;
					if(couy4>51)
					{
						if(couy4!=57)
						ygoal[couy4-52].setIcon(yball4);
					}
					else
					{
					squares[couy4].setIcon(yball4);
					}
					x++;
					}
				}
			}
			else
			{
				if(couy4!=-1&&couy4+yque[x]<=57)
				{
					yellow4travel[couy4]=0;
					if(couy4>51)
					ygoal[couy4-52].setIcon(null);
					else
					squares[couy4].setIcon(null);
				
				
					couy4=couy4+yque[x];
					yellow4travel[couy4]=1;
					if(couy4>51)
					{
						   if(couy4!=57)
							ygoal[couy4-52].setIcon(yball4);
					}
					else
					{
					squares[couy4].setIcon(yball4);
					}
					x++;
				}
				
			}
			
		}
			
		}
		
	
	
	
	
	
	
	
	
	
	/*
	
	class Handlerhomer1 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(rque[x]==6)
			{red1.setIcon(null);
		     squares[1].setIcon(rball1);
			 onestamp[0]++;
			}
			x++;
		}
	}
	class Handlerhomer2 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(rque[x]==6)
			{red2.setIcon(null);
		     squares[1].setIcon(rball2);
			 onestamp[0]++;
			}
			x++;
		}
	}
	class Handlerhomer3 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(rque[x]==6)
			{red3.setIcon(null);
		     squares[1].setIcon(rball3);
			 onestamp[0]++;
			}
			x++;
		}
	}
	class Handlerhomer4 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(rque[x]==6)
			{red4.setIcon(null);
		     squares[1].setIcon(rball4);
			 onestamp[0]++;
			}
			x++;
		}
	}
	
	class Handlerhomeb1 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(bque[x]==6)
			{blue1.setIcon(null);
		     squares[40].setIcon(bball1);
			 sevenstamp[1]++;
			}
			x++;
		}
	}
	class Handlerhomeb2 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(bque[x]==6)
			{blue2.setIcon(null);
		     squares[40].setIcon(bball2);
			 sevenstamp[1]++;
			}
			x++;
		}
	}
	class Handlerhomeb3 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(bque[x]==6)
			{blue3.setIcon(null);
		     squares[40].setIcon(bball3);
			 sevenstamp[1]++;
			}
			x++;
		}
	}
	class Handlerhomeb4 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(bque[x]==6)
			{blue4.setIcon(null);
		     squares[40].setIcon(bball4);
			 sevenstamp[1]++;
			}
			x++;
		}
	}
	class Handlerhomeg1 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(gque[x]==6)
			{green1.setIcon(null);
		     squares[27].setIcon(gball1);
			 fivestamp[2]++;
			 
			}
			x++;
		}
	}
	class Handlerhomeg2 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(gque[x]==6)
			{green2.setIcon(null);
		     squares[27].setIcon(gball2);
			 fivestamp[2]++;
			}
			x++;
		}
	}
	class Handlerhomeg3 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(gque[x]==6)
			{green3.setIcon(null);
		     squares[27].setIcon(gball3);
			 fivestamp[2]++;
			}
			x++;
		}
	}
	class Handlerhomeg4 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(gque[x]==6)
			{green4.setIcon(null);
		     squares[27].setIcon(gball4);
			 fivestamp[2]++;
			}
			x++;
		}
	}
	
	class Handlerhomey1 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(yque[x]==6)
			{yellow1.setIcon(null);
		     squares[14].setIcon(yball1);
			 threestamp[3]++;
			}
			x++;
		}
	}
	class Handlerhomey2 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(yque[x]==6)
			{yellow2.setIcon(null);
		     squares[14].setIcon(yball2);
			 threestamp[3]++;
			}
			x++;
		}
	}
	class Handlerhomey3 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(yque[x]==6)
			{yellow3.setIcon(null);
		     squares[14].setIcon(yball3);
			 threestamp[3]++;
			}
			x++;
		}
	}
	class Handlerhomey4 implements ActionListener{
		public void actionPerformed(ActionEvent e3)
		{
			if(yque[x]==6)
			{
			 yellow4.setIcon(null);
		     squares[14].setIcon(yball4);
			 threestamp[3]++;
			}
			x++;
		}
	}
	*/

	//HANDLER END............................
	//HANDLER END............................
	//HANDLER END............................
	
	public button(String s)
	{
		super(s);
		for(int i=0;i<=57;i++)
	{
		red1travel[i]=0;
		red2travel[i]=0;
		red3travel[i]=0;
		red4travel[i]=0;
		blue1travel[i]=0;
		blue2travel[i]=0;
		blue3travel[i]=0;
		blue4travel[i]=0;
		green1travel[i]=0;
		green2travel[i]=0;
		green3travel[i]=0;
		green4travel[i]=0;
		yellow1travel[i]=0;
		yellow2travel[i]=0;
		yellow3travel[i]=0;
		yellow4travel[i]=0;
	}
		
	cour1=-1;
	cour2=-1;
	cour3=-1;
	cour4=-1;
	coub1=-1;
	coub2=-1;
	coub3=-1;
	coub4=-1;
	coug1=-1;
	coug2=-1;
	coug3=-1;
	coug4=-1;
	couy1=-1;
	couy2=-1;
	couy3=-1;
	couy4=-1;
	}
	
	public button()
	{
	super();
	for(int i=0;i<=57;i++)
	{
		red1travel[i]=0;
		red2travel[i]=0;
		red3travel[i]=0;
		red4travel[i]=0;
		blue1travel[i]=0;
		blue2travel[i]=0;
		blue3travel[i]=0;
		blue4travel[i]=0;
		green1travel[i]=0;
		green2travel[i]=0;
		green3travel[i]=0;
		green4travel[i]=0;
		yellow1travel[i]=0;
		yellow2travel[i]=0;
		yellow3travel[i]=0;
		yellow4travel[i]=0;
	}

    cour1=-1;
	cour2=-1;
	cour3=-1;
	cour4=-1;
	coub1=-1;
	coub2=-1;
	coub3=-1;
	coub4=-1;
	coug1=-1;
	coug2=-1;
	coug3=-1;
	coug4=-1;
	couy1=-1;
	couy2=-1;
	couy3=-1;
	couy4=-1;	
	}
	
	
	

   public static void main(String[] args)
 {
	 button board=new button("Ludo Game");
	 board.setcomponent();
	 board.setSize(1500,800);
	 board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 board.setVisible(true);
 }	   
}
