package org.usfirst.frc.team6408.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team6408.robot.commands.ExampleCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public Joystick joystick1;
    public OI() {
        joystick1 = new Joystick(0);
    }
    
    public Joystick getJoystick1() {
        return joystick1;
    }
}

