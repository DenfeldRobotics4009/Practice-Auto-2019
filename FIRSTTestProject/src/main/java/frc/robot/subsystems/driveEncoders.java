/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.EncoderConfig;


/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class driveEncoders extends Subsystem {
    public Encoder lwheel, rwheel;

    public driveEncoders() {

        lwheel = new Encoder(3, 2, false, Encoder.EncodingType.k4X);
        rwheel = new Encoder(0, 1, false, Encoder.EncodingType.k4X);

    

        
        //it seems to be 1440 ticks per revolution

    }
  
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
        setDefaultCommand(new EncoderConfig());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
