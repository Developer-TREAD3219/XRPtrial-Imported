package frc.robot.commands;

import frc.robot.subsystems.LineSensor;
import frc.robot.commands.DriveDistance;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.Command;

public class AutonomousLineDrive extends Command {
    
    public LineSensor m_LineSensor;
    public Drivetrain m_Drivetrain;
    public DriveDistance m_DriveDistance;

    public AutonomousLineDrive() {
// TO-DO!!!!!
//
        if (m_LineSensor.isOnLine()){
        
        }
    }
}
