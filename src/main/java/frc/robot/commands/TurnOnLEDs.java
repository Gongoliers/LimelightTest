/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import com.thegongoliers.input.vision.LimelightCamera.LEDMode;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

/**
 * An example command.  You can replace me with your own command.
 */
public class TurnOnLEDs extends InstantCommand {
 
  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.camera.setLEDMode(LEDMode.On);
  }

}
