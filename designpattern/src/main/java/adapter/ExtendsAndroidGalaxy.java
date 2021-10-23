package adapter;


public class ExtendsAndroidGalaxy  implements ExtendsAndroid{
    @Override
    public void apply(boolean status) {
        System.out.println(
                "extends android" + (status ? " apply" : "")
        );
        // 안드로이드 확장팩 적용
    }
}
