/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package main.java.frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.subsystems.Zoomy;
import frc.robot.Robot;



/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Dashboard extends Subsystem {


  public Dashboard(){
  Smartdashboard.putNumber("encoder Rticks", robot.subsystems.lwheel.getRaw());
  Smartdashboard.putNumber("encoder Lticks", robot.subsystems.rwheel.getRaw());
  Smartdashboard.putNumber("lrate", robot.subsystems.lwheel.getRate());
  Smartdashboard.putNumber("Rrate", robot.subsystems.lwheel.getRate());
  }
    
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
