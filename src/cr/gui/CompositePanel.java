package cr.gui;

import cr.*;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class CompositePanel extends JPanel{
	public CompositePanel(){

		this.setLayout(null);
                //Random rd = new Random();
                //Color b =  new Color(rd.nextInt(10000)%256, rd.nextInt(100000)%256, rd.nextInt(1234)%256);
                //this.setBackground(b);
                this.setBackground(Color.white);


	}

	public CompositePanel(int row, int col){

		this.setLayout(new GridLayout(row, col));
                //Random rd = new Random();
                //Color b =  new Color(rd.nextInt(10000)%256, rd.nextInt(100000)%256, rd.nextInt(1234)%256);
               //this.setBackground(b);
                this.setBackground(Color.white);

	}

	public CompositePanel(int x, int y, int width, int height)
	{
		this.setLayout(null);
		this.setBounds(x, y, width, height);
		//Random rd = new Random();
		//Color b =  new Color(rd.nextInt(10000)%256, rd.nextInt(100000)%256, rd.nextInt(1234)%256);
		//this.setBackground(b);
		this.setBackground(Color.white);

	}

	public CompositePanel(int row, int col, int x, int y, int width, int height)
        {
                this.setLayout(new GridLayout(row, col));
                this.setBounds(x, y, width, height);
                //Random rd = new Random();
                //Color b =  new Color(rd.nextInt(10000)%256, rd.nextInt(100000)%256, rd.nextInt(1234)%256);
               //this.setBackground(b);
		this.setBackground(Color.white);

        }

	public CompositePanel adds(Component com, int x, int y, int width, int height){

		com.setBounds(x, y, width, height);

		this.add(com);		
	
		return this;

	}

	public CompositePanel adds(Component com){

                this.add(com);

                return this;

        }

		//north.setPreferredSize(new Dimension(0, 50));
/*
		north.setLayout(null);
		north.setBounds(0,0,1440, 50);

		btn[0].setLocation(1000, 10);
		btn[0].setSize(50, 10);

		north.add(btn[0]);	
	
		CFrame.adds(north, "North");

		west.setPreferredSize(new Dimension(200, 100));		

		west.add(btn[1]);

		CFrame.adds(west, "West");
		CFrame.adds(btn[2], "Center");
		
		CFrame.size(1440,900);
		CFrame.start();	

	}
*/

}
