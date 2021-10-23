package State;



public class MyProgram {

    public static void main(String[] args) {

        final ModeSwitch modeSwitch = new ModeSwitch();

        modeSwitch.onSwitch(); // FROM LIGHT TO DARK
        modeSwitch.onSwitch(); // FROM DARK TO LIGHT
        modeSwitch.onSwitch();
        modeSwitch.onSwitch();
    }

}
