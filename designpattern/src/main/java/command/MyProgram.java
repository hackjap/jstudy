package command;

import adapter.robot.MovieBackOrder;

public class MyProgram {

    public static void main(String[] args) {

        RobotKit robotKit = new RobotKit();

        robotKit.addCommand(new MoveForwardCommand(2));
        robotKit.addCommand(new TurnCommand(Robot.Direction.LEFT));
        robotKit.addCommand(new MoveForwardCommand(1));
        robotKit.addCommand(new TurnCommand(Robot.Direction.RIGHT));
        robotKit.addCommand(new PickupCommand());
        robotKit.addCommand(new CommandOrderAdapter(new MovieBackOrder(3)));

        robotKit.start();
    }



}
