package abstractfactory.sam;

import abstractfactory.BikeFactory;
import abstractfactory.Body;
import abstractfactory.Wheel;

public class SamFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new SamBody();
    }

    @Override
    public Wheel createWheel() {
        return new SamWheel();
    }
}
