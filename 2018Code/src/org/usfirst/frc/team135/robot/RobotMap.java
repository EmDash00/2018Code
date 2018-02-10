/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team135.robot;


public interface RobotMap 
{
	public interface FIELD
	{
		public static final float //All measurements are in inches
			AUTO_LINE = 135,	
			SCALE_X = 42.5f,
			SCALE_Y = 327,
			SIDE_SWITCH_X = 54.5f,
			SIDE_SWITCH_Y = 165,
			MID_SWITCH_X = 47.25f,
			MID_SWITCH_Y = 143.5f;
			
		
	}
	
	public interface CANIFIER
	{
		public static final int ID = 0;
	}
	
	public interface LIFT
	{
		public static final int 
			LIFT_MOTOR_ID = 3;
		
		public static final double
			LOW_POSITION = 0,
			SWITCH_POSITION = 0,
			SCALE_POSITION = 0;
			
	}
	
	public interface DRIVETRAIN
	{
		static final public int REAR_RIGHT_TALON_ID = 2;
		static final public int FRONT_RIGHT_TALON_ID = 5;
		static final public int REAR_LEFT_TALON_ID = 1;
		static final public int FRONT_LEFT_TALON_ID = 4;
	}
	
	public interface INTAKE
	{
		public static final int RIGHT_WHEEL_VICTOR_ID = 1;
		public static final int LEFT_WHEEL_VICTOR_ID = 2;
		
		public static final int MANDIBLE_OPEN_CHANNEL = 0;
		public static final int MANDIBLE_CLOSE_CHANNEL = 1;

		public static final int RETRACT_IN_CHANNEL = 2;
		public static final int RETRACT_OUT_CHANNEL = 3;
	}
	 
	public interface HANG
	{
		public static final int HANG_1_VICTOR_ID = 3;
		public static final int HANG_2_VICTOR_ID = 4;

	}
	
}
