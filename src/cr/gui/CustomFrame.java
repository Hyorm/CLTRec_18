package cr.gui;

import cr.*;

import javax.swing.*;
import java.awt.*;

public class CustomFrame extends JFrame
{
	public CustomFrame(String frameName)
	{
		super(frameName);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.WHITE);
	}	


	public CustomFrame size(int x, int y)
	{
		this.setSize(x,y);	
		
		return this;
	}

	public CustomFrame adds(Component com)
	{
		this.add(com);
	
		return this;
	}

	public void start()
	{
		repaint();
		this.setVisible(true);
	}
}
