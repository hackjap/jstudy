package singleton.systemspeaker;

public class SomeSystemComponent {


    private static SomeSystemComponent instance;

    private SomeSystemComponent() {

    }

    public static SomeSystemComponent getInstance() {

        if (instance == null) {
            instance = new SomeSystemComponent();
            System.out.println("새로 생성");
        }else{
            System.out.println("이미 생성");
        }

        return instance;
    }

}
