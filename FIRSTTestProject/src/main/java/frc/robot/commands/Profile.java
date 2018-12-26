/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
<<<<<<< HEAD
import frc.robot.PathGeneration.Generator;
import jaci.pathfinder.followers.*;
=======
import jaci.pathfinder.followers.EncoderFollower;
import jaci.pathfinder.Pathfinder;
>>>>>>> master
import jaci.pathfinder.Trajectory;


public class Profile extends Command {
<<<<<<< HEAD
  Trajectory left;
  public Generator generator = new Generator();
  public EncoderFollower follow = new EncoderFollower();

  public Profile() {
      requires(Robot.zoomy);
      requires(Robot.driveencoders);
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
=======
  TankModifier modifier;
  Trajectory trajectory;
  Trajectory left;
  Trajectory right;

    EncoderFollower leftside;
    EncoderFollower rightside;
>>>>>>> master

    Waypoint[] places, goings;

    //subject to tuning
    public static final double kP = 0.4;
    public static final double kI = 0;
    public static final double kD = 0.4;
    public static final double kV = (1/6.54);
    public static final double kA = 0;



  public Profile(Waypoint[] places) {

     

      Trajectory.Config config = new Trajectory.Config(Trajectory.FitMethod.HERMITE_QUINTIC, Trajectory.Config.SAMPLES_HIGH, 0.05, 6.54, 1.66, 24.49);
      places = new Waypoint[] {
  
        new Waypoint(2, 2, Pathfinder.d2r(45)),
        new Waypoint(1, 2, Pathfinder.d2r(180)),
        new Waypoint(3, 2, Pathfinder.d2r(0)),
        new Waypoint(2, 2, Pathfinder.d2r(-135)),
        new Waypoint(0, 0, Pathfinder.d2r(180))
        
      };
  
      trajectory = Pathfinder.generate(places, config);
  
      modifier = new TankModifier(trajectory).modify(.6096);
  
      left = modifier.getLeftTrajectory();
      right = modifier.getRightTrajectory();


  

  }
  public Profile(){
    requires(Robot.zoomy);
    requires(Robot.driveencoders);
  }
 

  // Called just before this Command runs the first time
  @Override
  public void initialize() {
<<<<<<< HEAD
      follow.configureEncoder(0,1440,15.24);
      follow.configurePIDVA(0.8, 0, 0.8, (1/6.54), 0);
      
=======
     Robot.driveencoders.lwheel.reset();
     Robot.driveencoders.rwheel.reset();
     Robot.zoomy.spinny.reset();
     leftside = new EncoderFollower(left);
     rightside = new EncoderFollower(right);
     leftside.configurePIDVA(kP, kI, kD, kV, kA);
     rightside.configurePIDVA(kP, kI, kD, kV, kA);

     leftside.configureEncoder(0, 1440, .1524);
     rightside.configureEncoder(0, 1440, .1524);

>>>>>>> master

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    
    Robot.zoomy.can0.set(leftside.calculate(Robot.driveencoders.lwheel.getRaw()));
    Robot.zoomy.can2.set(leftside.calculate(Robot.driveencoders.lwheel.getRaw()));
    Robot.zoomy.can1.set(rightside.calculate(Robot.driveencoders.rwheel.getRaw()));
    Robot.zoomy.vichtor.set(rightside.calculate(Robot.driveencoders.rwheel.getRaw()));

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    if (leftside.isFinished() && rightside.isFinished()){
      return true;
    }
    else {
      return false;
    } 
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
