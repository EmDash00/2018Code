package org.usfirst.frc.team135.robot.commands;

import org.usfirst.frc.team135.robot.Robot;
import org.usfirst.frc.team135.robot.RobotMap.DRIVETRAIN;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team135.robot.subsystems.DriveTrain;

/**
 *
 */
public class DriveMotor extends Command {

	private int id;
	
    public DriveMotor(int id) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drivetrain);
    	this.id = id;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.drivetrain.InitializeDriveTrain();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    //	Robot.drivetrain.driveSingleMotorPower(id); //power control
    	
    	if (id == DRIVETRAIN.REAR_LEFT_TALON_ID)
    	{
    		System.out.println("rear left " + Robot.drivetrain.getEncoderSpeed(Robot.drivetrain.rearLeftTalon));
    	}
    	if (id == DRIVETRAIN.REAR_RIGHT_TALON_ID)
    	{
    		System.out.println("rear right " + Robot.drivetrain.getEncoderSpeed(Robot.drivetrain.rearRightTalon));
    	}
    	if (id == DRIVETRAIN.FRONT_LEFT_TALON_ID)
    	{
    		System.out.println("front left " + Robot.drivetrain.getEncoderSpeed(Robot.drivetrain.frontLeftTalon));
    	}
    	if (id == DRIVETRAIN.FRONT_RIGHT_TALON_ID)
    	{
    		System.out.println("front right " + Robot.drivetrain.getEncoderSpeed(Robot.drivetrain.frontRightTalon));
    	}
    	
    	Robot.drivetrain.driveSingleMotorVelocity(id);  //closed-loop velocity control
    	
		SmartDashboard.putNumber("Rear Left Speed", Robot.drivetrain.getEncoderSpeed(Robot.drivetrain.rearLeftTalon));
		SmartDashboard.putNumber("Rear Right Speed", Robot.drivetrain.getEncoderSpeed(Robot.drivetrain.rearRightTalon));
		SmartDashboard.putNumber("Front Left Speed", Robot.drivetrain.getEncoderSpeed(Robot.drivetrain.frontLeftTalon));
		SmartDashboard.putNumber("Front Right Speed", Robot.drivetrain.getEncoderSpeed(Robot.drivetrain.frontRightTalon));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}