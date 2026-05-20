package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.Command;

/** Minimal ExampleSubsystem stub to satisfy project imports. */
public class ExampleSubsystem extends SubsystemBase {
  public ExampleSubsystem() {}

  public Command exampleMethodCommand() {
    return runOnce(() -> {});
  }

  public boolean exampleCondition() {
    return false;
  }
}
