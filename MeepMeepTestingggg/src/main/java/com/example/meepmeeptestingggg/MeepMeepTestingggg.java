package com.example.meepmeeptestingggg;

import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.TrajectoryBuilder;
import com.acmerobotics.roadrunner.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class MeepMeepTestingggg {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(800);

        RoadRunnerBotEntity myBot = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(60, 60, Math.toRadians(180), Math.toRadians(180), 15)
                .build();

     /*double r =0;
        double u =90;
        double l= 180;
        double d= 270;
*/
// WAITING CHANGES IT CUZ ACCELERATION GONE

       myBot.runAction(myBot.getDrive().actionBuilder(new Pose2d(40 , 20, Math.toRadians(0)))



                // backpack
              .splineTo(new Vector2d(50, -10), Math.toRadians(270))


              // .splineTo(new Vector2d(40, -40), Math.toRadians(180)) but looks down so we don't have to rotate it for legs
               .splineToSplineHeading(new Pose2d(40, -40, Math.toRadians(270)), Math.toRadians(180))
               .waitSeconds(1)


               // LEGS
             //  .splineTo(new Vector2d(15, -50), Math.toRadians(90))
                       .lineToY(-50)

               .splineToSplineHeading(new Pose2d(15, -50, Math.toRadians(180)), Math.toRadians(90))




                       .waitSeconds(1)

                       .lineToXLinearHeading(-5, Math.toRadians(270))

               .waitSeconds(1)

               .splineToSplineHeading(new Pose2d(-25, -50, Math.toRadians(90)), Math.toRadians(90))



























                .build());


             /*   .lineToY(30)
                .turn(Math.toRadians(90))
                .lineToX(0)
                .turn(Math.toRadians(90))
                .lineToY(0)
                .turn(Math.toRadians(90))
                .build());



              */

        meepMeep.setBackground(MeepMeep.Background.FIELD_DECODE_JUICE_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(myBot)
                .start();
    }
}