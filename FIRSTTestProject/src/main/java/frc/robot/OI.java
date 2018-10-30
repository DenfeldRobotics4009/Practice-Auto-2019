/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
//test comment
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  public Joystick driver;
  public Joystick operator;

  public OI(){

    driver = new Joystick(0);
    operator = new Joystick(1);

    Button uno = new JoystickButton(driver, 1);
    Button zen1 = new JoystickButton(driver, 2);
    Button dos = new JoystickButton(driver, 3);
    Button zen2 = new JoystickButton(driver, 4);
    Button zen3 = new JoystickButton(driver, 5);
    Button zen4 = new JoystickButton(driver, 6);
    Button zen5 = new JoystickButton(driver, 7);
    Button zen6 = new JoystickButton(driver, 8);
    Button zen7 = new JoystickButton(driver, 9);
    Button zen8 = new JoystickButton(driver, 10);
    Button zen9 = new JoystickButton(driver, 11);
    Button zen10 = new JoystickButton(driver, 12);
 
    Button zen11 = new JoystickButton(operator, 1);
    Button zen12= new JoystickButton(operator, 2);
    Button zen13 = new JoystickButton(operator, 3);
    Button zen14 = new JoystickButton(operator, 4);
    Button zen15= new JoystickButton(operator, 5);
    Button zen16 = new JoystickButton(operator, 6);
    Button zen17 = new JoystickButton(operator, 7);
    Button zen18 = new JoystickButton(operator, 8);
    Button zen19 = new JoystickButton(operator, 9);
    Button zen20 = new JoystickButton(operator, 10);
    Button zen21 = new JoystickButton(operator, 11);
    Button zen2B = new JoystickButton(operator, 12);


    
  }

  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways: 

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
