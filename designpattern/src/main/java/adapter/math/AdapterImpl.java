package adapter.math;

public class AdapterImpl implements Adapter{


    @Override
    public Double twiceOf(Float num) {

        return Math.doubled(num.doubleValue());
    }

    @Override
    public Double halfOf(Float num) {
        return Math.half(num.doubleValue());
    }
}
