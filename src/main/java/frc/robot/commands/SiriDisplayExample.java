package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;

public class SiriDisplayExample extends Command {

    public SiriDisplayExample() {
        System.out.println("Hello, I am Siri! How can I assist you today?");
        double MY_DOUBLE = 42.0; // Example double value
        int MY_INT = 7; // Example integer value
        String MY_STRING = "Hello, World!"; // Example string value
        System.out.println("The value of MY_DOUBLE is: " + MY_DOUBLE);
        System.out.println("The value of MY_INT is: " + MY_INT);
        System.out.println("The value of MY_STRING is: " + MY_STRING);
    }

    // @Override
    // public void initialize() {
    //     // This is where you would put code to display a message on the robot's dashboard or console.
    //     System.out.println("Hello, I am Siri! How can I assist you today?");
    //     double MY_DOUBLE = 42.0; // Example double value
    //     int MY_INT = 7; // Example integer value
    //     String MY_STRING = "Hello, World!"; // Example string value
    //     System.out.println("The value of MY_DOUBLE is: " + MY_DOUBLE);
    //     System.out.println("The value of MY_INT is: " + MY_INT);
    //     System.out.println("The value of MY_STRING is: " + MY_STRING);
    // }

    // @Override
    // public void execute() {
    //     // This method would be called repeatedly while the command is scheduled.
    //     // You could add code here to update the display or respond to user input.
    // }

    // @Override
    // public void end(boolean interrupted) {
    //     // This method is called when the command ends or is interrupted.
    //     System.out.println("Goodbye! Siri is signing off.");
    // }

    // @Override
    // public boolean isFinished() {

    //     // This command will finish immediately after displaying the message.
    //     return true;
    // }

}


