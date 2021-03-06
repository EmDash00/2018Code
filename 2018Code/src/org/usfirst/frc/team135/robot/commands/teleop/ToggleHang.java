package org.usfirst.frc.team135.robot.commands.teleop;

import org.usfirst.frc.team135.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class ToggleHang extends InstantCommand {

    public ToggleHang() {
        super();
        requires(Robot.hang);
    }

    // Called once when the command executes
    protected void initialize() {
    	Robot.hang.toggle();
    }

}
