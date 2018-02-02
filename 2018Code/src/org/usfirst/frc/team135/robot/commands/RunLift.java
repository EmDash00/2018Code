package org.usfirst.frc.team135.robot.commands;

import org.usfirst.frc.team135.robot.Robot;

import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RunLift extends Command {

	boolean runUp;
	
    public RunLift(boolean isUp) {
    	requires(Robot.lift);
    	
    	runUp = isUp;

    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	System.out.println("Running lift at power: " + Preferences.getInstance().getDouble("Lift Speed", 0.0));
    	
    	if (runUp)
    	{
    		Robot.lift.set(Preferences.getInstance().getDouble("Lift Up Speed", 0.0));
    	}
    	else
    	{
    		Robot.lift.set(Preferences.getInstance().getDouble("Lift Down Speed", 0.0));
    	}
    	
    	
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.lift.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}