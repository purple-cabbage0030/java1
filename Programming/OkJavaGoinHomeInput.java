//import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoinHomeInput {
	
	// args - 매개변수, parameter
	public static void main(String[] args) {
		
		// swing
//		String id = JOptionPane.showInputDialog("Enter Id");
//		String bright = JOptionPane.showInputDialog("Enter brightness");
		
		// 매개변수 받기
		String id = args[0];
		String bright = args[1];
		
		// Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Lights on
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");
		hallLamp.on();

		DimmingLights moodLamp = new DimmingLights(id+" / mood lamp");
		moodLamp.setBright(Double.parseDouble(bright)); // conversion
		moodLamp.on();
	}

}
