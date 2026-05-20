package frc.robot.subsystems.Drive;

import static edu.wpi.first.units.Units.Degrees;

import java.util.Optional;

import com.pathplanner.lib.util.FlippingUtil;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Transform2d;
import edu.wpi.first.math.interpolation.InterpolatingDoubleTreeMap;
import edu.wpi.first.units.Units;
import edu.wpi.first.units.measure.Angle;
import edu.wpi.first.units.measure.Distance;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.DriverStation.Alliance;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/** Field poses + align tuning. Flip handled for blue. */
public class DriveConstants {
    public static final double maxSpeed = TunerConstants.kSpeedAt12Volts.in(Units.MetersPerSecond);
    public static final double maxAngularRate = Units.RotationsPerSecond.of(1).in(Units.RadiansPerSecond);

    public static final double stickDeadband = 0.1;

    // Teleop scaling — scale joystick [-1,1] to these fractions of max speed/rotation for safety
    public static final double TELEOP_MAX_VELOCITY_SCALE = 0.5; // 50% of maxSpeed
    public static final double TELEOP_MAX_ROTATION_SCALE = 0.5; // 50% of maxAngularRate

    public static final Angle epsilonAngleToGoal = Degrees.of(0);

    public static final PIDController rotationController = createRotationController();

    private static PIDController createRotationController() {
        PIDController controller = new PIDController(1.4, 0.0, 0.0);
        controller.enableContinuousInput(-Math.PI, Math.PI);
        return controller;
    }
}

