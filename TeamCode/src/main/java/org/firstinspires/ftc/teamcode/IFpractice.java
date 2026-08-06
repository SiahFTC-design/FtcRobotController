package org.firstinspires.ftc.teamcode;

import android.sax.StartElementListener;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled

@TeleOp
public class IFpractice extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        boolean aButton = gamepad1.a; // press TRUE, depress FALSE
        // true or false
        boolean bButton = gamepad1.b;

        if (aButton && bButton) {
            telemetry.addData("System", "Armed");
        }
        else {
            telemetry.addData("System","On Standby");
        }



        telemetry.addData("A Button", aButton);

        telemetry.addData("B Button", bButton);

    }
}


/*
AND - && - if (leftY < o && leftY > 0) {
OR - || - (leftY < || rightY < 0) {
NOT ! - if (!clawclosed) {
 */

/*
1. Make a turbo button. If the A button is NOT pressed, mulyily the motor speed by 0.5, otherwise, sue the standard speed
 */