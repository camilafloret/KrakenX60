// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix6.signals.NeutralModeValue;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 1;
  }
  // Drive Subsystem Constants
  public static final class DriveConstants
  {
    // Motor
    public static final int kFrontLeftId = 10; // Front Left
    
    public static final NeutralModeValue kNeutralMode = NeutralModeValue.Brake; // TalonFX

    /* Current Limiting */
    // TalonFX
    public static final int kCurrentLimit = 70; //supply current
    public static final int kCurrentThreshold = 120; //stator current
    public static final double kCurrentThresholdTime = 0.1;
    public static final boolean kEnableCurrentLimit = true;
    public static final double kClosedLoopRamp = 0.25;
    public static boolean kInverted = false;
  }
}
