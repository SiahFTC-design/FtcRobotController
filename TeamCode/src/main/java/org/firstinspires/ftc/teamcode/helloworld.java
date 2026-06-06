package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class helloworld extends OpMode {

    @Override
    public void init() {
        telemetry.addData("hello","world");
    }

    @Override
    public void loop() {

    }

    // Single Line Comment

    /*
    1. Hello: World, change the telemetary data to display "hello: your name
    2. Run this code in the Auto section of your DS
     */
}
