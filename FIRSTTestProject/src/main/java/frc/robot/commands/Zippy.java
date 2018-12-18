/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;



/**
 * An example command.  You can replace me with your own command.
 */
public class Zippy extends Command {
  double forward;
  double twist;
  double strafe;
  public Zippy() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.zoomy);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
     
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    boolean pTrig = Robot.m_oi.driver.getTrigger();// this will be fixed in OI- name the trigger something so we don't have to type this thing out
    //Like what?
    //trigger2 (for trigger on joystick 2)
  double pMag = (Robot.m_oi.driver.getThrottle() +1) /2;
  double pMax = 0.75;
  double pMin = 0.25;
  final double DZ = 0.1;
  final double twistDZ = 0.35;
  final double strafeDZ = 0.2;
  double pScale;
      
  if (pTrig) {
  pScale = 1;
  } else {
  pScale = (pMag * (pMax - pMin) + pMin);
  }
  if(Math.abs(Robot.m_oi.driver.getY())< DZ){
  forward = 0;
  }
  else {

  forward = Math.signum(Robot.m_oi.driver.getY()) * pScale *((Math.abs(Robot.m_oi.driver.getY()) - DZ) *(1/(1 - DZ)))*-1;
  }

  //strafing
  if (Math.abs(Robot.m_oi.driver.getX()) < strafeDZ) {
  
  strafe = 0;
  
  }

  else {
  strafe = Math.signum(Robot.m_oi.driver.getX()) * pScale * ((Math.abs(Robot.m_oi.driver.getX()) - strafeDZ) * (1/(1 - strafeDZ)));
  }
  //twist DZ
  if (Math.abs(Robot.m_oi.driver.getZ()) < twistDZ) {

  twist = 0;
  
  }

  else {
  twist = Math.signum(Robot.m_oi.driver.getZ()) * pScale * ((Math.abs(Robot.m_oi.driver.getZ()) - twistDZ) * (1/(1 - twistDZ)));
  }


        Robot.zoomy.drive1.driveCartesian(strafe, forward, twist);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true%
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
