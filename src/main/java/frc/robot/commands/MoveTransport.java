package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Transport;

public class MoveTransport extends Command {
    final double speed;
    final Transport transport;


    public MoveTransport(Transport transport, double speed) {
        addRequirements(transport);
        this.transport = transport;
        this.speed = speed;
    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        this.transport.setSpeed(this.speed);
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        this.transport.stop();
    }
}
