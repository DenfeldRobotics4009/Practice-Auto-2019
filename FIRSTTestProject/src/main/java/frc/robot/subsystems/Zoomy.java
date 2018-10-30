/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import frc.robot.commands.Zippy;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Zoomy extends Subsystem {
public WPI_TalonSRX can0, can2, can1;
public Victor vichtor;

public MecanumDrive drive1;




    public Zoomy() {
        can0 = new WPI_TalonSRX(0); //FL
        can1 = new WPI_TalonSRX(1); //FR
        can2 = new WPI_TalonSRX(2); //BL

        vichtor = new Victor(0); //BR

        drive1 = new MecanumDrive(can0, can2, can1, vichtor);

        // Max Velocity = 6.54
        // Max Acceleration
        // Max Jerk
    


    }
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public void arcadeDrive(double strafe, double forward, double twist){
      drive1.driveCartesian(strafe, forward, twist);
  }

  @Override
  public void initDefaultCommand() {

    setDefaultCommand(new Zippy());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}