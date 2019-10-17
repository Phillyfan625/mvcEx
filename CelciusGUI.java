package mvc_ex1;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import mvc_ex1.TemperatureModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

/**
	File name: ClassTemplate.java
	Short description:
	IST 242 Assignment:
	@author $(user)
	@version 1.01 FILL IN THE DATE
*/

public class CelciusGUI extends TemperatureGUI
{	
    public CelciusGUI(TemperatureModel model, int h, int v)
	{	super("Celcsius Temperature", model, h, v);
		setDisplay(""+model.getF());
		addUpListener(new UpListener());
		addDownListener(new DownListener());
		addDisplayListener(new DisplayListener());
	}
	
	public void update(Observable t, Object o) // Called from the Model
	{	setDisplay("" + model().getF());
	}

    	
	class UpListener implements ActionListener
	{	public void actionPerformed(ActionEvent e)
		{	model().setF(model().getF() + 1.0);
		}

        
	}
	
	class DownListener implements ActionListener
	{	public void actionPerformed(ActionEvent e)
		{	model().setF(model().getF() - 1.0);
		}
	}
	
	class DisplayListener implements ActionListener
	{	public void actionPerformed(ActionEvent e)
		{	double value = getDisplay();
			model().setF(value);
		}
	}
}



