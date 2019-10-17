/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_ex1;

/**
 *
 * @author Test
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                                 TemperatureModel temperature = new TemperatureModel();
                                 TemperatureCanvas c = new TemperatureCanvas();
		new FarenheitGUI(temperature, 100, 100);
		new CelciusGUI(temperature,100, 250);
                                    
                                    
                
    }
    
}
