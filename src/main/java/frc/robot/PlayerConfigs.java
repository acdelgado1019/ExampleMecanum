package frc.robot;

public class PlayerConfigs {
    
    //drivetrain
    public static double xMovement;
    public static double yMovement;
    public static double turnMovement;
    public static double turnSpeed;
    public static double driveSpeed;
    public static boolean modeSwitch;

    //limelight
    public static boolean switchPipeline;

    public static void getDriverConfig(){
        //drivetrain
        xMovement = Robot.controller0.getLeftX();
        yMovement = Robot.controller0.getLeftY();
        turnMovement = Robot.controller0.getRightX();
        turnSpeed = 0.1;
        driveSpeed = 0.5;

        //Drivetrain change
        modeSwitch = Robot.controller0.getCircleButtonReleased();

        //limelight
        switchPipeline = Robot.controller0.getCircleButton();
    }

    public static void getCoDriverConfig(){  
    }

    
}
