import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class RobotHouses {
	public static void main(String[] args) {
		Robot  Esteban  = new Robot(50,550);
		Esteban.miniaturize();
		Esteban.setSpeed(500);
		Esteban.penDown();
		
		Esteban.setRandomPenColor();
		Robot.setWindowColor(Color.black);
		
		for (int i = 0; i < 10; i++) {
		Random rand=new Random();	
		int height=rand.nextInt(401) + 100;
		
		
		if(height > 300){
			//Draw flat house
			
		    Esteban.move(height);
			Esteban.turn(90);
			Esteban.move(50);
			Esteban.turn(90);
			Esteban.move(height);
			Esteban.turn(270);
			Esteban.setPenColor(Color.green);
			Esteban.move(50);
			Esteban.turn(270);
			
		}
		else
		{
			//Draw peaked house
			
			
			Esteban.move(height);
			Esteban.turn(45);
			Esteban.move(50);
			Esteban.turn(90);
		    Esteban.move(50);
		    Esteban.turn(45);
		    Esteban.move(height);
		    Esteban.turn(270);
			Esteban.setPenColor(Color.green);
			Esteban.move(50);
			Esteban.turn(270);
		}
		
		
		
		
		}
	}
}
