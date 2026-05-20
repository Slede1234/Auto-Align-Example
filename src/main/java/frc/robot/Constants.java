// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

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
    public static final int kDriverControllerPort = 0;
  }

  // Auto-align / reef alignment constants
  public static final double X_REEF_ALIGNMENT_P = 0.5;
  public static final double Y_REEF_ALIGNMENT_P = 0.5;
  public static final double ROT_REEF_ALIGNMENT_P = 0.5;

  public static final double ROT_SETPOINT_REEF_ALIGNMENT = 0.0;
  public static final double ROT_TOLERANCE_REEF_ALIGNMENT = 0.05;

  public static final double X_SETPOINT_REEF_ALIGNMENT = 0.0;
  public static final double X_TOLERANCE_REEF_ALIGNMENT = 0.05;

  public static final double Y_SETPOINT_REEF_ALIGNMENT = 0.0;
  public static final double Y_TOLERANCE_REEF_ALIGNMENT = 0.05;

  public static final double DONT_SEE_TAG_WAIT_TIME = 0.5; // seconds
  public static final double POSE_VALIDATION_TIME = 0.3; // seconds
}
