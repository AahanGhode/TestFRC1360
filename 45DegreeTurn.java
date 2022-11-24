package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class 45DegreeTurn extends CommandBase {

    Drivetrain dt;
  
  
    /**
     * Creates a new TeleopDrive.
     */
    public 45DegreeTurn(Drivetrain dt) {
      // Use addRequirements() here to declare subsystem dependencies.
      this.dt = dt;
  
      addRequirements(dt);
    }
  
    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }
  
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
  
     dt.tankDrive(-1, 0);
      SmartDashboard.putBoolean("45 Degree Turn", true); 
    }
  
    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
      dt.tankDrive(0.0, 0.0);
    }
  
    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
      return false;
    }
  }