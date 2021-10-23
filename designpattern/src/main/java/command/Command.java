package command;

import adapter.robot.Order;

abstract class Command {

    protected Robot robot;

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    public abstract void execute();
}

class MoveForwardCommand extends Command {

    int space;  // 매개변수를 담을 변수 선언

    public MoveForwardCommand(int space) {
        this.space = space; // 생성자를 통해 매개변수 담기
    }
    @Override
    public void execute() {
        robot.moveForward(space);
    }
}


class TurnCommand extends Command {

    Robot.Direction direction;
    public TurnCommand(Robot.Direction direction) {
        this.direction = direction;
    }
    @Override
    public void execute() {
        robot.turn(direction);
    }
}

class PickupCommand extends Command {

    @Override
    public void execute() {
        robot.pickup();
    }
}

class CommandOrderAdapter extends Command {

    private Order order;

    public CommandOrderAdapter(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.run(robot);
    }
}
