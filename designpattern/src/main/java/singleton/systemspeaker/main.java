package singleton.systemspeaker;

public class main {

    public static void main(String[] args) {

        SomeSystemComponent component = SomeSystemComponent.getInstance();

        SomeSystemComponent component2 = SomeSystemComponent.getInstance();

    }
}
