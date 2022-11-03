package tecProg;

import java.awt.Color;

import robocode.AdvancedRobot;
import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;

public class GabrielSilveira extends AdvancedRobot {

	
	public void run() {
		setColors(Color.red, Color.black, Color.black);

		while (true) {
			ahead(200);
			setTurnLeft(60);
		}
	}
	
	public void onScannedRobot(ScannedRobotEvent e) {
		fire(1);
	}
	
	public void onHitWall(HitWallEvent event) {
		back(200);
		turnLeft(180);
	}
	
	public void onHitRobot(HitRobotEvent event) {
		fireBullet(0.5);
		turnRight(getHeading()+90);
	}
	
	public void onHitByBullet(HitByBulletEvent event) {
		turnRight(getHeading()+90);
	}

}
