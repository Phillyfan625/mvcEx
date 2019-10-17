package mvc_ex1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.util.Observable;
import java.util.Observer;

/**
	File name: ClassTemplate.java
	Short description:
	IST 242 Assignment:
	@author $(user)
	@version 1.01 FILL IN THE DATE
*/

public class TemperatureCanvas extends Canvas
{
	// Instance Variables -- define your private data


	public TemperatureCanvas(TemperatureGauge farenheit)
	{	_farenheit = farenheit;
	}

    TemperatureCanvas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	public void paint(Graphics g)
	{	g.setColor(Color.black);
		g.drawRect(left,top, width, height);
		g.setColor(Color.red);
		g.fillOval(left-width/2, top+height-width/3,width*2, width*2);
		g.setColor(Color.black);
		g.drawOval(left-width/2, top+height-width/3,width*2, width*2);
		g.setColor(Color.white);
		g.fillRect(left+1,top+1, width-1, height-1);
		g.setColor(Color.red);
		long redtop = height*(_farenheit.get()-_farenheit.getMax())/(_farenheit.getMin()-_farenheit.getMax());
		g.fillRect(left+1, top + (int)redtop, width-1, height-(int)redtop);
	}
	
	private TemperatureGauge _farenheit;
	private static final int width = 20;
	private static final int top = 20;
	private static final int left = 100;
	private static final int right = 250;
	private static final int height = 200;
}

class TemperatureGauge
{	public TemperatureGauge(int min, int max){ Min = min; Max = max; }
	
	public void set(int level) { current = level; }	
	public int get(){return current;}
	public int getMax(){return Max;}
	public int getMin(){return Min;}
	
	private int Max, Min, current;
}


