package bridge;

public class SoundMFC implements MorseCodeFunction {


    @Override
    public void dot() {
        System.out.print("삣");

    }

    @Override
    public void dash() {

                System.out.print("삐");

    }

    @Override
    public void space() {

                System.out.print("음");


    }
}
