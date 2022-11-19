package _08_California_Weather;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * OBJECTIVE:
 * 1. Create a program that allows the user to search for the weather
 * conditions of a given city in California. Use the example program below
 * and the Utilities class inside this project to get the temperature data
 * from a day in December 2020.
 * Example: User: Encinitas
 *          Program: Encinitas is Overcast with a tempeature of 59.01 �F
 * 
 * 2. Create a way for the user to specify the weather condition and then
 * list the cities that have those conditions.
 * Example: User: Mostly Cloudy
 *          Program: Long Beach, Pomona, Oceanside, ...
 * 
 * 3. Create a way for the user to enter a minimum and maximum temperature
 * and then list the cities that have temperatures within that range
 * Example: User: minimum temperature �F = 65.0, max temperature �F = 70.0
 *          Program: Fortana, Glendale, Escondido, Del Mar, ...
 * 
 * EXTRA:
 * Feel free to add pictures for specific weather conditions or a thermometer
 * for the temperature. Also If you want your program to get the current day's
 * temperature, you can get a free API key at: https://openweathermap.org/api
 */

public class CaliforniaWeather implements ActionListener {
	HashMap<String, WeatherData> weatherData;
    void start() {
    	weatherData = Utilities.getWeatherData();
        
    	
    	
    	button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		
        // All city keys have the first letter capitalized of each word
        String cityName = Utilities.capitalizeWords( "National City" );
        WeatherData datum = weatherData.get(cityName);
        
        if( datum == null ) {
            System.out.println("Unable to find weather data for: " + cityName);
        } else {
            System.out.println(cityName + " is " + datum.weatherSummary + " with a temperature of " + datum.temperatureF + " F");
        }
    }
        
      ////////////////////////////////////////     GIU STUFF      ///////////////////////////////////////////////////////////
    
    JFrame frame = new JFrame();
    JButton button1 = new JButton("Find weather of city");
    JButton button2 = new JButton("Find cities with common weather");
    JButton button3 = new JButton("Find cities with common temperature");
    JPanel panel = new JPanel();
    
    
    
    
    	////////////////////////////////     HASHMAP STUFF     ////////////////////////////////////////////////////////
        
    	public void step1() {
        	String city = JOptionPane.showInputDialog("Please enter your city: ");
            WeatherData charlie = weatherData.get(city); 
            JOptionPane.showMessageDialog(null,"The weather looks like " + charlie.weatherSummary + " and the temperature is " + charlie.temperatureF+"F.");
        }
    	public void step2() {
    		String result = "";
    		String weather = JOptionPane.showInputDialog("Please enter your type of weather: ");
    		for(String city : weatherData.keySet()) {
    			if(weatherData.get(city).weatherSummary.equals(weather)) {
    				result += city + ", ";
    			}
    		}
    		JOptionPane.showMessageDialog(null,result);
    	}
    	public void step3() {
    		String result = "";
    		String lowerLim = JOptionPane.showInputDialog("Please enter your lower temperature limit: ");
    		String upperLim = JOptionPane.showInputDialog("Please enter your upper temperature limit: ");
    		int lowerLimI = Integer.parseInt(lowerLim);
    		int upperLimI = Integer.parseInt(upperLim);
    		for(String city : weatherData.keySet()) {
    			if(weatherData.get(city).temperatureF > lowerLimI && weatherData.get(city).temperatureF < upperLimI) {
    				result += city + ", ";
    			}
    		}
    		JOptionPane.showMessageDialog(null,result);
    	}
		@Override
		public void actionPerformed(ActionEvent blah) {
			if(blah.getSource() == button1) {
				step1();
			}
			if(blah.getSource() == button2) {
				step2();
			}
			if(blah.getSource() == button3) {
				step3();
			}
		}
    	
    	
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
}
