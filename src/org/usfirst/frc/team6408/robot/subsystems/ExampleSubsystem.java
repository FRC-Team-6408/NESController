
package org.usfirst.frc.team6408.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ExampleSubsystem extends Subsystem {
    public RobotDrive drive;

    public void initDefaultCommand() {
    	drive = new RobotDrive(0, 1, 14, 15);
    }
    
    public void move(double y, double x) {
    	drive.setLeftRightMotorOutputs(y - (x / 2), y + (x / 2));
    }
}