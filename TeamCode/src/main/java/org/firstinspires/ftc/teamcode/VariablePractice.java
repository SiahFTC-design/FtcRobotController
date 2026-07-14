package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class VariablePractice extends OpMode {
    @Override
    public void init() {
        int teamNumber = 11992;
        double motorSpeed = 0.75;
        boolean clawClosed = true;
        String teamName = "Radioactivity";
        int motorAngle = 90;


        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("motor speed", motorSpeed);
        telemetry.addData("claw closed", clawClosed);
        telemetry.addData("teamName", teamName);
        telemetry.addData("motorAngle", motorAngle);
    }

    @Override
    public void loop() {
        /*
        1. Change the String variable "name" to your team name
        2. Create an int called "motorAngle" and store an angle between 0-100. display this in your init method.
         */

    }
}
