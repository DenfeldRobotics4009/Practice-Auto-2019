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
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.SPI;


/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Zoomy extends Subsystem {
    public WPI_TalonSRX can0, can2, can1;
    public Victor vichtor;
    public MecanumDrive drive1;
    public ADXRS450_Gyro spinny;

   



    public Zoomy() {
        can0 = new WPI_TalonSRX(0); //FL
        can1 = new WPI_TalonSRX(1); //FR
        can2 = new WPI_TalonSRX(2); //BL

        vichtor = new Victor(0); //BR

        drive1 = new MecanumDrive(can0, can2, can1, vichtor);

        spinny = new ADXRS450_Gyro(SPI.Port.kOnboardCS0);

        // Max Velocity = 6.54
        // Max Acceleration = 1.66 M/s/s
        // Max Jerk = 29.49 M/s/s/s
        // Wheel Circumference = 47.88 cm
        // Wheel Base = 60.96 cm
        spinny.calibrate();


    }
// Put methods for controlling this subsystem
// here. Call these from Commands.

    public void arcadeDrive(double strafe, double forward, double twist) {
      drive1.driveCartesian(strafe, forward, twist);
  }

  @Override
  public void initDefaultCommand() {

    setDefaultCommand(new Zippy());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
