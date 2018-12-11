/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.driveEncoders;

/**
 * An example command.  You can replace me with your own command.
 */
public class EncoderConfig extends Command {
  public EncoderConfig() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.driveencoders);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
      
        Robot.driveencoders.lwheel.setMaxPeriod(.1);
		    Robot.driveencoders.lwheel.setMinRate(5);
	    	Robot.driveencoders.lwheel.setReverseDirection(false);
        Robot.driveencoders.lwheel.setSamplesToAverage(7);
        

        Robot.driveencoders.rwheel.setMaxPeriod(.1);
		    Robot.driveencoders.rwheel.setMinRate(5);
	    	Robot.driveencoders.rwheel.setDistancePerPulse(1/1440);
		    Robot.driveencoders.rwheel.setReverseDirection(false);
        Robot.driveencoders.rwheel.setSamplesToAverage(7);
       

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return true;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
