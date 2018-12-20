/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.PathGeneration.Generator;
import jaci.pathfinder.followers.*;
import jaci.pathfinder.Trajectory;


public class Profile extends Command {
  Trajectory left;
  public Generator generator = new Generator();
  public EncoderFollower follow = new EncoderFollower();

  public Profile() {
      requires(Robot.zoomy);
      requires(Robot.driveencoders);
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);

  }

  // Called just before this Command runs the first time
  @Override
  public void initialize() {
      follow.configureEncoder(0,1440,15.24);
      follow.configurePIDVA(0.8, 0, 0.8, (1/6.54), 0);
      

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return true; //follow.segment >= trajectory.length();
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
