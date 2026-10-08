package frc.robot.subsystems;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Transport extends SubsystemBase {
    final MotorController motorController;

    public Transport(MotorController motorController) {
        this.motorController = motorController;
    }

    public double getSpeed() {
        return this.motorController.get();
    }

    public void setSpeed(double speed) {
        this.motorController.set(speed);
    }

    public void stop() {
        this.motorController.stopMotor();
    }
}
