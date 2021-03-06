package org.usfirst.frc.team4541.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;

/**
 *
 */
public class AnglePistons extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	DoubleSolenoid sol;
	public AnglePistons() {
		sol = new DoubleSolenoid(5,2,3);
	}
    public void initDefaultCommand() {
    	
    }
    
    public void setSolenoidOpen(boolean state){
    	if (state) {
    		sol.set(DoubleSolenoid.Value.kReverse);
    	} else {
    		sol.set(DoubleSolenoid.Value.kForward);
    	}
    	
    }
    
    public boolean getSolenoidState() {
    	if (sol.get() == DoubleSolenoid.Value.kReverse) return true;
    	return false;
    }
}

