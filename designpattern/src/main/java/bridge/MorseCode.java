package bridge;

public class MorseCode {

    private MorseCodeFunction function;

    public MorseCode(MorseCodeFunction function) {
        this.function = function;
    }
//
//    public void setFunction(MorseCodeFunction function) {
//        this.function = function;
//    }

    public void dot() {
//        System.out.print(".");
        function.dot();

    }

    public void dash() {
//        System.out.print("-");
        function.dash();
    }


    public void space() {
//        System.out.print(" ");
        function.space();

    }

}
