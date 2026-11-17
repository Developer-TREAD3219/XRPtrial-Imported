package frc.robot.commands;

import frc.robot.subsystems.LineSensor;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Arm;
import edu.wpi.first.wpilibj2.command.Command;

public class AutonomousLineDrive extends Command {
    
    public LineSensor m_LineSensor;
    public Drivetrain m_Drivetrain;
    public Arm m_Arm;

    public AutonomousLineDrive() {
    // Drive forware until a line is sensed, raise arm to 90 degrees, 
    // spin in place, then stop.
    }

    @Override
    public void initialize() {
        m_Drivetrain.arcadeDrive(0.5, 0); // Drive forward at half speed
    }

    public void execute() {
    // TO-DO!!!!!
        if (m_LineSensor.isOnLine()){
            m_Arm.setAngle(90); // Raise arm to 90 degrees
            //spin in place
            m_Drivetrain.arcadeDrive(0, 0.5); // Spin in place
            //then stop
            m_Drivetrain.arcadeDrive(0, 0); // Stop driving
        }
        else {
            m_Drivetrain.arcadeDrive(0.5, 0); // Continue driving forward
        }       
    }


    }
