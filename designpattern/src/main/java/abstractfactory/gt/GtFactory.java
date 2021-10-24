package abstractfactory.gt;

import abstractfactory.BikeFactory;
import abstractfactory.Body;
import abstractfactory.Wheel;

public class GtFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new GtBody();
    }

    @Override
    public Wheel createWheel() {
        return new GtWheel();
    }
}
