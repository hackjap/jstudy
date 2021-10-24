package abstractfactory;

import abstractfactory.gt.GtFactory;
import abstractfactory.sam.SamFactory;

public class Main {

    public static void main(String[] args) {
        BikeFactory factory = new SamFactory();
        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();

        System.out.println("body = " + body.getClass());
        System.out.println("wheel = " + wheel.getClass());


        BikeFactory gtFactory = new GtFactory();
        Body gtBody = gtFactory.createBody();
        Wheel gtWheel = gtFactory.createWheel();

        System.out.println("body = " + gtBody.getClass());
        System.out.println("wheel = " + gtWheel.getClass());
    }
}
