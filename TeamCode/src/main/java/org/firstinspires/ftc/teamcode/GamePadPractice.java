package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class GamePadPractice extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        // runs 50x* a second
        double speedForward = -gamepad1.left_stick_y / 2.0;
        double rightForward = -gamepad1.right_stick_y * 2.0;

        double xDifference = speedForward - rightForward;

        double triggerSum = gamepad1.left_trigger + gamepad1.right_trigger;

        telemetry.addData("left x",gamepad1.left_stick_x);
        telemetry.addData( "left y",speedForward);
        telemetry.addData("right x", gamepad1.right_stick_x);
        telemetry.addData("right y", rightForward);
        telemetry.addData("x difference",xDifference);

        telemetry.addData("b button", gamepad1.b);
        telemetry.addData("a button", gamepad1.a);

        telemetry.addData("left trigger", gamepad1.left_trigger);
        telemetry.addData("right trigger", gamepad1.right_trigger);
        telemetry.addData("trigger sum", triggerSum);

    }

    /* add telemetry for the right joystick
    add telemetry for the  button
    add telemetry data to report the difference between x left joystick and x right joystick
    add telemetry data to report the some of both rear triggers
     */
}
