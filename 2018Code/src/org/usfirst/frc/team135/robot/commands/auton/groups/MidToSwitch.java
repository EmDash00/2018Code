package org.usfirst.frc.team135.robot.commands.auton.groups;

import org.usfirst.frc.team135.robot.RobotMap.FIELD;
import org.usfirst.frc.team135.robot.RobotMap.LIFT;
import org.usfirst.frc.team135.robot.commands.auton.singles.DriveStraightForwardDistance;
import org.usfirst.frc.team135.robot.commands.auton.singles.SetLiftPosition;
import org.usfirst.frc.team135.robot.commands.teleop.ReleaseMandibles;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class MidToSwitch extends CommandGroup {

    public MidToSwitch(boolean switchIsRight) {
    	addParallel(new SetLiftPosition(LIFT.SWITCH_POSITION));
    	addParallel(new DriveStraightForwardDistance(0, FIELD.MID_SWITCH_Y, 2.5));
    	addSequential(new ReleaseMandibles());
    }
}
