package frc.robot.commands;

import com.spikes2212.command.genericsubsystem.commands.MoveGenericSubsystem;
import frc.robot.subsystems.TransportSpikesLib;

public class MoveTransportSpikesLib extends MoveGenericSubsystem {
    public MoveTransportSpikesLib(TransportSpikesLib transportSpikesLib, double speed) {
        super(transportSpikesLib, speed);
    }
}
