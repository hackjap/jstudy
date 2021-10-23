package adapter.robot;

import command.Robot;

public class MovieBackOrder implements Order {

    private int block;

    // 생성자 의존성 주입
    public MovieBackOrder(int block) {
        this.block = block;
    }

    @Override
    public void run(Robot robot) {
        System.out.println("어뎁터 ");
        robot.turn(Robot.Direction.LEFT);
        robot.turn(Robot.Direction.LEFT);
        robot.moveForward(block);
    }
}
