package frc.robot.subsystems;

import com.spikes2212.command.genericsubsystem.MotoredGenericSubsystem;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;

public class TransportSpikesLib extends MotoredGenericSubsystem {

    public TransportSpikesLib(MotorController motorController) {
        super("", motorController);
    }
}
