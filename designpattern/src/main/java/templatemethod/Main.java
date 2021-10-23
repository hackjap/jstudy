package templatemethod;

public class Main {

    public static void main(String[] args) {
        AbstConnectHelper helper = new DefaultGameConnectionHelper();
        AbstConnectHelper helper2 = new DefaultGameConnectionHelper2();
        helper.requestConnection("info");
        helper2.requestConnection("info2");

    }
}
